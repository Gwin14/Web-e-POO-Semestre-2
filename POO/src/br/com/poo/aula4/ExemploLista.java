package br.com.poo.aula4;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(50);
        lista.add(543);
        lista.add(53242);
        lista.add(1, 4);

        int indice = lista.indexOf(543);

        if (lista.contains(4)) {
            System.out.println("Contém valor");
        }

        for (int valor : lista) {
            System.out.println(valor);
        }
    }


}
