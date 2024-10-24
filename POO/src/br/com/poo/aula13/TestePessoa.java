package br.com.poo.aula13;

public class TestePessoa {

    public static void main(String[] args) {

        Estado sc = new Estado("SC");
        Cidade palhoca = new Cidade("Palhoça", sc);
        sc.adicionarCidade(palhoca);

        Pessoa fabio = new Pessoa();
        fabio.setNome("Fábio");
        fabio.adicionarEndereco("Pinheira", palhoca);
        fabio.adicionarEndereco("Guarda ", palhoca);

        fabio.mostrarDados();

    }

}
