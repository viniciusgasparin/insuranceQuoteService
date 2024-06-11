package br.com.itau.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class InsuranceQuoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceQuoteServiceApplication.class, args);
	}

}
