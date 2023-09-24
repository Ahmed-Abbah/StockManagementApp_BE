package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Article;
import com.abbah.ahmed.gestiondestock.model.Category;
import com.abbah.ahmed.gestiondestock.model.CommandeClient;
import jakarta.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
public class CategoryDto {

    private Integer id ;

    private String code;

    private String designation;

    private List<ArticleDto> articles ;

    public static CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
            // TO DO throw an exception
        }

        List<ArticleDto> listArticleDtoTemp = new ArrayList<>();

        for ( Article com : category.getArticles()){
            listArticleDtoTemp.add(ArticleDto.fromEntity(com));
        }

        return CategoryDto
                .builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return null;
            // TO DO throw an exception
        }

        List<Article> listArticleTemp = new ArrayList<>();

        for ( ArticleDto com : categoryDto.getArticles()){
            listArticleTemp.add(ArticleDto.toEntity(com));
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return category;
    }

}
