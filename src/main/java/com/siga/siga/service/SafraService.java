package com.siga.siga.service;

import com.siga.siga.model.Safra;
import com.siga.siga.repository.SafraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafraService {
    @Autowired
    private SafraRepository safraRepository;

    public List<Safra> listarSafras() {
        return safraRepository.findAll();
    }

    public Safra salvarSafra(Safra safra) {
        return safraRepository.save(safra);
    }

    public void deletarSafra(Long id) {
        safraRepository.deleteById(id);
    }
}