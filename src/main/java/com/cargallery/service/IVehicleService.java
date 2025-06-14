package com.cargallery.service;

import com.cargallery.dto.VehicleResponseDto;
import com.cargallery.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public List<VehicleResponseDto> getVehicleById(Long id);
}
