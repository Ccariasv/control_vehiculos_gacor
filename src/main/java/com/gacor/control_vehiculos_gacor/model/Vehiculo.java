package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "placa", nullable = false, length = 500)
    private String placa;

    @Column(name = "tipo", nullable = false, length = 500)
    private String tipo;

    @Column(name = "modelo", nullable = false, length = 500)
    private String modelo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado_vehiculos", nullable = false)
    private EstadoVehiculo idEstadoVehiculos;

    @Column(name = "created_at")
    private Instant createdAt;

}