package com.gacor.control_vehiculos_gacor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "items_mantenimiento")
public class ItemsMantenimiento {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa_mantenimiento")
    private ProgramaMantenimiento idProgramaMantenimiento;

    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;

    @Column(name = "intervalo_kilometraje", nullable = false)
    private Long intervaloKilometraje;

    @Column(name = "intervalo_tiempo_meses", nullable = false)
    private Integer intervaloTiempoMeses;

}