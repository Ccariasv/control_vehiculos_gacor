package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Long>, JpaSpecificationExecutor<Mantenimiento> {
}