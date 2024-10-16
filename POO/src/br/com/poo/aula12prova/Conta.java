package br.com.poo.aula12prova;

public class Conta {

    private String numero;
    private double saldo;
    private double acumuladorImposto;

    public Conta(String numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println(valor + " reais foram sacados");
        acumularImposto(valor);
    }

    public void imprimeDados() {
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Imposto acumulado: " + this.acumuladorImposto);
    }

    private void acumularImposto(double valor) {
        this.acumuladorImposto += 0.35 * valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getImpostoAcumulado() {
        return acumuladorImposto;
    }
}
