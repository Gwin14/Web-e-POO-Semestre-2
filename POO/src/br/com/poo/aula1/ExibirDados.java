package br.com.poo.aula1;

import java.util.Scanner;

public class ExibirDados {

    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < usuarios.length; i++) {
            Usuario user = new Usuario();

            System.out.println("Nome do usuário: " + i);
            user.nome = sc.next();

            System.out.println("Sobrenome do usuário: " + i);
            user.sobrenome = sc.next();

            System.out.println("Idade do usuário: " + i);
            user.idade = sc.nextInt();

            usuarios[i] = user;

            System.out.println("------------------");
        }

        for (Usuario user : usuarios) {
            user.MostrarDados();
        }


    }

}
