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

    public void setId(Long id) {
        this.id = id;
    }
    // Outros atributos e métodos
}

