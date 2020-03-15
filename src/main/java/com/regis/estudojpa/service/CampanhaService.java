package com.regis.estudojpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.estudojpa.dto.CampanhaDTO;
import com.regis.estudojpa.model.Campanha;
import com.regis.estudojpa.repository.CampanhaRepository;

@Service
public class CampanhaService {

	@Autowired
	private CampanhaRepository campanhaRepository;
	
	public Campanha listarIdEDescricao(long id) {
		Campanha campanha = campanhaRepository.buscarIdEDescricao(id);
		
//		Campanha campanha = new Campanha();
//		campanha.setId(campanhaDto.getId());
//		campanha.setDescricaocampanha(campanhaDto.getDescricaoproduto());

		return campanha;
	}
	
}