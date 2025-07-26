package com.cargallery.controller;

import com.cargallery.dto.MotorcycleCreateDto;
import com.cargallery.dto.MotorcycleResponseDto;
import com.cargallery.service.IMotorcycleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/motorcycles")
public class MotorcycleController {

    private final IMotorcycleService motorcycleService;

    public MotorcycleController(IMotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @PostMapping
    public ResponseEntity<MotorcycleResponseDto> save(@Valid @RequestBody MotorcycleCreateDto motorcycleCreateDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(motorcycleService.save(motorcycleCreateDto));

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<MotorcycleResponseDto> getById(@PathVariable Long id) {

        return ResponseEntity.status(HttpStatus.OK).body(motorcycleService.getById(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<MotorcycleResponseDto> update(@Valid @RequestBody MotorcycleCreateDto motorcycleCreateDto, @PathVariable Long id) {
        return ResponseEntity.ok(motorcycleService.update(id, motorcycleCreateDto));

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        motorcycleService.deleteById(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
