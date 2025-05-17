package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "combustible")
public class Combustible {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @Column(name = "km", nullable = false)
    private Long km;

    @Column(name = "galones_total")
    private Double galonesTotal;

    @Column(name = "precio_galon", nullable = false, precision = 15, scale = 2)
    private BigDecimal precioGalon;

    @Column(name = "costo_total", nullable = false, precision = 15, scale = 2)
    private BigDecimal costoTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_combustible", nullable = false)
    private TipoCombustible idTipoCombustible;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @Column(name = "proveedor", length = 500)
    private String proveedor;

    @Column(name = "ubicacion", length = 500)
    private String ubicacion;

    @Lob
    @Column(name = "fotografia")
    private String fotografia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pago")
    private TipoPago idTipoPago;

}