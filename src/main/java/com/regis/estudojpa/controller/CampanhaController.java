package com.regis.estudojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.estudojpa.model.Campanha;
import com.regis.estudojpa.service.CampanhaService;

@RestController
@RequestMapping(value = "/campanhas")
public class CampanhaController {

	@Autowired
	private CampanhaService campanhaService;
	
	@GetMapping(value = "/{id}")
	public Campanha listarIDEDescricao(@PathVariable long id) {
		return campanhaService.listarIdEDescricao(id);
	}
	
}