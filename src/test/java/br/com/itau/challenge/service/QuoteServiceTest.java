package br.com.itau.challenge.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.common.collect.ImmutableMap;

import static com.google.common.collect.ImmutableMap.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import br.com.itau.challenge.model.Cotacao;
import br.com.itau.challenge.model.Customer;
import br.com.itau.challenge.repo.CotacaoRepository;

@ExtendWith(MockitoExtension.class)
public class QuoteServiceTest {

	@InjectMocks
	QuoteService quoteService;
	
	@Mock
	CotacaoRepository repository;
	
	Cotacao cotacao;
	
	@BeforeEach
	public void setUp() {
		
		Map<String, BigDecimal> coberturas = new HashMap<String, BigDecimal>();
		coberturas.put("Incêndio", new BigDecimal(250000.00));
		coberturas.put("Desastres naturais", new BigDecimal(500000.00));
		coberturas.put("Responsabiliadade civil", new BigDecimal(75000.00));

		Customer cliente = new Customer();
		cliente.setName("John Wick");
		cliente.setDocument_number("36205578900");
		cliente.setEmail("rodrigues.alves@uol.com.br");
		cliente.setGender("Male");
		cliente.setPhone_number(1195050303);
		cliente.setType("Natural");
		
		cotacao = new Cotacao();
		cotacao.setId(1L);
		cotacao.setAssistances(new HashSet<>(Arrays.asList("Encanador", "Eletricista", "Chaveiro 24h")));
		cotacao.setCoverages(coberturas);
		cotacao.setCategory("HOME");
		cotacao.setCustomer(cliente);
		cotacao.setInsurance_quote_id(Long.valueOf(454697879));
		cotacao.setOffer_id("adc56d77-348c-4bf0-908f-22d402ee715c");
		cotacao.setProduct_id("1b2da7cc-b367-4196-8a78-9cfeec21f587");
		cotacao.setTotal_coverage_amount(new BigDecimal(825000.00));
		cotacao.setTotal_monthly_premium_amount(new BigDecimal(85.25));
		
	}
	
	@Test
	void buscarCotacaoComSucesso() {
		
		when(repository.findCotacao(1L)).thenReturn(Optional.of(cotacao));
		
		Cotacao retornoCotacao = quoteService.obterCotacao(1L);
		
		assertEquals(cotacao, retornoCotacao);
		verify(repository).findCotacao(1L);
		verifyNoMoreInteractions(repository);
	}
}
