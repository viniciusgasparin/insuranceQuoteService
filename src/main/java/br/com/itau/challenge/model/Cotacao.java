package br.com.itau.challenge.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cotacao")
public class Cotacao {
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private Long id;
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	private String insurance_policy_id;
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	private long insurance_quote_id;
	
    public String product_id;
    
    public String offer_id;
    
    public String category;
    
    public BigDecimal total_monthly_premium_amount;
    
    public BigDecimal total_coverage_amount;
    
    public Map<String, BigDecimal> coverages;
    
    public Set<String> assistances;
    
    public Customer customer;
}