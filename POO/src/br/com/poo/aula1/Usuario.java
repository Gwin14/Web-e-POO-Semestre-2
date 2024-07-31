package br.com.poo.aula1;

public class Usuario {

    String nome;
    String sobrenome;
    int idade;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
