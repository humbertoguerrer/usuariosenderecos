package com.hgn.usuariosenderecos.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hgn.usuariosenderecos.entities.Endereco;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioDTO {

    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String nome;

    @Email(message = "Digite um e-mail válido.")
    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String email;

    @CPF(message = "Digite um CPF válido.")
    @NotBlank(message = "Este campo é de preenchimento obrigatório.")
    private String cpf;

    @NotNull
    @Past(message = "A data deve estar no passado.")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    private List<Endereco> enderecos = new ArrayList<>();

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nome, String email, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}