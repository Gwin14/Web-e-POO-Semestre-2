package com.company;


import java.util.ArrayList;

public class Catalogo {

    private String titulo;
    private ArrayList<Produto> produtos;


    public Catalogo(String titulo, ArrayList<Produto> produtos) {
        this.titulo = titulo;
        this.produtos = produtos;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "titulo='" + titulo + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
