package com.hgn.usuariosenderecos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.services.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	@ResponseStatus
	public ResponseEntity<String> salvar(@RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body("O novo usuário foi criado");
	}

}
