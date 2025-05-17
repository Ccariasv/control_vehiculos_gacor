package com.gacor.control_vehiculos_gacor.controller;

import com.gacor.control_vehiculos_gacor.model.Cargo;
import com.gacor.control_vehiculos_gacor.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    // Obtener todos los cargos
    @GetMapping("all")
    public List<Cargo> getAllCargos() {
        return cargoRepository.findAll();
    }

    // Obtener cargo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getCargoById(@PathVariable Long id) {
        Optional<Cargo> cargo = cargoRepository.findById(id);
        return cargo.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo cargo
    @PostMapping
    public Cargo createCargo(@RequestBody Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    // Actualizar un cargo existente
    @PutMapping("/{id}")
    public ResponseEntity<Cargo> updateCargo(@PathVariable Long id, @RequestBody Cargo cargoDetails) {
        Optional<Cargo> optionalCargo = cargoRepository.findById(id);
        if (optionalCargo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Cargo cargo = optionalCargo.get();
        cargo.setPuesto(cargoDetails.getPuesto());
        cargo.setTipo(cargoDetails.getTipo());
        // Otros campos si los agregas

        Cargo updatedCargo = cargoRepository.save(cargo);
        return ResponseEntity.ok(updatedCargo);
    }

    // Eliminar cargo por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCargo(@PathVariable Long id) {
        Optional<Cargo> optionalCargo = cargoRepository.findById(id);
        if (optionalCargo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        cargoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
