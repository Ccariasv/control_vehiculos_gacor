package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EstadoAsignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoAsignacionRepository extends JpaRepository<EstadoAsignacion, Long>, JpaSpecificationExecutor<EstadoAsignacion> {
}