package br.com.itau.challenge.controller;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.itau.challenge.model.Cotacao;
import br.com.itau.challenge.service.QuoteService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cotacao")
public class QuoteController {
	
	@Autowired
	private QuoteService service;
	
	@GetMapping("/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<String>(OK);
	}
	
	@PostMapping("/enviarCotacao")
	@ApiOperation(value = "Envia a cotação para o processo de emissão")
	public ResponseEntity<String> enviarCotacao(@RequestBody Cotacao cotacao) throws JsonProcessingException {
		
		Cotacao cotacaoSaved = service.inserirCotacao(cotacao);
		
		return new ResponseEntity<String>(String.format("Cotação com ID: %s salva com sucesso!", cotacaoSaved.getId()), OK); 
	}
	
	@GetMapping("/obterCotacoes")
	@ApiOperation(value = "Obtem a lista de todas as cotações da base")
	public ResponseEntity<List<Cotacao>> obterCotacoes() throws JsonProcessingException {
		
		List<Cotacao> listaCotacoes = service.obterCotacoes();
		
		if (listaCotacoes == null || listaCotacoes.isEmpty()) return new ResponseEntity<List<Cotacao>>(NO_CONTENT);
		
		return ResponseEntity.ok(listaCotacoes);
	}
	
	@GetMapping("/obterCotacao/{id}")
	@ApiOperation(value = "Obtem uma cotação específica através do ID")
	public ResponseEntity<Cotacao> obterCotacoes(@PathVariable Long id) throws JsonProcessingException {
		
		Cotacao cotacao = service.obterCotacao(id);
		
		if (cotacao == null) return new ResponseEntity<Cotacao>(NO_CONTENT);
		
		return ResponseEntity.ok(cotacao);
	}

}
