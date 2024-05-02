package com.siga.siga.repository;

import com.siga.siga.entities.Safra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SafraRepository extends JpaRepository<Safra, Long> {
    // Métodos personalizados, se necessário
}

