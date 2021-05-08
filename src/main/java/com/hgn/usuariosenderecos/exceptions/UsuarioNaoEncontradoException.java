package com.hgn.usuariosenderecos.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends NoSuchElementException {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoEncontradoException(String messagem) {
		super(messagem);
	}
}
