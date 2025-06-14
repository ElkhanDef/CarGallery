package com.cargallery.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BrandCreateDto {

    @Size(min = 1, max = 50,message = "The name must be between 1 and 50 characters long")
    @NotBlank(message = "Please enter a valid name")
    private String name;
}
