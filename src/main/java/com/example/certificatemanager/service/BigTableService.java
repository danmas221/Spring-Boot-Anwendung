package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.BigTable;
import com.example.certificatemanager.repository.BigTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigTableService {
    private final BigTableRepository bigTableRepository;

    @Autowired
    public BigTableService(BigTableRepository bigTableRepository) {
        this.bigTableRepository = bigTableRepository;
    }

    public List<BigTable> getAllCertificates() {
        return bigTableRepository.findAll();
    }

    public BigTable getCertificateById(Long id) {
        return bigTableRepository.findById(id).orElse(null);
    }

    public BigTable createCertificate(BigTable certificate) {
        return bigTableRepository.save(certificate);
    }

    public BigTable updateCertificate(Long id, BigTable updatedCertificate) {
        if (bigTableRepository.existsById(id)) {
            updatedCertificate.setId(id);
            return bigTableRepository.save(updatedCertificate);
        } else {
            return null;
        }
    }

    public boolean deleteCertificate(Long id) {
        if (bigTableRepository.existsById(id)) {
            bigTableRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}