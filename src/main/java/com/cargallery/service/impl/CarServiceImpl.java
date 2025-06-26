package com.cargallery.service.impl;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;
import com.cargallery.exception.ResourceNotFoundException;
import com.cargallery.mapper.CarMapper;
import com.cargallery.model.Brand;
import com.cargallery.model.Car;
import com.cargallery.repository.BrandRepository;
import com.cargallery.repository.CarRepository;
import com.cargallery.service.ICarService;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements ICarService {

    private final CarRepository carRepository;
    private final BrandRepository brandRepository;
    private final CarMapper carMapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper, BrandRepository brandRepository) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
        this.brandRepository = brandRepository;
    }

    @Override
    public CarResponseDto save(CarCreateDto carCreateDto) {

        Brand brand = brandRepository
                .findById(carCreateDto.getBrandId())
                .orElseThrow(() -> new ResourceNotFoundException("Brand not found"));

        Car car = carMapper.toEntity(carCreateDto);
        car.setBrand(brand);
        Car savedCar = carRepository.save(car);

        CarResponseDto carResponseDto = carMapper.toResponseDto(savedCar);
        carResponseDto.setBrandName(savedCar.getBrand().getName());

        return carResponseDto;

    }

    @Override
    public CarResponseDto getById(Long id) {

        Car car = carRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found"));

        return carMapper.toResponseDto(car);

    }

    @Override
    public CarResponseDto update(Long id, CarCreateDto carCreateDto) {
       Car car = carRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found"));

       Brand brand = brandRepository
               .findById(carCreateDto.getBrandId())
               .orElseThrow(() -> new ResourceNotFoundException("Brand not found"));

       carMapper.updateFromDto(carCreateDto, car);

        car.setBrand(brand);
        
       return carMapper.toResponseDto(carRepository.save(car));
    }
}
