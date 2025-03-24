package com.example.certificatemanager.repository;

import com.example.certificatemanager.entities.Devstack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevstackRepository extends JpaRepository<Devstack, Long> {
    // Hier können benutzerdefinierte Abfragen ergänzt werden
}
