package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "historial_notificaciones")
public class HistorialNotificacione {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_notificacion", nullable = false)
    private Notificacione idNotificacion;

    @Column(name = "estado_envio", length = 500)
    private String estadoEnvio;

    @Column(name = "fecha_envio")
    private Instant fechaEnvio;

    @Column(name = "fecha_lectura")
    private Instant fechaLectura;

}