package com.siga.siga.service;



import com.siga.siga.model.CustoProducao;
import com.siga.siga.repository.CustoProducaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustoProducaoService {
    @Autowired
    private CustoProducaoRepository custoProducaoRepository;

    public List<CustoProducao> listarCustosProducao() {
        return custoProducaoRepository.findAll();
    }

    public CustoProducao salvarCustoProducao(CustoProducao custoProducao) {
        return custoProducaoRepository.save(custoProducao);
    }

    public void deletarCustoProducao(Long id) {
        custoProducaoRepository.deleteById(id);
    }
}