package com.example.certificatemanager.repository;


import com.example.certificatemanager.entities.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    //Hier können benutzerdifinierte Abfragen ergänzt werden
}
