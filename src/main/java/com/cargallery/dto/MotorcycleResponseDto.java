package com.cargallery.dto;

import com.cargallery.enums.MotorcycleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MotorcycleResponseDto extends VehicleResponseDto {

    private MotorcycleType category;
}
