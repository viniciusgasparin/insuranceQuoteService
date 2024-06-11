package br.com.itau.challenge.service.external;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.itau.challenge.service.external.base.BaseService;
import br.com.itau.challenge.service.external.dto.ProdutoDTO;

@Service
public class ProdutoService extends BaseService {

	
	public ProdutoDTO obterProdutoId(String idProduto) {
		
		String url = String.format("products/%s", idProduto);
		
		ResponseEntity<ProdutoDTO> responseEntity = this.get(url, ProdutoDTO.class, null);
		
		return responseEntity == null ? null : responseEntity.getBody();
	}
}