package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "fallas")
public class Falla {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado idEmpleado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Lob
    @Column(name = "fotos")
    private String fotos;

    @Column(name = "fecha_reporte", nullable = false)
    private LocalDate fechaReporte;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_fallas_id", nullable = false)
    private EstadoFalla estadoFallas;

    @Column(name = "inicio_solucion")
    private LocalDate inicioSolucion;

    @Column(name = "fin_solucion")
    private LocalDate finSolucion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_falla_id")
    private TipoFalla tipoFalla;

}