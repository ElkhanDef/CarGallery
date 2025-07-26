package com.cargallery.mapper;

import com.cargallery.dto.MotorcycleCreateDto;
import com.cargallery.dto.MotorcycleResponseDto;
import com.cargallery.model.Motorcycle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MotorcycleMapper {


    @Mapping(target = "brand",ignore = true)
    Motorcycle toEntity(MotorcycleCreateDto motorcycleCreateDto);

    @Mapping(source = "brand.name",target = "brandName")
    MotorcycleResponseDto  toResponseDto(Motorcycle motorcycle);

    @Mapping(target = "brand",ignore = true)
    void update(MotorcycleCreateDto motorcycleCreateDto, @MappingTarget Motorcycle motorcycle);

}
