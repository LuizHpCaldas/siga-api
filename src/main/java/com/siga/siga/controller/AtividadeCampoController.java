package com.siga.siga.controller;

import com.siga.siga.model.AtividadeCampo;
import com.siga.siga.service.AtividadeCampoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atividades-campo")
public class AtividadeCampoController {
    @Autowired
    private AtividadeCampoService atividadeCampoService;

    @GetMapping
    public List<AtividadeCampo> listarAtividadesCampo() {
        return atividadeCampoService.listarAtividadesCampo();
    }

    @PostMapping
    public AtividadeCampo salvarAtividadeCampo(@RequestBody AtividadeCampo atividadeCampo) {
        return atividadeCampoService.salvarAtividadeCampo(atividadeCampo);
    }

    @DeleteMapping("/{id}")
    public void deletarAtividadeCampo(@PathVariable Long id) {
        atividadeCampoService.deletarAtividadeCampo(id);
    }
}