package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.BigTable;
import com.example.certificatemanager.entities.SystemStage;
import com.example.certificatemanager.repository.BigTableRepository;
import com.example.certificatemanager.repository.SystemStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BigTableService {
    private final BigTableRepository bigTableRepository;
    private final SystemStageRepository systemStageRepository;

    @Autowired
    public BigTableService(BigTableRepository bigTableRepository, SystemStageRepository systemStageRepository) {
        this.bigTableRepository = bigTableRepository;
        this.systemStageRepository = systemStageRepository;
    }

    public List<BigTable> getAllCertificates() {
        return bigTableRepository.findAll();
    }

    public BigTable getCertificateById(Long id) {
        return bigTableRepository.findById(id).orElse(null);
    }

    @Transactional
    public BigTable createCertificate(BigTable certificate) {
        handleSystemStage(certificate);
        return bigTableRepository.save(certificate);
    }

    @Transactional
    public BigTable updateCertificate(Long id, BigTable updatedCertificate) {
        if (bigTableRepository.existsById(id)) {
            updatedCertificate.setId(id);
            handleSystemStage(updatedCertificate);
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

    private void handleSystemStage(BigTable certificate) {
        if (certificate.getSystemStage() != null) {
            Optional<SystemStage> existingSystemStage = systemStageRepository.findBySystemAndStage(
                    certificate.getSystemStage().getSystem(), certificate.getSystemStage().getStage());
            if (existingSystemStage.isPresent()) {
                certificate.setSystemStage(existingSystemStage.get());
            } else {
                systemStageRepository.save(certificate.getSystemStage());
            }
        }
    }
}  