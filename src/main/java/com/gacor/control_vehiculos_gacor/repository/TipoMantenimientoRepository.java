package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.TipoMantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TipoMantenimientoRepository extends JpaRepository<TipoMantenimiento, Long>, JpaSpecificationExecutor<TipoMantenimiento> {
}