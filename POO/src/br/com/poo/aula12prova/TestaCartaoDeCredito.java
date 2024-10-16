package br.com.poo.aula12prova;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {

        CartaoDeCredito cartaoAmarelo = new CartaoDeCredito();
        cartaoAmarelo.numero = 4723984;
        cartaoAmarelo.dataDeValidade = "10/10/2028";
        System.out.println("Numero do cartao de crédito amarelo: " + cartaoAmarelo.numero);
        System.out.println("Data de validade do cartao de crédito amarelo: " + cartaoAmarelo.dataDeValidade);

        System.out.println("------------------------------------");

        CartaoDeCredito cartaoVerde = new CartaoDeCredito();
        cartaoVerde.numero = 7544;
        cartaoVerde.dataDeValidade = "05/08/2027";
        System.out.println("Numero do cartao de crédito verde: " + cartaoVerde.numero);
        System.out.println("Data de validade do cartao de crédito verde: " + cartaoVerde.dataDeValidade);

    }

}
