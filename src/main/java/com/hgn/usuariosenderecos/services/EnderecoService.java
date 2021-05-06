package com.hgn.usuariosenderecos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public List<Endereco> listarTodos() {
		return enderecoRepository.findAll();
	}
}
