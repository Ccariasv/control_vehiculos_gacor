package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.TipoCombustible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TipoCombustibleRepository extends JpaRepository<TipoCombustible, Long>, JpaSpecificationExecutor<TipoCombustible> {
}