package com.gacor.control_vehiculos_gacor.controller;

import com.gacor.control_vehiculos_gacor.model.Asignacion;
import com.gacor.control_vehiculos_gacor.repository.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignaciones")
public class AsignacionController {

    @Autowired
    private AsignacionRepository asignacionRepository;

    // Obtener todas las asignaciones
    @GetMapping("/all")
    public List<Asignacion> getAllAsignaciones() {
        return asignacionRepository.findAll();
    }

    // Obtener asignaciones por empleado
    @GetMapping("/empleado/{empleadoId}")
    public List<Asignacion> getAsignacionesByEmpleado(@PathVariable Long empleadoId) {
        return asignacionRepository.findByEmpleado_Id(empleadoId);
    }

    // Obtener asignaciones por cargo
    @GetMapping("/cargo/{cargoId}")
    public List<Asignacion> getAsignacionesByCargo(@PathVariable Long cargoId) {
        return asignacionRepository.findByCargo_Id(cargoId);
    }

    // Obtener asignacion por ID
    @GetMapping("/{id}")
    public ResponseEntity<Asignacion> getAsignacionById(@PathVariable Long id) {
        Optional<Asignacion> asignacion = asignacionRepository.findById(id);
        return asignacion.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear una nueva asignación
    @PostMapping
    public Asignacion createAsignacion(@RequestBody Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    // Actualizar una asignación existente
    @PutMapping("/{id}")
    public ResponseEntity<Asignacion> updateAsignacion(@PathVariable Long id, @RequestBody Asignacion asignacionDetails) {
        Optional<Asignacion> optionalAsignacion = asignacionRepository.findById(id);
        if (optionalAsignacion.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Asignacion asignacion = optionalAsignacion.get();
        asignacion.setCargo(asignacionDetails.getCargo());
        asignacion.setEmpleado(asignacionDetails.getEmpleado());
        asignacion.setFechaAsignacion(asignacionDetails.getFechaAsignacion());
        asignacion.setFechaFinal(asignacionDetails.getFechaFinal());
        // Otros campos si se agregan

        Asignacion updatedAsignacion = asignacionRepository.save(asignacion);
        return ResponseEntity.ok(updatedAsignacion);
    }

    // Eliminar una asignación por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsignacion(@PathVariable Long id) {
        Optional<Asignacion> optionalAsignacion = asignacionRepository.findById(id);
        if (optionalAsignacion.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        asignacionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
