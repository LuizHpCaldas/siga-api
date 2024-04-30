package com.siga.siga.controller;

import com.siga.siga.model.CustoProducao;
import com.siga.siga.service.CustoProducaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/custos-producao")
public class CustoProducaoController {
    @Autowired
    private CustoProducaoService custoProducaoService;

    @GetMapping
    public List<CustoProducao> listarCustosProducao() {
        return custoProducaoService.listarCustosProducao();
    }

    @PostMapping
    public CustoProducao salvarCustoProducao(@RequestBody CustoProducao custoProducao) {
        return custoProducaoService.salvarCustoProducao(custoProducao);
    }

    @DeleteMapping("/{id}")
    public void deletarCustoProducao(@PathVariable Long id) {
        custoProducaoService.deletarCustoProducao(id);
    }
}