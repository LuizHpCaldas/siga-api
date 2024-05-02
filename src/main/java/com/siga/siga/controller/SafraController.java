package com.siga.siga.controller;

import com.siga.siga.entities.Safra;
import com.siga.siga.service.SafraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/safras")
public class SafraController {
    @Autowired
    private SafraService safraService;

    @PostMapping
    public ResponseEntity<Safra> criarSafra(@RequestBody Safra safra) {
        Safra novaSafra = safraService.criarSafra(safra);
        return ResponseEntity.ok(novaSafra);
    }

    @GetMapping
    public ResponseEntity<List<Safra>> listarSafras() {
        List<Safra> safras = safraService.listarSafras();
        return ResponseEntity.ok(safras);
    }

    @GetMapping("/{safraId}")
    public ResponseEntity<Safra> obterSafraPorId(@PathVariable Long safraId) {
        Safra safra = safraService.obterSafraPorId(safraId);
        return ResponseEntity.ok(safra);
    }

    @PutMapping("/{safraId}")
    public ResponseEntity<Safra> atualizarSafra(@PathVariable Long safraId, @RequestBody Safra safraAtualizada) {
        Safra safra = safraService.atualizarSafra(safraId, safraAtualizada);
        if (safra != null) {
            return ResponseEntity.ok(safra);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{safraId}")
    public ResponseEntity<Void> excluirSafra(@PathVariable Long safraId) {
        safraService.excluirSafra(safraId);
        return ResponseEntity.noContent().build();
    }
}
