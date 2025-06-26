package com.cargallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class CarGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarGalleryApplication.class, args);
	}

}
