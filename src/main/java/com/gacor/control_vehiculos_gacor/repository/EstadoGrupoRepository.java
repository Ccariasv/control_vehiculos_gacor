package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EstadoGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoGrupoRepository extends JpaRepository<EstadoGrupo, Long>, JpaSpecificationExecutor<EstadoGrupo> {
}