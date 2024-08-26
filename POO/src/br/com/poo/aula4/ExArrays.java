package br.com.poo.aula4;

public class ExArrays {

    public static void main(String[] args) {
        int notas[] = new int[]{1, 3, 6, 3, 8, 9, 3, 5, 6, 10, 4, 3, 6, 7, 2, 3, 5, 3, 4, 6, 10, 4, 7, 6, 2, 8, 9, 10, 4, 2};
        int qtdNotas[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i : notas) {
            qtdNotas[i - 1]++;
        }


        for (int i = 0; i < qtdNotas.length; i++) {
            System.out.print(i + 1 + ": " + qtdNotas[i] + ", ");
        }
    }
}


