package com.cargallery.mapper;

import com.cargallery.dto.CarCreateDto;
import com.cargallery.dto.CarResponseDto;
import com.cargallery.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {


     @Mapping(target = "brand", ignore = true)
     Car toEntity(CarCreateDto carCreateDto);

     @Mapping(source = "brand.name", target = "brandName")
     CarResponseDto toResponseDto(Car car);

     @Mapping(source = "brand.name", target = "brandName")
     List<CarResponseDto> toResponseDtoList(List<Car> cars);
}
