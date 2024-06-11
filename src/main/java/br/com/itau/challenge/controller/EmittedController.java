package br.com.itau.challenge.controller;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.challenge.dto.EmissaoDTO;
import br.com.itau.challenge.service.EmissaoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/emissao")
public class EmittedController {
	
	@Autowired
	private EmissaoService emissaoService;
	
	@PutMapping("/emitirCotacao")
	@ApiOperation(value = "Método utilizado para testar o processo de consumo da mensagem do tópico 'itausegdev-insurance-policy-emitted'")
	public ResponseEntity<String> emitir(@RequestBody EmissaoDTO emissaoDTO) {
		
		emissaoService.finalizarEmissao(emissaoDTO);
		
		return new ResponseEntity<String>("Cotação emitida com sucesso!", OK); 
	}

}
