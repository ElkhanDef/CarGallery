package com.cargallery.dto;

import com.cargallery.enums.EngineType;
import com.cargallery.enums.TransmissionType;
import com.cargallery.enums.VehicleStatus;
import com.cargallery.model.Car;
import com.cargallery.model.Motorcycle;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
//        include = JsonTypeInfo.As.PROPERTY,
//        property = "vehicle", visible = true
//)
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = MotorcycleResponseDto.class, name = "Motorcycle"),
//        @JsonSubTypes.Type(value = CarResponseDto.class, name = "Car"),
//
//})
@Getter
@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class VehicleResponseDto {

    private Long id;
    private String model;
    private String color;
    private String description;
    private EngineType engineType;
    private int engineCapacity;
    private BigDecimal price;
    private int year;
    private VehicleStatus status;
    private boolean hasABS;
    private TransmissionType transmission;
    private LocalDateTime createdAt;
    private String brandName;


}
