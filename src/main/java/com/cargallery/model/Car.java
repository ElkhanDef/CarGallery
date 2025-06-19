package com.cargallery.model;

import com.cargallery.enums.CarType;
import jakarta.persistence.*;
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
   // @Enumerated(EnumType.STRING)
    private CarType category;

}
