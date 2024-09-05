package br.com.poo.Aula5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExHashMap {

    public static void main(String[] args) {
        Map<String, String> locais = new HashMap<>();

        PreencherHash(locais);

        for (String loc : locais.keySet()) {
            System.out.println("Local " + locais.get(loc));
        }

        System.out.println("================================");

        VerificarSeTemNoHash(locais);

        System.out.println("================================");

        DeletarCep(locais);

        System.out.println("================================");

        for (String loc : locais.keySet()) {
            System.out.println("Cep: " + loc + ", Local: " + locais.get(loc));
        }
    }

    private static void PreencherHash(Map<String, String> locais) {
        locais.put("88-139-351", "Pinheira");
        locais.put("35-123-456", "Santana");
        locais.put("21-456-789", "Parque do Lago");
        locais.put("98-765-432", "Sacramento");
        locais.put("88-139-251", "Praia do Forte");
    }

    private static void VerificarSeTemNoHash(Map<String, String> locais) {
        boolean temNoHash = locais.containsKey("88-139-351");
        System.out.println("Tem o no hash? " + (temNoHash ? "Sim" : "Não"));
    }

    private static void DeletarCep(Map<String, String> locais) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga algum local para deletar (CEP): ");

        while (true) {
            String localDel = sc.next();

            if ((locais.containsKey(localDel))) {
                locais.remove(localDel);
                System.out.println(localDel + "Foi deletado!");
                break;
            } else {
                System.out.println("Não existe! Escolha outro");
            }
        }
    }

}
