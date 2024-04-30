package com.siga.siga.controller;

import com.siga.siga.model.Safra;
import com.siga.siga.service.SafraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/safras")
public class SafraController {
    @Autowired
    private SafraService safraService;

    @GetMapping
    public List<Safra> listarSafras() {
        return safraService.listarSafras();
    }

    @PostMapping
    public Safra salvarSafra(@RequestBody Safra safra) {
        return safraService.salvarSafra(safra);
    }

    @DeleteMapping("/{id}")
    public void deletarSafra(@PathVariable Long id) {
        safraService.deletarSafra(id);
    }
}
