package br.com.itau.challenge.service.external.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomPageImpl<T> extends PageImpl<T> {
	
	private static final long serialVersionUID = 1L;

	@JsonCreator(mode = PROPERTIES)
    public CustomPageImpl(@JsonProperty("data") List<T> content, 
    		@JsonProperty("page_number") int number,
    		@JsonProperty("page_size") int size, 
    		@JsonProperty("number_of_elements") Long numberOfElements,
    		@JsonProperty("total_pages") Long totalPages,
    		@JsonProperty("total_elements") Long totalElements,
    		@JsonProperty("first") boolean first,
    		@JsonProperty("last") boolean last,
    		@JsonProperty("empty") boolean empty,
    		@JsonProperty("has_next") boolean hasNext, 
    		@JsonProperty("has_previous") boolean hasPrevious) {
		
        super(content, PageRequest.of(number, 1), 10);
    }

    public CustomPageImpl(List<T> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public CustomPageImpl(List<T> content) {
        super(content);
    }

    public CustomPageImpl() {
        super(new ArrayList<>());
    }
}