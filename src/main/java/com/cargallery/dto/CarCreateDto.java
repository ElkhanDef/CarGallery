package com.cargallery.dto;

import com.cargallery.enums.CarType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarCreateDto extends VehicleCreateDto{

    @Min(value = 1, message = "Door count must be at least 1")
    private int countOfDoors;

    @NotNull(message = "Car type must be selected")
    private CarType category;
}
