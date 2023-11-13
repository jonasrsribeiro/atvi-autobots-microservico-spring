package com.autobots.automanager.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.autobots.automanager.repositorios.SelecionadorComId;

import lombok.Data;

@Data
@Entity
public class Telefone extends TemplateSelecionador implements SelecionadorComId{
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String ddd;
	@Column
	private String numero;

	@Override
	public Long getId() {
		return this.id;
	}
}