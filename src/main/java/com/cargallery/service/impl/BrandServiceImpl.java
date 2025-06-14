package com.cargallery.service.impl;

import com.cargallery.dto.BrandCreateDto;
import com.cargallery.dto.BrandResponseDto;
import com.cargallery.model.Brand;
import com.cargallery.repository.BrandRepository;
import com.cargallery.service.IBrandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public BrandResponseDto save(BrandCreateDto brandCreateDto) {

        Brand brand = new Brand();
        String normalizedName = brandCreateDto.getName().trim().toLowerCase();

        brand.setName(normalizedName);

        Brand savedBrand = brandRepository.save(brand);
        BrandResponseDto brandResponseDto = new BrandResponseDto();

        brandResponseDto.setName(savedBrand.getName());
        brandResponseDto.setId(savedBrand.getId());


        return brandResponseDto;
    }

    @Override
    public List<BrandResponseDto> getBrands() {

        return brandRepository.findAll()
                .stream()
                .map(brand -> new BrandResponseDto(brand.getId(), brand.getName()))
                .toList();

    }
}
