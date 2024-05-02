package com.siga.siga.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "safra")
public class Safra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ano")
    private int ano;

    @Column(name = "cultura")
    private String cultura;

    // Outros atributos e métodos
}

