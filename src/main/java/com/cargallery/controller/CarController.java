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

    @GetMapping(path = "{id}")
    public ResponseEntity<CarResponseDto> getById(@PathVariable Long id) {

        return ResponseEntity.status(HttpStatus.OK).body(carService.getById(id));

    }


}
