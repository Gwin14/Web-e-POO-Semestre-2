package br.com.poo.Aula5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Fábio");

        Map<String, String> mapa = new HashMap<>();
        mapa.put("080.853.323.29", "Fábio");

        for (String nome : lista    ) {
            System.out.println(nome);
        }

    }

}
