package br.com.itau.challenge.service.producer;


import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.model.Cotacao;
import br.itausegdev.quotes.schemas.insurance_quote_received.Category;
import br.itausegdev.quotes.schemas.insurance_quote_received.Customer;
import br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProducerService {

	@Value("${topic.received.name}")
    String topicName;

    @Autowired
    private KafkaTemplate<String, InsuranceQuoteReceived> kafkaTemplate;

    public void send(Cotacao cotacao){
       
    	InsuranceQuoteReceived message = this.convertMessage(cotacao);
    	    	
    	try {
    		
			kafkaTemplate.send(topicName, String.valueOf(cotacao.getId()), message);
			
		} catch (Exception e) {
			log.error("Erro ao enviar mensagem para o Kafka", e);
		}
    	
    	
    }
    
    private InsuranceQuoteReceived convertMessage(Cotacao cotacao) {
    	
    	Customer customer = Customer.newBuilder()
    			.setDocumentNumber(cotacao.getCustomer().getDocument_number())
    			.setName(cotacao.getCustomer().getName())    			
    			.build();
    	
    	InsuranceQuoteReceived emitted = InsuranceQuoteReceived.newBuilder()
    			.setId(cotacao.getId())
    			.setAssistances(new ArrayList<>(cotacao.getAssistances()))
    			.setCategory(Category.valueOf(cotacao.getCategory()))
    			.setCoverages(cotacao.getCoverages())
    			.setCreatedAt(LocalDateTime.now())
    			.setCustomer(customer)
    			.setOfferId(cotacao.getOffer_id())
    			.setProductId(cotacao.getProduct_id())
    			.setTotalCoverageAmount(cotacao.getTotal_coverage_amount())
    			.setTotalMonthlyPremiumAmount(cotacao.getTotal_monthly_premium_amount())
    			.build(); 			
    	
    	return emitted;
    }

}
