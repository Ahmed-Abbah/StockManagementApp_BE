package com.abbah.ahmed.gestiondestock.service;


import com.abbah.ahmed.gestiondestock.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto dto);
    CategoryDto findCategoryByCode(String code);
    CategoryDto findCategoryById(Integer id);
    List<CategoryDto> findAll();
    void delete(Integer id);
}
