package com.hgn.usuariosenderecos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String logradouro;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String numero;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String complemento;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String bairro;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String cidade;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String estado;
	
	@NotBlank(message = "Este campo é de preenchimento obrigatório")
	private String cep;

	@ManyToOne
	@JoinTable(
		      name = "usuario_enderecos",
		      joinColumns = {@JoinColumn(name = "endereco_id")},
		      inverseJoinColumns = {@JoinColumn(name = "usuario_id")})
	private Usuario usuario;

	public Endereco() {
	}

	public Endereco(Integer id, String logradouro, String numero, String complemento, String bairro, String cidade,
			String estado, String cep, Usuario usuario) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
