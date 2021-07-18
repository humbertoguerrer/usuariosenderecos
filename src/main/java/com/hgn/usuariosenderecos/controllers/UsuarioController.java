package com.hgn.usuariosenderecos.controllers;

import com.hgn.usuariosenderecos.dto.UsuarioDTO;
import com.hgn.usuariosenderecos.entities.Usuario;
import com.hgn.usuariosenderecos.exceptions.UsuarioNaoEncontradoException;
import com.hgn.usuariosenderecos.services.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/usuarios")
@Api(value = "Usuários")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorId(@PathVariable Long id) {
        try {
            UsuarioDTO usuarioDTO = usuarioService.buscarPorId(id);
            return ResponseEntity.ok().body(usuarioDTO);
        } catch (NoSuchElementException e) {
            throw new UsuarioNaoEncontradoException("O usuário procurado não existe.");
        }
    }

    @PostMapping
    @ApiOperation(value = "Insere um novo usuário")
    public ResponseEntity<String> salvarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.salvarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("O usuário '" + usuarioDTO.getNome()
                + "' foi criado.");
    }
}
