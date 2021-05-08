package com.hgn.usuariosenderecos.controllers;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.exceptions.UsuarioNaoEncontradoException;
import com.hgn.usuariosenderecos.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/usuarios")
@Api(value = "Usuários")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id) {
		try {
			Usuario usuario = usuarioService.buscarPorId(id);
			return ResponseEntity.ok().body(usuario);
		} catch (NoSuchElementException e) {
			throw new UsuarioNaoEncontradoException("O usuário procurado não existe.");
		}
	}

	@PostMapping
	@ApiOperation(value = "Insere um novo usuário")
	public ResponseEntity<String> salvar(@Valid @RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body("O usuário '" + usuario.getNome() + "' foi criado.");
	}
}
