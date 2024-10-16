package br.com.poo.aula12prova;

import java.util.Scanner;

public class TesteImposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta("111");

        System.out.print("Diga o valor para depositar na conta 1: ");
        double valorDep1 = sc.nextDouble();
        conta1.depositar(valorDep1);

        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.print("Diga o valor para sacar da conta 1: ");
        double valorsaq1 = sc.nextDouble();
        conta1.sacar(valorsaq1);

        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Imposto acumulado: " + conta1.getImpostoAcumulado());

        System.out.print("Diga o valor para sacar da conta 1: ");
        valorsaq1 = sc.nextDouble();
        conta1.sacar(valorsaq1);

        conta1.imprimeDados();

        System.out.println("------------------------------------");

        Conta conta2 = new Conta("222");

        System.out.print("Diga o valor para depositar na conta 2: ");
        double valorDep2 = sc.nextDouble();
        conta2.depositar(valorDep2);

        System.out.println("Saldo: " + conta2.getSaldo());

        System.out.print("Diga o valor para sacar da conta 2: ");
        double valorsaq2 = sc.nextDouble();
        conta2.sacar(valorsaq2);

        System.out.println("Saldo: " + conta2.getSaldo());
        System.out.println("Imposto acumulado: " + conta2.getImpostoAcumulado());

        System.out.print("Diga o valor para sacar da conta 2: ");
        valorsaq2 = sc.nextDouble();
        conta2.sacar(valorsaq2);

        conta2.imprimeDados();

    }
}
