package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EstadoViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoViajeRepository extends JpaRepository<EstadoViaje, Long>, JpaSpecificationExecutor<EstadoViaje> {
}