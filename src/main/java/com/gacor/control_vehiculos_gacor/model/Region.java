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
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "region", length = 500)
    private String region;

    @Column(name = "detalle", nullable = false, length = 500)
    private String detalle;

}