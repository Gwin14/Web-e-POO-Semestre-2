package br.com.poo.aula6;

import java.util.HashMap;

public class HashFrequencia {

    public static void main(String[] args) {

        String[] palavras = new String[]{"A", "B", "C", "A", "C", "B", "B", "B", "C", "B", "A", "A", "C"};

        HashMap<String, Integer> frequencia = new HashMap<String, Integer>();

        frequencia.put("A", 0);
        frequencia.put("B", 0);
        frequencia.put("C", 0);

        for (String x : palavras) {
            switch (x) {
                case "A":
                    int num = frequencia.get("A");
                    num++;
                    frequencia.put("A", num);
                    break;
                case "B":
                    int num2 = frequencia.get("B");
                    num2++;
                    frequencia.put("B", num2);
                    break;
                case "C":
                    int num3 = frequencia.get("C");
                    num3++;
                    frequencia.put("C", num3);
                    break;
            }

        }

        System.out.println(frequencia);

    }

}
