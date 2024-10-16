package br.com.poo.aula12prova;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "João";
        cliente1.codigo = 312721;
        System.out.println("Nome do cliente 1: " + cliente1.nome);
        System.out.println("Código do cliente 1: " + cliente1.codigo);

        System.out.println("------------------------------------");

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        cliente2.codigo = 5943875;
        System.out.println("Nome do cliente 2: " + cliente2.nome);
        System.out.println("Código do cliente 2: " + cliente2.codigo);
    }

}
