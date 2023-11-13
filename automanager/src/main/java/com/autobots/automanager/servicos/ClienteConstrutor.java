package com.autobots.automanager.servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.entidades.Telefone;

public class ClienteConstrutor {
    private String nome;
    private String nomeSocial;
    private Date dataNascimento;
    private Date dataCadastro;
    private List<Documento> documentos = new ArrayList<>();
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<>();

    public ClienteConstrutor comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteConstrutor comNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
        return this;
    }

    public ClienteConstrutor comDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public ClienteConstrutor comDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }


    public ClienteConstrutor comEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public ClienteConstrutor comDocumentos(List<Documento> documentos) {
        this.documentos.addAll(documentos);
        return this;
    }
    
    public ClienteConstrutor comTelefones(List<Telefone> telefones) {
        this.telefones.addAll(telefones);
        return this;
    }

    public Cliente build() {
        return new Cliente(
            nome,
            nomeSocial,
            dataNascimento,
            dataCadastro,
            documentos,
            endereco,
            telefones
        );
    }
}
