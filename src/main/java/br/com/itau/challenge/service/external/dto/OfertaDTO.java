package br.com.itau.challenge.service.external.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfertaDTO{
	
    public boolean active;
    
    public String id;
    
    public String product_id;
    
    public String description;
    
    public LocalDateTime created_at;
    
    public BigDecimal min_amount;
    
    public BigDecimal max_amount;
    
    public BigDecimal suggested_amount;
    
    public Map<String, BigDecimal> coverages;
    
    public Set<String> assistances;
}
