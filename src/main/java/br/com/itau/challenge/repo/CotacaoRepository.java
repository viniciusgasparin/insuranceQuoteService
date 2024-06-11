package br.com.itau.challenge.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.itau.challenge.model.Cotacao;


public interface CotacaoRepository extends MongoRepository<Cotacao, String>{
	
	@Query("{'id' :?0 }")
	Optional<Cotacao> findCotacao(Long id);

}
