package br.com.itau.challenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer{
	
    public String document_number;
    
    public String name;
    
    public String type;
    
    public String gender;
    
    public String date_of_birth;
    
    public String email;
    
    public long phone_number;
}