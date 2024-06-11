package br.com.itau.challenge.exception;

import lombok.Getter;

@Getter
public class DadosIncorretosException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public DadosIncorretosException(String message) {
		this.message = message;
	}
	
}
