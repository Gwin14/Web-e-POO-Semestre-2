package br.com.poo.aula10;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadoraCientifica = new Calculadora();

        int soma = calculadoraCientifica.somar(5, 8);

        System.out.println(soma);
    }

}
