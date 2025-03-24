package com.example.certificatemanager.repository;

import com.example.certificatemanager.entities.BigTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigTableRepository extends JpaRepository<BigTable, Long> {
    // Hier können benutzerdifinierte Abfragen ergänzt werden
}