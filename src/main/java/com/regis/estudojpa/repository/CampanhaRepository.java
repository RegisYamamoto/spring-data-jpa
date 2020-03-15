package com.regis.estudojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.regis.estudojpa.model.Campanha;

@Repository
public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
	
	@Query(value = "SELECT new com.regis.estudojpa.model.Campanha(c.id, c.descricaoproduto) FROM Campanha c WHERE c.id = ?1")
	Campanha buscarIdEDescricao(long id);
	
}