package com.hgn.usuariosenderecos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.services.EnderecoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/enderecos")
@Api(value = "Endereços")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@PostMapping
	@ApiOperation(value = "Insere um novo endereço")
	public ResponseEntity<String> salvar(@Valid @RequestBody Endereco endereco) {
		enderecoService.salvar(endereco);
		return ResponseEntity.status(HttpStatus.CREATED).body("O novo endereço foi cadastrado.");
	}
}
