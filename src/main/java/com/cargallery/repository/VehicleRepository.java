package com.cargallery.repository;

import com.cargallery.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

//    @Override
//    @EntityGraph(attributePaths = {"brand"})
//    List<Vehicle> findAll();


//    @Query(value = "", nativeQuery = true)
//    List<Vehicle> getVehiclesWithParams(String brandName,
//                                        String model,
//                                        String color,
//                                        BigDecimal maxPrice,
//                                        BigDecimal minPrice);


}
