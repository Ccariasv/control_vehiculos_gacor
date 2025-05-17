package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estado_viajes")
public class EstadoViaje {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "estado", length = 500)
    private String estado;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

}