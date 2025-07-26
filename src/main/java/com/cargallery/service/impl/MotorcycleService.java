package com.cargallery.service.impl;

import com.cargallery.dto.MotorcycleCreateDto;
import com.cargallery.dto.MotorcycleResponseDto;
import com.cargallery.exception.ResourceNotFoundException;
import com.cargallery.mapper.MotorcycleMapper;
import com.cargallery.model.Brand;
import com.cargallery.model.Motorcycle;
import com.cargallery.repository.BrandRepository;
import com.cargallery.repository.MotorcycleRepository;
import com.cargallery.service.IMotorcycleService;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleService implements IMotorcycleService {

    private final MotorcycleRepository motorcycleRepository;
    private final BrandRepository brandRepository;
    private final MotorcycleMapper motorcycleMapper;

    public MotorcycleService(MotorcycleRepository motorcycleRepository, BrandRepository brandRepository, MotorcycleMapper motorcycleMapper) {
        this.motorcycleRepository = motorcycleRepository;
        this.brandRepository = brandRepository;
        this.motorcycleMapper = motorcycleMapper;
    }


    @Override
    public MotorcycleResponseDto save(MotorcycleCreateDto motorcycleCreateDto) {


        Brand brand = brandRepository
                .findById(motorcycleCreateDto.getBrandId())
                .orElseThrow(() -> new ResourceNotFoundException("Brand not found"));


        Motorcycle motorcycle = motorcycleMapper.toEntity(motorcycleCreateDto);
        motorcycle.setBrand(brand);


        Motorcycle savedMotorcycle = motorcycleRepository.save(motorcycle);

        return motorcycleMapper.toResponseDto(savedMotorcycle);

    }

    @Override
    public MotorcycleResponseDto getById(Long id) {
        Motorcycle motorcycle = motorcycleRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("Motorcycle not found"));

        return motorcycleMapper.toResponseDto(motorcycle);
    }

    @Override
    public MotorcycleResponseDto update(Long id, MotorcycleCreateDto motorcycleCreateDto) {

        Motorcycle motorcycle = motorcycleRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("Motorcycle not found"));

        motorcycleMapper.update(motorcycleCreateDto, motorcycle);

        return motorcycleMapper.toResponseDto(motorcycleRepository.save(motorcycle));
    }

    @Override
    public void deleteById(Long id) {

        if (!motorcycleRepository.existsById(id)){
            throw new ResourceNotFoundException("Motorcycle with ID " + id + " was not found.");
        }
         motorcycleRepository.deleteById(id);

    }
}
