package com.hgn.usuariosenderecos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/usuarios")
@Api(value = "Usuários")
//@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	@ResponseStatus
	@ApiOperation(value = "Insere um novo usuário")
	public ResponseEntity<String> salvar(@Valid @RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body("O novo usuário foi criado");
	}

}
