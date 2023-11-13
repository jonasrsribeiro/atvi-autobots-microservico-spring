package com.autobots.automanager.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Telefone;
import com.autobots.automanager.servicos.SelecionadorPorIdTemplateMethod;

@Component
public class TelefoneSelecionador extends SelecionadorPorIdTemplateMethod<Telefone>{
    @Override
	public Telefone selecionar(List<Telefone> telefones, Long id) {
		return buscar(telefones, id);
	}
}
