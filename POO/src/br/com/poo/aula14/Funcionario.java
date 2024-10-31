package br.com.poo.aula14;

public class Funcionario {

    private String nome;

    private Funcionario gerente;

    public void imprimir() {
        System.out.println("Nome: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
}
