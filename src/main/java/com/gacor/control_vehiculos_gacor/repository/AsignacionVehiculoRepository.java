package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.AsignacionVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AsignacionVehiculoRepository extends JpaRepository<AsignacionVehiculo, Long>, JpaSpecificationExecutor<AsignacionVehiculo> {
}