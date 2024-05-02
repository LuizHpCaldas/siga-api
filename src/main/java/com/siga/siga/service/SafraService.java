package com.siga.siga.service;

import com.siga.siga.entities.Safra;
import com.siga.siga.repository.SafraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafraService {
    @Autowired
    private SafraRepository safraRepository;

    public Safra criarSafra(Safra safra) {
        return safraRepository.save(safra);
    }

    public List<Safra> listarSafras() {
        return safraRepository.findAll();
    }

    public Safra obterSafraPorId(Long safraId) {
        return safraRepository.findById(safraId).orElse(null);
    }

    public Safra atualizarSafra(Long safraId, Safra safraAtualizada) {
        Safra safraExistente = safraRepository.findById(safraId).orElse(null);
        if (safraExistente != null) {
            safraAtualizada.setId(safraId);
            return safraRepository.save(safraAtualizada);
        }
        return null;
    }

    public void excluirSafra(Long safraId) {
        safraRepository.deleteById(safraId);
    }
}
