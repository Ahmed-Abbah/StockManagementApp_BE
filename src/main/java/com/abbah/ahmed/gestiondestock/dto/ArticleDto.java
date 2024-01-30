package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class ArticleDto {
    private Integer id ;

    private String codeArticle ;

    private String designation ;

    private BigDecimal prixUnitaireHt ;

    private BigDecimal tauxTva ;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategoryDto categorie;

    public static ArticleDto fromEntity(Article article){
        if(article==null){
            return null;
            // TO DO handle exception
        }

        return ArticleDto
                .builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .build();
    }

    public static Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return null;
            // TO DO handle exception
        }

        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setPhoto(articleDto.getPhoto());
        article.setCategorie(CategoryDto.toEntity(articleDto.getCategorie()));

        return article;
    }

}
