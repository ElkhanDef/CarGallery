package com.cargallery.model;

import com.cargallery.enums.MotorcycleType;
import jakarta.persistence.*;
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
    @Enumerated(EnumType.STRING)
    private MotorcycleType category;


}
