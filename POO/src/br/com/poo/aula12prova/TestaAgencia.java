package br.com.poo.aula12prova;

import java.util.Scanner;

public class TestaAgencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agencia agencia1 = new Agencia();

        System.out.print("Diga o número da sua primeira agência: ");

        agencia1.numero = sc.nextInt();
        agencia1.imprimir();

        System.out.println("------------------------------------");

        Agencia agencia2 = new Agencia();

        System.out.print("Diga o número da sua segunda agência: ");

        agencia2.numero = sc.nextInt();
        agencia2.imprimir();

    }


}
