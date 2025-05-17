package com.gacor.control_vehiculos_gacor.repository;

import com.gacor.control_vehiculos_gacor.model.ListaChequeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ListaChequeoRepository extends JpaRepository<ListaChequeo, Long>, JpaSpecificationExecutor<ListaChequeo> {
}