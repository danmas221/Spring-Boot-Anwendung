package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.Certificate;
import com.example.certificatemanager.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CertificateService {
    private final CertificateRepository certificateRepository;

    @Autowired
    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }
}
