package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "notificaciones")
public class Notificacione {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

    @Column(name = "titulo", length = 500)
    private String titulo;

    @Lob
    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "tipo", length = 500)
    private String tipo;

    @Column(name = "leido")
    private Boolean leido;

    @Column(name = "fecha_envio")
    private Instant fechaEnvio;

}