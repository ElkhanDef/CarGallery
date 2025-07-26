package com.cargallery.controller;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;
import com.cargallery.service.ICarService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/cars")
public class CarController {

    private final ICarService carService;

    public CarController(ICarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarResponseDto> save(@Valid @RequestBody CarCreateDto carCreateDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carCreateDto));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CarResponseDto> getById(@PathVariable Long id) {

        return ResponseEntity.status(HttpStatus.OK).body(carService.getById(id));

    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<CarResponseDto> update(@PathVariable Long id, @Valid @RequestBody CarCreateDto carCreateDto) {

        return ResponseEntity.status(HttpStatus.OK).body(carService.update(id, carCreateDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        carService.deleteById(id);
        return ResponseEntity.noContent().build();

    }




}
