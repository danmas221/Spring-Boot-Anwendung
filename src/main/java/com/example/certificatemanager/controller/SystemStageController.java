package com.example.certificatemanager.controller;

import com.example.certificatemanager.entities.SystemStage;
import com.example.certificatemanager.service.SystemStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systemstage")
public class SystemStageController {

    private final SystemStageService systemStageService;

    @Autowired
    public SystemStageController(SystemStageService systemStageService) {
        this.systemStageService = systemStageService;
    }

    @GetMapping
    public List<SystemStage> getAllSystemStages() {
        return systemStageService.getAllSystemStages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemStage> getSystemStageById(@PathVariable Long id) {
        SystemStage systemStage = systemStageService.getSystemStageById(id);
        if (systemStage != null) {
            return ResponseEntity.ok(systemStage);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public SystemStage createSystemStage(@RequestBody SystemStage systemStage) {
        return systemStageService.createSystemStage(systemStage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SystemStage> updateSystemStage(@PathVariable Long id, @RequestBody SystemStage updatedSystemStage) {
        SystemStage systemStage = systemStageService.updateSystemStage(id, updatedSystemStage);
        if (systemStage != null) {
            return ResponseEntity.ok(systemStage);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSystemStage(@PathVariable Long id) {
        boolean deleted = systemStageService.deleteSystemStage(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
