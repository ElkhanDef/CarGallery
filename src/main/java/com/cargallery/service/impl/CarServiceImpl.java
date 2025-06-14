package com.cargallery.service.impl;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;
import com.cargallery.service.ICarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Override
    public List<CarResponseDto> save(CarCreateDto carCreateDto) {

        return List.of();
    }
}
