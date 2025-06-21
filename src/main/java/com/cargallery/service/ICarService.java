package com.cargallery.service;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;

import java.util.List;

public interface ICarService {

    CarResponseDto save(CarCreateDto carCreateDto);

    CarResponseDto getById(Long id);
}
