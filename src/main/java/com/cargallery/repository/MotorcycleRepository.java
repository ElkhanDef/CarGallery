package com.cargallery.repository;

import com.cargallery.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorcycleRepository  extends JpaRepository<Motorcycle, Long> {


}
