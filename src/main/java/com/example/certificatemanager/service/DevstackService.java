package com.example.certificatemanager.service;

import com.example.certificatemanager.entities.Devstack;
import com.example.certificatemanager.repository.DevstackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevstackService {

    private final DevstackRepository devstackRepository;

    @Autowired
    public DevstackService(DevstackRepository devstackRepository) {
        this.devstackRepository = devstackRepository;
    }

    public List<Devstack> getAllDevstacks() {
        return devstackRepository.findAll();
    }

    public Devstack getDevstackById(Long id) {
        return devstackRepository.findById(id).orElse(null);
    }

    public Devstack createDevstack(Devstack devstack) {
        return devstackRepository.save(devstack);
    }

    public Devstack updateDevstack(Long id, Devstack updatedDevstack) {
        if (devstackRepository.existsById(id)) {
            updatedDevstack.setId(id);
            return devstackRepository.save(updatedDevstack);
        } else {
            return null;
        }
    }

    public boolean deleteDevstack(Long id) {
        if (devstackRepository.existsById(id)) {
            devstackRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
