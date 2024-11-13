package com.example.carro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // vai gerar todos os metodos getters dos atributos
@Setter // vai gerar todos os metodos setters dos atributos
@AllArgsConstructor // vai gerar o construtor com todos os atributos
@NoArgsConstructor // vai gerar o construtor com nenhum atributo

@Table(name = "db-carro")
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false, name = "ano_fabricacao")
    private int anoFabricacao;

    @Column(nullable = false)
    private String cor;

}
