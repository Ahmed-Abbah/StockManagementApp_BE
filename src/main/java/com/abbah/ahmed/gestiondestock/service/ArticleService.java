package com.abbah.ahmed.gestiondestock.service;

import com.abbah.ahmed.gestiondestock.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    ArticleDto save(ArticleDto dto);
    ArticleDto findArticleByCode(String code);
    ArticleDto findArticleById(Integer id);
    List<ArticleDto> findAll();
    void delete(Integer id);
}
