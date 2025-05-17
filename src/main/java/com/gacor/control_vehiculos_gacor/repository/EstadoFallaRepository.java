package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EstadoFalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoFallaRepository extends JpaRepository<EstadoFalla, Long>, JpaSpecificationExecutor<EstadoFalla> {
}