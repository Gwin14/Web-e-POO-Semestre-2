package br.com.poo.aula10;

public class Aeronave {

    public int totalAssentos;
    public int assentosReservados;

    public void reservarAssentos(int numeroAssentos) {
        int qtdAssentosDisponiveis = this.calcularAssentosDisponiveis();

        if (qtdAssentosDisponiveis <= numeroAssentos) {
            throw new IllegalArgumentException("O número máximo de assentos disponíveis é: " + qtdAssentosDisponiveis);
        }

        assentosReservados += numeroAssentos;
    }

    public int calcularAssentosDisponiveis() {
        return 0;
    }

}
