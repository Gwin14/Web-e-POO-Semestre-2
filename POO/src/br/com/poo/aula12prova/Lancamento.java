package br.com.poo.aula12prova;

public class Lancamento {

    private String descricao;
    private double valor;
    private boolean pago;

    public Lancamento(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }
}
