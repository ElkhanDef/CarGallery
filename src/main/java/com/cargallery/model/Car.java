package com.cargallery.model;

import com.cargallery.enums.CarType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car", schema = "cargallery")
@DiscriminatorValue("Car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car extends Vehicle {

    @Column(name = "count_of_doors", nullable = false)
    private int countOfDoors;

    @Column(name = "category", nullable = false)
    private CarType category;

}
