package com.hgn.usuariosenderecos.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

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

	@JsonIgnore
	@ManyToOne
	@JoinTable(name = "usuario_enderecos", joinColumns = { @JoinColumn(name = "endereco_id") }, inverseJoinColumns = {
			@JoinColumn(name = "usuario_id") })
	private Usuario usuario;

	public Endereco() {
	}

	public Endereco(Integer id, String logradouro, String numero, String complemento, String bairro, String localidade,
			String uf, String cep, Usuario usuario) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.cep = cep;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
