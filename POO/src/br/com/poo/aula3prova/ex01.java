package br.com.poo.aula3prova;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtdSaques = 0;
        String nome = "";
        double valor = 0;

        while (true) {

            System.out.print("Diga seu nome: ");
            nome = sc.next();

            try {
                if (nome.length() < 2) {
                    throw new Exception("Um nome com pelo menos duas letras!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        while (true) {

            System.out.print("Diga o valor inicial para ser depositado na conta: ");
            valor = sc.nextDouble();
            try {
                if (valor < 0) {
                    throw new Exception("O depósito deve ser um número positivo!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


        while (valor > 0) {

            System.out.println(nome + ", seu saldo é de: " + valor);

            try {
                System.out.print("Diga um valor para sacar: ");
                double saque = sc.nextDouble();

                if (saque < 1) {
                    throw new Exception("O saque deve ser um número positivo!");

                }

                if (saque > valor) {
                    saque = valor;
                }
                valor -= saque;
                qtdSaques++;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Sistema encerrado.");

        System.out.println(nome + ", seu saldo é de: " + valor);
        System.out.println("Quantidade de saques: " + qtdSaques);

    }

}
