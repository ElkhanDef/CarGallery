package com.cargallery.model;

import com.cargallery.enums.MotorcycleType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "motorcycle", schema = "cargallery")
@DiscriminatorValue("Motorcycle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Motorcycle extends Vehicle {

    @Column(name = "category", nullable = false)
    private MotorcycleType category;


}
