package br.com.itau.challenge.service.external.dto;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO{
	
    public String id;
    
    public String description;
    
    public String category;
    
    public boolean active;
    
    public LocalDateTime created_at;
}