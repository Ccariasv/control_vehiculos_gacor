package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.EstadoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculo, Long>, JpaSpecificationExecutor<EstadoVehiculo> {
}