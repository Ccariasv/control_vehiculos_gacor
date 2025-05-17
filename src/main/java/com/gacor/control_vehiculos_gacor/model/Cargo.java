package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cargo")
public class Cargo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "puesto", nullable = false, length = 500)
    private String puesto;

    @Column(name = "tipo", nullable = false, length = 500)
    private String tipo;

    @OneToMany(mappedBy = "cargo")
    private List<Asignacion> asignaciones;

}