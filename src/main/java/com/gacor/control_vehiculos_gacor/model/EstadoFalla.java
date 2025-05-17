package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estado_fallas")
public class EstadoFalla {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "estado", nullable = false, length = 500)
    private String estado;

    @Lob
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

}