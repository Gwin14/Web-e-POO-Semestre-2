package br.com.poo.aula10;

public class ProdutoEstoque {

    private String nome;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEstoque() {
        this.estoque--;
    }

    public void retirarEstoque() {
        this.estoque++;
    }

    public void verificarEstoqueMinimo() {
        if (this.estoque > 5) {
            System.out.println("O estoque está acima de 5.");
        } else if (this.estoque < 5) {
            System.out.println("O estoque está abaixo de 5.");
        } else {
            System.out.println("O estoque está no seu limite (5).");
        }
    }
}
