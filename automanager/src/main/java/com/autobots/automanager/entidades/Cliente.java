package com.autobots.automanager.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.autobots.automanager.repositorios.SelecionadorComId;

import lombok.Data;

@Data
@Entity
public class Cliente extends TemplateSelecionador implements SelecionadorComId {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@Column
	private String nomeSocial;
	@Column
	private Date dataNascimento;
	@Column
	private Date dataCadastro;

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Documento> documentos = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Endereco endereco;

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome, String nomeSocial, Date dataNascimento, Date dataCadastro, List<Documento> documentos,
			Endereco endereco, List<Telefone> telefones) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.documentos = documentos;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	@Override
	public Long getId() {
		return this.id;
	}

}