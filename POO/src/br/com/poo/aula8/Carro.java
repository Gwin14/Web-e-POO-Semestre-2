package br.com.poo.aula8;

import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);

    String fabricante;
    String modelo;
    String cor;
    String tipoCombustivel;
    int anoFab;
    double valorMercado;
    boolean ligado = false;

    public Carro(String fabricante, String modelo, String cor, String tipoCombustivel, int anoFab, double valorMercado) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.anoFab = anoFab;
        this.valorMercado = valorMercado;
    }

    public void Ligar() {
        if (!ligado) {
            if (modelo == null) {
                System.out.println("Nome do carro não informado!");
            } else {
                System.out.print("Diga o nome do carro para ligar: ");
                String nomeCarro = sc.next();

                if (nomeCarro.equalsIgnoreCase(this.modelo)) {
                    ligado = true;
                    System.out.println(this.modelo + " ligado!");
                } else {
                    System.out.println("Nome informado não corresponde ao do carro!");
                }
            }
        } else {
            System.out.println(this.modelo + " já está ligado!");
        }
    }

    public void Desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(this.modelo + " desligado!");
        } else {
            System.out.println(this.modelo + " já está desligado!");
        }
    }

    public void MudarMarcha() {
        if (ligado) {
            System.out.println(this.modelo + " mudou a marcha!");
        } else {
            System.out.println(this.modelo + " não está ligado!");
        }
    }

    public void Acelerar() {
        if (ligado) {
            System.out.println(this.modelo + " está acelerando!");
        } else {
            System.out.println(this.modelo + " não está ligado!");
        }
    }

}
