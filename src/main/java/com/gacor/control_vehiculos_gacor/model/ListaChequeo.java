package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "lista_chequeo")
public class ListaChequeo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado idEmpleado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @Column(name = "fecha")
    private Instant fecha;

    @Column(name = "tipo", nullable = false, length = 500)
    private String tipo;

    @Lob
    @Column(name = "formulario", nullable = false)
    private String formulario;

    @Column(name = "odometro")
    private Long odometro;

    @Column(name = "proximo_servicio")
    private Double proximoServicio;

    @Lob
    @Column(name = "fotos", nullable = false)
    private String fotos;

    @Lob
    @Column(name = "observaciones", nullable = false)
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_viaje")
    private Viaje idViaje;

}