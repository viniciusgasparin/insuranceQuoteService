package br.com.itau.challenge.service.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.itausegdev.policies.schemas.insurance_policy_emitted.InsurancePolicyEmitted;



@Service
public class ConsumerService {


	
    @KafkaListener(topics = "${topic.emitted.name}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(ConsumerRecord<String, InsurancePolicyEmitted> record){
    	
    	System.out.println(record);
    }
}
