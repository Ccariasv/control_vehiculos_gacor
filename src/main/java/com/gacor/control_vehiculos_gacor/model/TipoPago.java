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
@Table(name = "tipo_pago")
public class TipoPago {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "field_2")
    private Long field2;

}