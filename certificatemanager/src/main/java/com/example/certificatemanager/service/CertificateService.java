package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.Certificate;
import com.example.certificatemanager.repository.CertificateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    // 1. Alle Zertifikate abrufen
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    // 2. Zertifikat nach ID abrufen
    public Certificate getCertificateById(Long id) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(id);
        return optionalCertificate.orElse(null);
    }

    // 3. Neues Zertifikat erstellen
    public Certificate createCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    // 4. Zertifikat aktualisieren
    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(id);
        if (optionalCertificate.isPresent()) {
            Certificate existingCertificate = optionalCertificate.get();
            // Update nur der Felder, die sich ändern können
            existingCertificate.setSystem(updatedCertificate.getSystem());
            existingCertificate.setStage(updatedCertificate.getStage());
            existingCertificate.setSystemuser(updatedCertificate.getSystemuser());
            existingCertificate.setServer(updatedCertificate.getServer());
            existingCertificate.setZertifikatsname(updatedCertificate.getZertifikatsname());
            existingCertificate.setGueltigkeit(updatedCertificate.getGueltigkeit());
            existingCertificate.setTyp(updatedCertificate.getTyp());
            existingCertificate.setMq(updatedCertificate.getMq());
            existingCertificate.setChannel(updatedCertificate.getChannel());
            existingCertificate.setIssuer(updatedCertificate.getIssuer());
            existingCertificate.setRvsStation(updatedCertificate.getRvsStation());
            existingCertificate.setOdetteId(updatedCertificate.getOdetteId());
            existingCertificate.setMysqlUser(updatedCertificate.getMysqlUser());
            existingCertificate.setOracleUser(updatedCertificate.getOracleUser());
            return certificateRepository.save(existingCertificate);
        }
        return null;
    }

    // 5. Zertifikat löschen
    public boolean deleteCertificate(Long id) {
        if (certificateRepository.existsById(id)) {
            certificateRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
