package br.com.itau.challenge.service.external.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriasDTO {
    	
    private boolean active;
    
    private String id;
    
    private String description;
    
    private Date created_at;
	
}
