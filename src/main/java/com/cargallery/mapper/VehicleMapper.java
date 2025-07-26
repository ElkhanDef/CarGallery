package com.cargallery.mapper;

import com.cargallery.dto.VehicleResponseDto;
import com.cargallery.dto.VehicleResponseDtoList;
import com.cargallery.model.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mapping(source = "brand.name", target = "brandName")
    VehicleResponseDtoList toVehicleResponseDto(Vehicle vehicle);

    @Mapping(source = "brand.name", target = "brandName")
    List<VehicleResponseDtoList> toVehicleResponseDtoList(List<Vehicle> vehicles);


}
