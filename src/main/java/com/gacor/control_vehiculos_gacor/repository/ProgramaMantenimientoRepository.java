package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.ProgramaMantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProgramaMantenimientoRepository extends JpaRepository<ProgramaMantenimiento, Long>, JpaSpecificationExecutor<ProgramaMantenimiento> {
}