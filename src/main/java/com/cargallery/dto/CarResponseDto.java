package com.cargallery.dto;

import com.cargallery.enums.CarType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarResponseDto extends VehicleResponseDto {

    private int countOfDoors;
    private CarType category;
}
