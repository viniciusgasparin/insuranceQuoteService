package br.com.itau.challenge.service;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import br.com.itau.challenge.exception.DadosIncorretosException;
import br.com.itau.challenge.model.Cotacao;
import br.com.itau.challenge.service.external.OfertaService;
import br.com.itau.challenge.service.external.ProdutoService;
import br.com.itau.challenge.service.external.dto.OfertaDTO;
import br.com.itau.challenge.service.external.dto.ProdutoDTO;

@Service
public class ValidacaoService {

	@Autowired
	private OfertaService ofertaService;
	
	@Autowired
	private ProdutoService produtoService;
	
	public void validar(Cotacao cotacao){
		
		this.validarCamposObrigatorios(cotacao);
		
		ProdutoDTO produto = produtoService.obterProdutoId(cotacao.getProduct_id());
		if (produto == null ) throw new DadosIncorretosException("Produto inexistente");
		if (!produto.isActive() ) throw new DadosIncorretosException("Produto inativo");
		
		
		OfertaDTO oferta = ofertaService.obterOfertaPorProdutoId(cotacao.getProduct_id(), cotacao.getOffer_id());
		if (oferta == null ) throw new DadosIncorretosException("Oferta inexistente");
		if (!oferta.isActive() ) throw new DadosIncorretosException("Oferta inativa");
		
		this.validarOferta(cotacao);
		
	}
	
	private void validarCamposObrigatorios(Cotacao cotacao) {
		
		try {
			Assert.notNull(cotacao.getOffer_id(), "Id oferta não pode ser vazia");
		} catch (Exception e) {
			
			throw new DadosIncorretosException("Campos obrigatorios não informados");
		}
		
	}
	
	private void validarOferta(Cotacao cotacao) {
	
		OfertaDTO oferta = ofertaService.obterOfertaPorProdutoId(cotacao.getProduct_id(), cotacao.getOffer_id());
		
		this.validarListas(oferta.getCoverages().keySet(), cotacao.getCoverages().keySet(), "Coberturas");
		
		this.validarListas(oferta.getAssistances(), cotacao.getAssistances(), "Assistências");
		
		this.validarPremioMensal(cotacao, oferta);
		
		this.validarValoresCoberturas(cotacao);
	}
	
	private void validarListas(Set<String> listaOferta, Set<String> listaCotacao, String validacao) {
		
		boolean listasDoMesmoTamanho = listaOferta.size() == listaCotacao.size();
		boolean coberturasExistemNaOferta = listaOferta.stream().allMatch(listaCotacao::contains);
		
		if(!listasDoMesmoTamanho || !coberturasExistemNaOferta) 
			throw new DadosIncorretosException(String.format("%s informadas diferentes da oferta", validacao));
		
	}
	
	private void validarPremioMensal(Cotacao cotacao, OfertaDTO oferta) {
		
		BigDecimal premioMensal = cotacao.getTotal_monthly_premium_amount();
		
		if (premioMensal.compareTo(oferta.getMin_amount()) < 0)
			throw new DadosIncorretosException("Prêmio mensal menor do que o limite mínimo da oferta");
		
		if (premioMensal.compareTo(oferta.getMax_amount()) > 0)
			throw new DadosIncorretosException("Prêmio mensal maior do que o limite máximo da oferta");
	}
	
	private void validarValoresCoberturas(Cotacao cotacao) {
		
		BigDecimal totalCoberturasCotacao = cotacao.getCoverages().values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		
		if (totalCoberturasCotacao.compareTo(cotacao.getTotal_coverage_amount()) != 0)
			throw new DadosIncorretosException("Valor total das coberturas não corresponde com o total das coberturas informadas");
	}

}
