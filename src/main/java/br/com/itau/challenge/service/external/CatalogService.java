package br.com.itau.challenge.service.external;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.service.external.base.BaseService;
import br.com.itau.challenge.service.external.base.CustomPageImpl;
import br.com.itau.challenge.service.external.dto.CategoriasDTO;

@Service
public class CatalogService extends BaseService {

	
	public List<CategoriasDTO> obterCategorias() {
		
		ResponseEntity<CustomPageImpl<CategoriasDTO>> responseEntity = this.get("categories", new ParameterizedTypeReference<CustomPageImpl<CategoriasDTO>>() {}, null);
		
		return responseEntity.getBody().getContent();
	}
}