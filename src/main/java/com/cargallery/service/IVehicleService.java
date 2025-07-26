package com.cargallery.service;

import com.cargallery.dto.CarResponseDto;
import com.cargallery.dto.VehicleResponseDto;
import com.cargallery.dto.VehicleResponseDtoList;
import com.cargallery.model.Vehicle;

import java.math.BigDecimal;
import java.util.List;

public interface IVehicleService {

    List<VehicleResponseDtoList> getAllVehicles();


}
