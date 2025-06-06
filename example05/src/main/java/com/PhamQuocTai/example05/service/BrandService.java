package com.PhamQuocTai.example05.service;

import com.PhamQuocTai.example05.entity.Brand;
import com.PhamQuocTai.example05.payloads.BrandDTO;
import com.PhamQuocTai.example05.payloads.BrandResponse;

public interface BrandService {
    
    BrandDTO createBrand(Brand brand);
    BrandResponse getBrands(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    BrandDTO updateBrand(Brand brand, Long brandId);
    String deleteBrand(Long brandId);
    BrandDTO getBrandById(Long brandId);
}
