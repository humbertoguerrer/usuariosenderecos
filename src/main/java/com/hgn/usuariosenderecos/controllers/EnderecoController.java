package com.hgn.usuariosenderecos.controllers;

import javax.validation.Valid;

import com.hgn.usuariosenderecos.dto.EnderecoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.services.CepService;
import com.hgn.usuariosenderecos.services.EnderecoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/enderecos")
@Api(value = "Endereços")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@Autowired
	private CepService cepService;

	@PostMapping
	@ApiOperation(value = "Insere um novo endereço")
	public ResponseEntity<String> salvar(@Valid @RequestBody EnderecoDTO enderecoDTO) {
		enderecoService.salvar(enderecoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("O novo endereço foi cadastrado.");
	}

	@GetMapping("/{cep}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Retorna um endereço buscado através da API do VIACEP")
	public ResponseEntity<EnderecoDTO> getCep(@PathVariable String cep) {
		EnderecoDTO enderecoDTO = cepService.buscaEnderecoCEP(cep);
		return ResponseEntity.ok().body(enderecoDTO);

	}

}
