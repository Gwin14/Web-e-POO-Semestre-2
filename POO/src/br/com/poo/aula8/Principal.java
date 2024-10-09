package br.com.poo.aula8;

public class Principal {

    public static void main(String[] args) {

//        String nomePessoa1 = "fabio";
//        int idade = 33;
//
//        Pessoa fabio = new Pessoa();
//
//        fabio.nome = nomePessoa1;
//        fabio.altura = 1.83;
//        fabio.idade = idade;
//        fabio.peso = 60.0;

        Pessoa irineu = new Pessoa();

        Carro meuCarro = new Carro("volksvagem", "camaro", "amarelo", "gasolina", 1903, 103387);

        meuCarro.Ligar();
        meuCarro.MudarMarcha();
        meuCarro.Acelerar();
        meuCarro.Desligar();


    }

}
