package br.com.itau.challenge.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.model.Cotacao;
import br.com.itau.challenge.repo.CotacaoRepository;
import br.com.itau.challenge.service.producer.ProducerService;

@Service
public class QuoteService {


	@Autowired
	private ProducerService producerService;
	
	@Autowired
	private ValidacaoService validacaoService;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	private CotacaoRepository repository;
	
	public Cotacao inserirCotacao(Cotacao cotacao) {

		validacaoService.validar(cotacao);
		
		cotacao.setId(sequenceGeneratorService.generateSequence(Cotacao.SEQUENCE_NAME));
		cotacao.setInsurance_quote_id(this.getQuoteInsuranceId());
		Cotacao cotacaoSaved = repository.insert(cotacao);
		
		producerService.send(cotacaoSaved);
		
		return cotacaoSaved;
	}
	
	public List<Cotacao> obterCotacoes() {
		return repository.findAll();
	}
	
	public Cotacao obterCotacao(Long id) {
		Optional<Cotacao> optCotacao = repository.findCotacao(id);
		return optCotacao.isPresent() ? optCotacao.get() : null;
	}
	
	private long getQuoteInsuranceId() {
	    return new Random().ints(1000000, 9999999).findFirst().getAsInt();
	}
}
