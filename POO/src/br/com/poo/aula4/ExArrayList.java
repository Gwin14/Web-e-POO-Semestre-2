package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExArrayList {
    public static void main(String[] args) {

        List<String> bebidas = new ArrayList<String>();

        bebidas.add("suco");
        bebidas.add("refrigerante");
        bebidas.add("agua");
        bebidas.add("cerveja");

        System.out.println(bebidas);

        removerBebida(bebidas);

        adicionarBebida(bebidas);

        bebidas.sort(null);

        System.out.println(bebidas);
    }

    private static void adicionarBebida(List<String> bebidas) {
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Adicione uma nova bebida: ");
                String bebidaAdc = sc.next();

                if (bebidas.contains(bebidaAdc)) {
                    throw new Exception("Essa bebida ja existe!");
                } else {
                    bebidas.add(bebidaAdc);
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    private static void removerBebida(List<String> bebidas) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Diga uma bebida: ");
        String bebidaResposta = sc.next();


        if (bebidas.contains(bebidaResposta)) {

            bebidas.remove(bebidaResposta);

            System.out.println(bebidaResposta + " foi removido(a)!");
        } else {
            System.out.println("Essa bebida nao existe!");
        }
    }
}
