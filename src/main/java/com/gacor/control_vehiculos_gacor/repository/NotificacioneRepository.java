package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.Notificacione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NotificacioneRepository extends JpaRepository<Notificacione, Long>, JpaSpecificationExecutor<Notificacione> {
}