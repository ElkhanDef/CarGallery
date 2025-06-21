package com.cargallery.dto;

import com.cargallery.enums.EngineType;
import com.cargallery.enums.TransmissionType;
import com.cargallery.enums.VehicleStatus;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class VehicleCreateDto {

    @NotBlank(message = "This field cannot be left blank")
    @Size(min = 1, max = 30, message = "Model name must be between 2 and 30 characters")
    private String model;

    @NotBlank(message = "This field cannot be left blank")
    @Size(max = 15, message = "This field must be maximum 15 characters")
    private String color;

    @Size(max = 200)
    private String description;


    @NotNull(message = "Engine type must be selected")
    private EngineType engineType;

    @Min(value = 1, message = "Engine capacity must be at least 1")
    private int engineCapacity;

    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private BigDecimal price;

    @Min(value = 1886, message = "Year must be valid")
    private int year;

    @NotNull(message = "Vehicle status must be selected")
    private VehicleStatus status;

    private boolean hasABS;

    @NotNull(message = "Transmission must be selected")
    private TransmissionType transmission;

    @NotNull(message = "Brand must be selected")
    private Long brandId;
}
