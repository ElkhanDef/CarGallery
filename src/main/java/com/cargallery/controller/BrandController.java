package com.cargallery.controller;

import com.cargallery.dto.BrandCreateDto;
import com.cargallery.dto.BrandResponseDto;
import com.cargallery.service.IBrandService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/brands")
public class BrandController {

    public final IBrandService brandService;

    public BrandController(IBrandService brandService) {
        this.brandService = brandService;
    }


    @PostMapping
    public ResponseEntity<BrandResponseDto> save(@Valid @RequestBody BrandCreateDto brandCreateDto) {

        BrandResponseDto savedBrand = brandService.save(brandCreateDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedBrand);

    }

    @GetMapping
    public ResponseEntity<List<BrandResponseDto>> getBrands() {

        return ResponseEntity.ok(brandService.getBrands());
    }



}
