package com.cargallery.service;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;

import java.util.List;

public interface ICarService {

    public List<CarResponseDto> save(CarCreateDto carCreateDto);
}
