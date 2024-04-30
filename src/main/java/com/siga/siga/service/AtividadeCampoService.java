package com.siga.siga.service;

import com.siga.siga.model.AtividadeCampo;
import com.siga.siga.repository.AtividadeCampoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeCampoService {
    @Autowired
    private AtividadeCampoRepository atividadeCampoRepository;

    public List<AtividadeCampo> listarAtividadesCampo() {
        return atividadeCampoRepository.findAll();
    }

    public AtividadeCampo salvarAtividadeCampo(AtividadeCampo atividadeCampo) {
        return atividadeCampoRepository.save(atividadeCampo);
    }

    public void deletarAtividadeCampo(Long id) {
        atividadeCampoRepository.deleteById(id);
    }
}
