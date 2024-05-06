package com.siga.siga.dto;
public class ResumoDTO {
    private long id;
    private String nome;
    private String descricao;

    public ResumoDTO() {
        // Construtor padrão sem argumentos
    }

    public ResumoDTO(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

