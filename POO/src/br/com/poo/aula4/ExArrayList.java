package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> bebidas = new ArrayList<String>();

        bebidas.add("suco");
        bebidas.add("refrigerante");
        bebidas.add("agua");
        bebidas.add("cerveja");

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
