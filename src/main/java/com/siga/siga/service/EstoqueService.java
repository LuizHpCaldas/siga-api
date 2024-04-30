package com.siga.siga.service;


import com.siga.siga.model.Estoque;
import com.siga.siga.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;

    public List<Estoque> listarEstoques() {
        return estoqueRepository.findAll();
    }

    public Estoque salvarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public void deletarEstoque(Long id) {
        estoqueRepository.deleteById(id);
    }
}
