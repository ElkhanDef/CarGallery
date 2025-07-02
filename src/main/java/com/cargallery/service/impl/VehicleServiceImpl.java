package com.cargallery.service.impl;

import com.cargallery.dto.CarResponseDto;
import com.cargallery.dto.VehicleResponseDto;
import com.cargallery.mapper.VehicleMapper;
import com.cargallery.model.Vehicle;
import com.cargallery.repository.VehicleRepository;
import com.cargallery.service.IVehicleService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VehicleServiceImpl implements IVehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, VehicleMapper vehicleMapper) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleMapper = vehicleMapper;
    }

    @Override
    public List<VehicleResponseDto> getAllVehicles() {


        List<Vehicle> vehicleList = vehicleRepository.findAll();

        return vehicleMapper.toVehicleResponseDtoList(vehicleList);
    }


}
