package br.com.poo.aula12prova;

public class TestaLancamento {

    public static void main(String[] args) {

        Lancamento celular = new Lancamento("Iphone 8");


        celular.setValor(2000);
        celular.setPago(false);

        System.out.println("Descrição: " + celular.getDescricao());
        System.out.println("Valor: " + celular.getValor());
        System.out.println("Foi pago: " + celular.isPago());

        System.out.println("------------------------------------");

        Lancamento carro = new Lancamento("Corsa");

        carro.setValor(25000);
        carro.setPago(true);

        System.out.println("Descrição: " + carro.getDescricao());
        System.out.println("Valor: " + carro.getValor());
        System.out.println("Foi pago: " + carro.isPago());

    }

}
