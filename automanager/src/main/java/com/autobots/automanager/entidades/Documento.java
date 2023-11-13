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
public class Documento extends TemplateSelecionador implements SelecionadorComId{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String tipo;
	@Column(unique = true)
	private String numero;
    public void forEach(Object object) {
    }

	@Override
	public Long getId() {
		return this.id;
	}
}