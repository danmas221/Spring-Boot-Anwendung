package com.example.certificatemanager.repository;

import com.example.certificatemanager.entities.SystemStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemStageRepository extends JpaRepository<SystemStage, Long> {
}
