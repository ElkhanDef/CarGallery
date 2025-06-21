package com.cargallery.repository;

import com.cargallery.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

//    @Override
//    @EntityGraph(attributePaths = {"brand"})
//    List<Vehicle> findAll();
}
