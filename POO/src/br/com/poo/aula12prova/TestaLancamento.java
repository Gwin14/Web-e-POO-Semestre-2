package br.com.poo.aula12prova;

import java.util.Scanner;

public class TestaLancamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lancamento celular = new Lancamento("Iphone 8");

        System.out.print("Diga o valor para o celular: ");
        double valorCelular = sc.nextDouble();

        System.out.print("Diga se o celular foi pago (S ou N): ");
        String pagoCelular = sc.next();

        celular.setValor(valorCelular);

        celular.setPago(pagoCelular.equalsIgnoreCase("S"));

        System.out.println("Descrição: " + celular.getDescricao());
        System.out.println("Valor: " + celular.getValor());
        System.out.println("Foi pago: " + celular.isPago());

        System.out.println("------------------------------------");

        Lancamento carro = new Lancamento("Corsa");

        System.out.print("Diga o valor para o carro: ");
        double valorCarro = sc.nextDouble();

        System.out.print("Diga se o carro foi pago (S ou N): ");
        String pagoCarro = sc.next();

        carro.setValor(valorCarro);

        carro.setPago(pagoCarro.equalsIgnoreCase("S"));

        System.out.println("Descrição: " + carro.getDescricao());
        System.out.println("Valor: " + carro.getValor());
        System.out.println("Foi pago: " + carro.isPago());

    }

}
