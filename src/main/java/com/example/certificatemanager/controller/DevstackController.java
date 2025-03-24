package com.example.certificatemanager.controller;

import com.example.certificatemanager.entities.Devstack;
import com.example.certificatemanager.service.DevstackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devstack")
public class DevstackController {

    private final DevstackService devstackService;

    @Autowired
    public DevstackController(DevstackService devstackService) {
        this.devstackService = devstackService;
    }

    @GetMapping
    public List<Devstack> getAllDevstacks() {
        return devstackService.getAllDevstacks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Devstack> getDevstackById(@PathVariable Long id) {
        Devstack devstack = devstackService.getDevstackById(id);
        if (devstack != null) {
            return ResponseEntity.ok(devstack);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Devstack createDevstack(@RequestBody Devstack devstack) {
        return devstackService.createDevstack(devstack);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Devstack> updateDevstack(@PathVariable Long id, @RequestBody Devstack updatedDevstack) {
        Devstack devstack = devstackService.updateDevstack(id, updatedDevstack);
        if (devstack != null) {
            return ResponseEntity.ok(devstack);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDevstack(@PathVariable Long id) {
        boolean deleted = devstackService.deleteDevstack(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
