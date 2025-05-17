package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "viajes")
public class Viaje {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo idGrupo;

    @Column(name = "lugar_asignado", length = 500)
    private String lugarAsignado;

    @Column(name = "inicio_viaje", nullable = false)
    private Instant inicioViaje;

    @Column(name = "fin_viaje")
    private Instant finViaje;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_viajes_id", nullable = false)
    private EstadoViaje estadoViajes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_region")
    private Region idRegion;

}