package com.autobots.automanager.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.servicos.SelecionadorPorIdTemplateMethod;

@Component
public class EnderecoSelecionador extends SelecionadorPorIdTemplateMethod<Endereco> {
	@Override
	public Endereco selecionar(List<Endereco> enderecos, Long id) {
		return buscar(enderecos, id);
	}
	
}