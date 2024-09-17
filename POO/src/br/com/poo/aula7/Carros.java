package br.com.poo.aula7;

import java.util.HashMap;
import java.util.Scanner;

public class Carros {

    public static void main(String[] args) {

        HashMap<String, String> carros = new HashMap<>();

        preencherCarros(carros);

        comprarCarro(carros);

        for (int i = 0; i < carros.size(); i++) {
            System.out.println("Carro " + (i + 1) + ": Marca: " + carros.get(carros.keySet().toArray()[i]) + ", Modelo: " + carros.keySet().toArray()[i]);
        }
    }

    private static void preencherCarros(HashMap<String, String> carros) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (carros.size() >= 6) {
                System.out.print("Deseja botar mais carros? (S ou N): ");
                String botarCarros = validarResposta();

                if (botarCarros.equalsIgnoreCase("N")) {
                    break;
                }
            }

            System.out.print("Diga a marca do carro que deseja colocar: ");
            String marca = sc.next();

            System.out.print("Diga o modelo do carro que deseja colocar: ");
            String modelo = sc.next();

            carros.put(modelo, marca);
        }
    }

    private static void comprarCarro(HashMap<String, String> carros) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Qual carro deseja comprar? (modelo): ");
            String carroComprado = sc.next();

            if (carros.containsKey(carroComprado)) {

                System.out.println("Deseja comprar esse carro? (S ou N): ");
                String desejaComprar = validarResposta();

                if (desejaComprar.equalsIgnoreCase("N")) {
                    break;
                }

                trocarCarro(carroComprado, carros);

                break;
            } else {
                System.out.println("Carro inexistente! Tente novamente");
            }
        }
    }

    private static void trocarCarro(String carroComprado, HashMap<String, String> carros) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja dar seu carro na troca? (S ou N): ");
        String troca = validarResposta();

        if (troca.equalsIgnoreCase("N")) {

            System.out.println(carroComprado + " comprado!");
            carros.remove(carroComprado);

        } else {
            System.out.print("Diga a marca do carro que deseja colocar na troca: ");
            String marca = sc.next();

            System.out.print("Diga o modelo do carro que deseja colocar na troca: ");
            String modelo = sc.next();

            carros.remove(carroComprado);
            carros.put(modelo, marca);
            System.out.println("Carro trocado!");
        }

    }

    private static String validarResposta() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("S")) {
                return "S";
            } else if (resposta.equalsIgnoreCase("N")) {
                return "N";
            } else {
                System.out.print("S ou N, responda novamente: ");
            }
        }
    }

}
