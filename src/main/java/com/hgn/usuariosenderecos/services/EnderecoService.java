package com.hgn.usuariosenderecos.services;

import com.hgn.usuariosenderecos.dto.EnderecoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgn.usuariosenderecos.entities.Endereco;
import com.hgn.usuariosenderecos.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ModelMapper modelMapper;

	public EnderecoDTO salvar(EnderecoDTO enderecoDTO) {
		enderecoRepository.save(toEndereco(enderecoDTO));
		return enderecoDTO;
	}

	private Endereco toEndereco(EnderecoDTO enderecoDTO) {
		return modelMapper.map(enderecoDTO, Endereco.class);
	}


}
