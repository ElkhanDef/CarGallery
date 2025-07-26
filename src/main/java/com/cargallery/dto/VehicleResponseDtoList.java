package com.cargallery.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class VehicleResponseDtoList {

    private String model;
    private BigDecimal price;
    private int year;
    private String brandName;


}
