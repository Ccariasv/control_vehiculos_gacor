package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.ItemsMantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ItemsMantenimientoRepository extends JpaRepository<ItemsMantenimiento, Long>, JpaSpecificationExecutor<ItemsMantenimiento> {
}