package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.UbicacionVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UbicacionVehiculoRepository extends JpaRepository<UbicacionVehiculo, Long>, JpaSpecificationExecutor<UbicacionVehiculo> {
}