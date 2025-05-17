package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.HistorialNotificacione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HistorialNotificacioneRepository extends JpaRepository<HistorialNotificacione, Long>, JpaSpecificationExecutor<HistorialNotificacione> {
}