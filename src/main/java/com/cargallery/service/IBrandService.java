package com.cargallery.service;

import com.cargallery.dto.BrandCreateDto;
import com.cargallery.dto.BrandResponseDto;

import java.util.List;

public interface IBrandService {

    BrandResponseDto save(BrandCreateDto brandCreateDto);
    List<BrandResponseDto> getBrands();
}
