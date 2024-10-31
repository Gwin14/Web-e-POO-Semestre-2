package br.com.poo.aula14;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("João");

        Funcionario gerente = new Funcionario();
        gerente.setNome("Maria");

        f1.setGerente(gerente);
    }

}
