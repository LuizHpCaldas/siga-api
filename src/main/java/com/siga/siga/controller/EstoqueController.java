package com.siga.siga.controller;

import com.siga.siga.model.Estoque;
import com.siga.siga.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estoques")
public class EstoqueController {
    @Autowired
    private EstoqueService estoqueService;

    @GetMapping
    public List<Estoque> listarEstoques() {
        return estoqueService.listarEstoques();
    }

    @PostMapping
    public Estoque salvarEstoque(@RequestBody Estoque estoque) {
        return estoqueService.salvarEstoque(estoque);
    }

    @DeleteMapping("/{id}")
    public void deletarEstoque(@PathVariable Long id) {
        estoqueService.deletarEstoque(id);
    }
}