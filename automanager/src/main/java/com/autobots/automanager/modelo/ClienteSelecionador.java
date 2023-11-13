package com.autobots.automanager.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.servicos.SelecionadorPorIdTemplateMethod;

@Component
public class ClienteSelecionador extends SelecionadorPorIdTemplateMethod<Cliente> {
	@Override
	public Cliente selecionar(List<Cliente> clientes, Long id) {
		return buscar(clientes, id);
	}
	
}