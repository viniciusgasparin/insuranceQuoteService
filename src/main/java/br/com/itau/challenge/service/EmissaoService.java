package br.com.itau.challenge.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.dto.EmissaoDTO;
import br.com.itau.challenge.model.Cotacao;
import br.com.itau.challenge.repo.CotacaoRepository;

@Service
public class EmissaoService {

	@Autowired
	private CotacaoRepository repository;
	
	public void finalizarEmissao(EmissaoDTO emissaoDTO) {
		
		Long idCotacao = emissaoDTO.getId();
		
		Optional<Cotacao> cotacao = repository.findCotacao(idCotacao);
		
		if(cotacao.isPresent()) {
			
			Cotacao cotacaoDB = cotacao.get();
			
			cotacaoDB.setInsurance_policy_id(emissaoDTO.getInsurancePolicyId());
			
			repository.save(cotacaoDB);
			
			System.out.println("Cotacao salva com sucesso");
			
		} else {
			System.out.println("Cotacao não encontraca");
		}
	}
}
