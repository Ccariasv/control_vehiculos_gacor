package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.SeguimientoMantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SeguimientoMantenimientoRepository extends JpaRepository<SeguimientoMantenimiento, Long>, JpaSpecificationExecutor<SeguimientoMantenimiento> {
}