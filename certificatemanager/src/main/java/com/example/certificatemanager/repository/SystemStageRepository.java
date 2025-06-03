package com.example.certificatemanager.repository;

import com.example.certificatemanager.entities.SystemStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface SystemStageRepository extends JpaRepository<SystemStage, Long> {
    @Query("SELECT s FROM SystemStage s WHERE s.system = :system AND s.stage = :stage")
    Optional<SystemStage> findBySystemAndStage(@Param("system") String system, @Param("stage") String stage);
}