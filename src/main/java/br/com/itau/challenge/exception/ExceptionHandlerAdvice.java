package br.com.itau.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

	
	@ExceptionHandler(DadosIncorretosException.class)
	public ResponseEntity<String> handlerDadosIncorretos(Exception exception) {
		
		DadosIncorretosException ex = (DadosIncorretosException) exception;
		
		return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(ex.getMessage());
	}
	
}
