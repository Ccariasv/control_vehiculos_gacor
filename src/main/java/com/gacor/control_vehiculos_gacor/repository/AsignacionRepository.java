package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AsignacionRepository extends JpaRepository<Asignacion, Long>, JpaSpecificationExecutor<Asignacion> {
    List<Asignacion> findByCargo_Id(Long cargoId);
    List<Asignacion> findByEmpleado_Id(Long empleadoId);
}