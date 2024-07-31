package br.com.poo.aula1;

import java.util.Random;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSorteado = GerarNumeroAleatorio();

        while (true) {
            System.out.println("Diga um número de 0 a 50");
            int numero = sc.nextInt();

            if (numero == numeroSorteado) {
                EnviarMensagem(numeroSorteado);
                break;
            }

            if (numero > numeroSorteado) {
                System.out.println("Errado, o número é mais baixo");
            } else {
                System.out.println("Errado, o número é mais alto");
            }

        }

    }

    public static int GerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(50);
    }

    public static void EnviarMensagem(int numeroSorteado) {
        System.out.println("Acertou! " + numeroSorteado);

    }

}
