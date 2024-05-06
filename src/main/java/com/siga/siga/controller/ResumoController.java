package com.siga.siga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.siga.siga.dto.ResumoDTO;
import com.siga.siga.service.ResumoService;

@RestController
public class ResumoController {

    private final ResumoService resumoService;

    public ResumoController(ResumoService resumoService) {
        this.resumoService = resumoService;
    }

    @GetMapping("/api/resumos")
    public List<ResumoDTO> obterResumos() {
        return resumoService.obterResumos();
    }
}