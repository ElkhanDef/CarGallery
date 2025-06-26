package com.cargallery.model;

import com.cargallery.enums.VehicleStatus;
import com.cargallery.enums.EngineType;
import com.cargallery.enums.TransmissionType;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "vehicle", schema = "cargallery")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "vehicle_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "description")
    private String description;

    @Column(name = "engine_type")
    @Enumerated(EnumType.STRING)
    private EngineType engineType;

    @Column(name = "engine_capacity", nullable = false)
    private int engineCapacity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(nullable = false, name = "year")
    private int year;

    @Column(nullable = false, name = "status")
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    @Column(name = "has_abs")
    private boolean hasABS;

    @Column(nullable = false, name = "transmission")
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission;

    @Column(nullable = false,updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id",nullable = false)
    private Brand brand;


    @PrePersist
    public void setCreatedAt() {

        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate(){
        this.updatedAt = LocalDateTime.now();
    }


}
