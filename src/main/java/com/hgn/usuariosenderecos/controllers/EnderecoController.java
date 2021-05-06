package com.hgn.usuariosenderecos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@GetMapping
	public ResponseEntity<List<Endereco>> listarTodos() {
		List<Endereco> todosEnderecos = enderecoService.listarTodos();
		return ResponseEntity.ok().body(todosEnderecos);
	}
}
