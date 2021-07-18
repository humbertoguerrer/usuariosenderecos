package com.hgn.usuariosenderecos.services;

import com.hgn.usuariosenderecos.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hgn.usuariosenderecos.entities.Endereco;

@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {

    @GetMapping("{cep}/json")
    EnderecoDTO buscaEnderecoCEP(@PathVariable("cep") String cep);
}
