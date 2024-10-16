package br.com.poo.aula12prova;

import java.util.Scanner;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartaoDeCredito cartaoAmarelo = new CartaoDeCredito();

        System.out.print("Diga o numero para o cartao amarelo: ");
        cartaoAmarelo.numero = sc.nextInt();

        System.out.print("Diga a data de validade para o cartao amarelo: ");
        cartaoAmarelo.dataDeValidade = sc.next();

        System.out.println("Numero do cartao de crédito amarelo: " + cartaoAmarelo.numero);
        System.out.println("Data de validade do cartao de crédito amarelo: " + cartaoAmarelo.dataDeValidade);

        System.out.println("------------------------------------");

        CartaoDeCredito cartaoVerde = new CartaoDeCredito();

        System.out.print("Diga o numero para o cartao verde: ");
        cartaoVerde.numero = sc.nextInt();

        System.out.print("Diga a data de validade para o cartao verde: ");
        cartaoVerde.dataDeValidade = sc.next();

        System.out.println("Numero do cartao de crédito verde: " + cartaoVerde.numero);
        System.out.println("Data de validade do cartao de crédito verde: " + cartaoVerde.dataDeValidade);

    }

}
