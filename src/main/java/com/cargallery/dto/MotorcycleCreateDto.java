package com.cargallery.dto;

import com.cargallery.enums.MotorcycleType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MotorcycleCreateDto extends VehicleCreateDto {

    @NotNull(message = "Motorcycle type must be selected")
    private MotorcycleType category;

}
