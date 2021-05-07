package com.hgn.usuariosenderecos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario buscarPorId(Integer id) {
		Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
		Usuario usuario = optionalUsuario.get();
		return usuario;
	}

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
