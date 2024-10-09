package com.example.carro.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // vai gerar todos os metodos getters dos atributos
@Setter // vai gerar todos os metodos setters dos atributos
@AllArgsConstructor // vai gerar o construtor com todos os atributos
@NoArgsConstructor // vai gerar o construtor com nenhum atributo
public class Carro {

    private Long id;
    private String marca;
    private String modelo;
    private int anoFabricacao;

}
