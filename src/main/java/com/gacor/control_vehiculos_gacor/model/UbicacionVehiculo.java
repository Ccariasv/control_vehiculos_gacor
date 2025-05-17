package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "ubicacion_vehiculo")
public class UbicacionVehiculo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @Column(name = "latitud", precision = 12, scale = 8)
    private BigDecimal latitud;

    @Column(name = "longitud", precision = 12, scale = 8)
    private BigDecimal longitud;

    @Column(name = "fecha_hora")
    private Instant fechaHora;

}