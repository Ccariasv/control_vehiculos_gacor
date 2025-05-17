package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.Combustible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CombustibleRepository extends JpaRepository<Combustible, Long>, JpaSpecificationExecutor<Combustible> {
}