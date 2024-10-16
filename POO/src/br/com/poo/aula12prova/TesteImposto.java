package br.com.poo.aula12prova;

public class TesteImposto {

    public static void main(String[] args) {

        Conta conta1 = new Conta("111");

        conta1.depositar(200.00);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.sacar(20.00);
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Imposto acumulado: " + conta1.getImpostoAcumulado());
        conta1.sacar(60.00);
        conta1.imprimeDados();

        System.out.println("------------------------------------");

        Conta conta2 = new Conta("222");

        conta2.depositar(3400.00);
        System.out.println("Saldo: " + conta2.getSaldo());
        conta2.sacar(270.65);
        System.out.println("Saldo: " + conta2.getSaldo());
        System.out.println("Imposto acumulado: " + conta2.getImpostoAcumulado());
        conta2.sacar(323.90);
        conta2.imprimeDados();

    }
}
