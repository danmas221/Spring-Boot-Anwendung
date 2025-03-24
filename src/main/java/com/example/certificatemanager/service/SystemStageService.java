package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.SystemStage;
import com.example.certificatemanager.repository.SystemStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStageService {

    private final SystemStageRepository systemStageRepository;

    @Autowired
    public SystemStageService(SystemStageRepository systemStageRepository) {
        this.systemStageRepository = systemStageRepository;
    }

    public List<SystemStage> getAllSystemStages() {
        return systemStageRepository.findAll();
    }

    public SystemStage getSystemStageById(Long id) {
        return systemStageRepository.findById(id).orElse(null);
    }

    public SystemStage createSystemStage(SystemStage systemStage) {
        return systemStageRepository.save(systemStage);
    }

    public SystemStage updateSystemStage(Long id, SystemStage updatedSystemStage) {
        if (systemStageRepository.existsById(id)) {
            updatedSystemStage.setSystemID(id);  // Hier wird der korrekte Setter aufgerufen.
            return systemStageRepository.save(updatedSystemStage);
        } else {
            return null;
        }
    }

    public boolean deleteSystemStage(Long id) {
        if (systemStageRepository.existsById(id)) {
            systemStageRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
