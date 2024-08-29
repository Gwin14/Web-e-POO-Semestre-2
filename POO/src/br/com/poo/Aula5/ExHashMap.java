package br.com.poo.Aula5;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

    public static void main(String[] args) {

        Map<String, String> locais = new HashMap<>();

        locais.put("88-139-351", "Pinheira");
        locais.put("35-123-456", "Santana");
        locais.put("21-456-789", "Parque do Lago");
        locais.put("98-765-432", "Sacramento");
        locais.put("88-139-251", "Praia do Forte");

        for (String loc : locais.keySet()) {
            System.out.println("Local " + locais.get(loc));
        }

        System.out.println("================================");

        boolean temNoHash = locais.containsKey("88-139-351");
        System.out.println("Tem o no hash? " + temNoHash);

        System.out.println("================================");

        locais.remove("88-139-351", "Pinheira");

        for (String loc : locais.keySet()) {
            System.out.println("Cep: " + loc + ", Local: " + locais.get(loc));
        }

    }

}
