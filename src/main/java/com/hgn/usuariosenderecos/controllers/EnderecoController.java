package com.hgn.usuariosenderecos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.services.EnderecoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/enderecos")
@Api(value = "Endereços")
//@CrossOrigin(origins = "*")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@GetMapping
	@ApiOperation(value = "Retorna todos os endereços cadastrados")
	public ResponseEntity<List<Endereco>> listarTodos() {
		List<Endereco> todosEnderecos = enderecoService.listarTodos();
		return ResponseEntity.ok().body(todosEnderecos);
	}
}
