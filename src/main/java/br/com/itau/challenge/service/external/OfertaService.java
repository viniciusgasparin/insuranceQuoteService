package br.com.itau.challenge.service.external;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.service.external.base.BaseService;
import br.com.itau.challenge.service.external.dto.OfertaDTO;

@Service
public class OfertaService extends BaseService {

	
	public OfertaDTO obterOfertaPorProdutoId(String produto, String idOferta) {
		
		String url = String.format("products/%s/offers/%s", produto, idOferta);
		
		ResponseEntity<OfertaDTO> responseEntity = this.get(url, OfertaDTO.class, null);
		
		return responseEntity.getBody();
	}
}