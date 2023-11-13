package com.autobots.automanager.servicos;

import java.util.Date;
import java.util.List;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.entidades.Telefone;

public class ClienteCadastro {

    private ClienteConstrutor builder;

    public ClienteCadastro() {
        builder = new ClienteConstrutor();
    }

    public ClienteCadastro comNome(String nome) {
        builder.comNome(nome);
        return this;
    }

    public ClienteCadastro comNomeSocial(String nomeSocial) {
        builder.comNomeSocial(nomeSocial);
        return this;
    }

    public ClienteCadastro comDataNascimento(Date dataNascimento) {
        builder.comDataNascimento(dataNascimento);
        return this;
    }

    public ClienteCadastro comDataCadastro(Date dataCadastro) {
        builder.comDataCadastro(dataCadastro);
        return this;
    }

    public ClienteCadastro comDocumentos(List<Documento> documentos) {
        builder.comDocumentos(documentos);
        return this;
    }

    public ClienteCadastro comEndereco(Endereco endereco) {
        builder.comEndereco(endereco);
        return this;
    }

    public ClienteCadastro comTelefones(List<Telefone> telefones) {
        builder.comTelefones(telefones);
        return this;
    }

    public Cliente build() {
        return builder.build();
    }

    public ClienteCadastro comCliente(Cliente cliente) {
        builder.comNome(cliente.getNome());
        builder.comNomeSocial(cliente.getNomeSocial());
        builder.comDataNascimento(cliente.getDataNascimento());
        builder.comDataCadastro(cliente.getDataCadastro());
        builder.comDocumentos(cliente.getDocumentos());
        builder.comEndereco(cliente.getEndereco());
        builder.comTelefones(cliente.getTelefones());
        return this;
    }

}
