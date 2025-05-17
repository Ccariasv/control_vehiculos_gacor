package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.TipoFalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TipoFallaRepository extends JpaRepository<TipoFalla, Long>, JpaSpecificationExecutor<TipoFalla> {
}