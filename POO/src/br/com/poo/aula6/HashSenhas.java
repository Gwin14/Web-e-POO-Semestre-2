package br.com.poo.aula6;

import java.util.HashMap;
import java.util.Scanner;

public class HashSenhas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> cadastros = new HashMap<>();

        System.out.println("Cadastro de usuário");
        System.out.println("==================================");

        do {

            CadastrarUsuario(cadastros);

            System.out.print("Deseja cadastrar mais usuários? (S ou N): ");
            String desejaCadastrar = sc.next();

            if ((desejaCadastrar.equalsIgnoreCase("N"))) {
                break;
            }


        } while (true);
    }

    private static void CadastrarUsuario(HashMap<String, String> cadastros) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Diga seu nome: ");
            String nome = sc.next();

            if (nome.length() == 0) {
                System.out.println("Insira um nome!");
                continue;
            }
            if (cadastros.containsKey(nome)) {
                System.out.println("Esse usuário já existe!");
                continue;
            }

            System.out.print("Diga sua senha: ");
            String senha = sc.next();

            if (senha.length() < 6) {
                System.out.println("A senha precisa ter no mínimo 6 caracteres!");
                continue;
            }

            System.out.println("==================================");

            cadastros.put(nome, senha);
            break;
        }
    }

}
