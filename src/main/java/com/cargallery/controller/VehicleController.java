package com.cargallery.controller;

import com.cargallery.dto.VehicleResponseDtoList;
import com.cargallery.service.IVehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/vehicles")
public class VehicleController {

    private final IVehicleService vehicleService;


    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ResponseEntity<List<VehicleResponseDtoList>> getAllVehicles() {

        List<VehicleResponseDtoList> vehicles = vehicleService.getAllVehicles();


        return ResponseEntity.status(HttpStatus.OK).body(vehicles);
    }



}
