package com.cargallery.service.impl;

import com.cargallery.dto.VehicleResponseDto;
import com.cargallery.service.IVehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements IVehicleService {

    @Override
    public List<VehicleResponseDto> getVehicleById(Long id) {
        return List.of();
    }
}
