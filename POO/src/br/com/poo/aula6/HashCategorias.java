package br.com.poo.aula6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashCategorias {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<String>(List.of(new String[]{"Maçã", "Banana", "Laranja"}));
        List<String> verduras = new ArrayList<String>(List.of(new String[]{"Alface", "Cebola"}));
        List<String> temperos = new ArrayList<String>(List.of(new String[]{"Queijo", "Orégano", "Molho"}));


        HashMap<String, List<String>> comidas = new HashMap<>();

        comidas.put("Frutas", frutas);
        comidas.put("Verduras", verduras);
        comidas.put("Temperos", temperos);

        comidas.forEach((key, value) -> {
            System.out.println("Classe: " + key);
            System.out.print("Produtos: ");
            for (String i : value) {
                System.out.print(" " + i + "");
            }

            System.out.println("\n============");
        });

    }

}
