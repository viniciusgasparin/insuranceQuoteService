package br.com.itau.challenge.service.external.base;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BaseService {

	@Value("${catalog.service.endpoint}")
    private String endpointService;
	
	
	
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	protected String getEndpoint() {
		return endpointService;
	}
	
	protected <T> ResponseEntity<T> get(String url, Class<T> returnType, Object body) {
		
		ResponseEntity<T> exchange; 
		
		try {
			
			exchange = getRestTemplate().exchange(endpointService.concat(url), HttpMethod.GET, httpEntity(body), returnType);
		} catch (Exception e) {
			return null;
		}
		
		return exchange;
	}
	
	protected <T> ResponseEntity<T> get(String url, ParameterizedTypeReference<T> returnType, Object body) {
		
		return getRestTemplate().exchange(endpointService.concat(url), HttpMethod.GET, httpEntity(body), returnType);
	}
	
	private HttpEntity<?> httpEntity(Object entrada) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.ALL));
		return new HttpEntity<>(entrada, headers);
	}
	
}
