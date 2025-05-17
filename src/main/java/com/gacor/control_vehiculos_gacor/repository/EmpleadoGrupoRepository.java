package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EmpleadoGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmpleadoGrupoRepository extends JpaRepository<EmpleadoGrupo, Long>, JpaSpecificationExecutor<EmpleadoGrupo> {
}