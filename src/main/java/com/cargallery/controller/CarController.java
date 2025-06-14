package com.cargallery.controller;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;
import com.cargallery.service.ICarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/cars/")
public class CarController {

    private final ICarService carService;

    public CarController(ICarService carService) {
        this.carService = carService;
    }

//    @PostMapping
//    public CarResponseDto save(@RequestBody CarCreateDto carCreateDto) {
//
//
//    }


}
