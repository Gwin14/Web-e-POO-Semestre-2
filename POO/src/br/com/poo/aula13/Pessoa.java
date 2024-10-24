package br.com.poo.aula13;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private List<Endereco> enderecos = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void adicionarEndereco(String logradouro, Cidade palhoca) {
        this.enderecos.add(new Endereco(logradouro));
    }

    public void mostrarDados() {
        System.out.println(this.nome);
        for (Endereco x : enderecos) {
            System.out.println(x);
        }
    }
}
