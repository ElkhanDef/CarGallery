package com.cargallery.service;

import com.cargallery.dto.MotorcycleCreateDto;
import com.cargallery.dto.MotorcycleResponseDto;

public interface IMotorcycleService {

    MotorcycleResponseDto save(MotorcycleCreateDto motorcycleCreateDto);

    MotorcycleResponseDto getById(Long id);

    MotorcycleResponseDto update(Long id, MotorcycleCreateDto motorcycleCreateDto);

    void deleteById(Long id);
}
