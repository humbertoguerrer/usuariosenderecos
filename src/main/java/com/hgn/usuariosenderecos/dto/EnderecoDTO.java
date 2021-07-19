package com.hgn.usuariosenderecos.dto;

import com.hgn.usuariosenderecos.entities.Usuario;

import javax.validation.constraints.NotBlank;

public class EnderecoDTO {



    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String logradouro;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String numero;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String complemento;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String bairro;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String localidade;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String uf;

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String cep;

    private Usuario usuario;

    public EnderecoDTO() {
    }

    public EnderecoDTO(String logradouro, String numero, String complemento, String bairro, String localidade, String uf, String cep, Usuario usuario) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.cep = cep;
        this.usuario = usuario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
