package com.siga.siga.service;

import com.siga.siga.repository.ResumoRepository;
import org.springframework.stereotype.Component; // Importe a anotação necessária
import com.siga.siga.entities.Resumo;
import java.util.List;

@Component // Ou @Repository, dependendo do propósito da classe
public class ResumoRepositoryImpl implements ResumoRepository {

    @Override
    public List<Resumo> obterResumos() {
        // Implemente aqui a lógica para obter os resumos do banco de dados
        return null; // Exemplo hipotético
    }
}
