package br.com.poo.aula12prova;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        System.out.print("Diga o nome do primeiro cliente: ");
        cliente1.nome = sc.next();

        System.out.print("Diga o codigo do primeiro cliente: ");
        cliente1.codigo = sc.nextInt();

        System.out.println("Nome do cliente 1: " + cliente1.nome);
        System.out.println("Código do cliente 1: " + cliente1.codigo);

        System.out.println("------------------------------------");

        Cliente cliente2 = new Cliente();

        System.out.print("Diga o nome do segundo cliente: ");
        cliente2.nome = sc.next();

        System.out.print("Diga o codigo do segundo cliente: ");
        cliente2.codigo = sc.nextInt();

        System.out.println("Nome do cliente 2: " + cliente2.nome);
        System.out.println("Código do cliente 2: " + cliente2.codigo);
    }

}
