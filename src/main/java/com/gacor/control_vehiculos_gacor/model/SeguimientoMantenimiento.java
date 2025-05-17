package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "seguimiento_mantenimiento")
public class SeguimientoMantenimiento {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo idVehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa_mantenimiento")
    private ProgramaMantenimiento idProgramaMantenimiento;

    @Column(name = "ultimo_servicio_fecha", nullable = false)
    private LocalDate ultimoServicioFecha;

    @Column(name = "ultimo_servicio_odometro", nullable = false)
    private Long ultimoServicioOdometro;

    @Column(name = "proximo_servicio_kilometraje", nullable = false)
    private Long proximoServicioKilometraje;

    @Column(name = "proximo_servicio_fecha", nullable = false)
    private LocalDate proximoServicioFecha;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

}