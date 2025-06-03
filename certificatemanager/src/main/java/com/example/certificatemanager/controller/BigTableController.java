package com.example.certificatemanager.controller;

import com.example.certificatemanager.entities.BigTable;
import com.example.certificatemanager.service.BigTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bigtable")
public class BigTableController {
    private final BigTableService bigTableService;

    @Autowired
    public BigTableController(BigTableService bigTableService) {
        this.bigTableService = bigTableService;
    }

    @GetMapping
    public List<BigTable> getAllCertificates() {
        return bigTableService.getAllCertificates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BigTable> getCertificateById(@PathVariable Long id) {
        BigTable certificate = bigTableService.getCertificateById(id);
        if (certificate != null) {
            return ResponseEntity.ok(certificate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public BigTable createCertificate(@RequestBody BigTable certificate) {
        return bigTableService.createCertificate(certificate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BigTable> updateCertificate(@PathVariable Long id, @RequestBody BigTable updatedCertificate) {
        updatedCertificate.setId(id);
        BigTable certificate = bigTableService.updateCertificate(id, updatedCertificate);
        if (certificate != null) {
            return ResponseEntity.ok(certificate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertificate(@PathVariable Long id) {
        boolean deleted = bigTableService.deleteCertificate(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}