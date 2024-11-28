package com.company;

public class PessoaJuridica extends Cliente {

    private String cpf;


    public PessoaJuridica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
}
