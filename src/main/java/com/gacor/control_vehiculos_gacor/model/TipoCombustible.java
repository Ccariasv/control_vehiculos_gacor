package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipo_combustible")
public class TipoCombustible {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tipo", nullable = false, length = 500)
    private String tipo;

}