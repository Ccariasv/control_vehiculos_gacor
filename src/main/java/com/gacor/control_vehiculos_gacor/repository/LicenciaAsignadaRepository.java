package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.LicenciaAsignada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LicenciaAsignadaRepository extends JpaRepository<LicenciaAsignada, Long>, JpaSpecificationExecutor<LicenciaAsignada> {
}