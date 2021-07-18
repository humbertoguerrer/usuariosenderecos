package com.hgn.usuariosenderecos.services;

import com.hgn.usuariosenderecos.dto.UsuarioDTO;
import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.repositories.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UsuarioDTO buscarPorId(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        return toUsuarioDTO(optionalUsuario.get());
    }

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        usuarioRepository.save(toUsuario(usuarioDTO));
        return (usuarioDTO);
    }

    private Usuario toUsuario(UsuarioDTO usuarioDTO) {
        return modelMapper.map(usuarioDTO, Usuario.class);
    }

    private UsuarioDTO toUsuarioDTO(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioDTO.class);
    }
}
