package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "logs")
public class Log {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tabla_afectada", length = 500)
    private String tablaAfectada;

    @Column(name = "id_registro")
    private Long idRegistro;

    @Column(name = "accion", length = 500)
    private String accion;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "fecha")
    private Instant fecha;

}