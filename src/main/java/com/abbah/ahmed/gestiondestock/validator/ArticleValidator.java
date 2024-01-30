package com.abbah.ahmed.gestiondestock.validator;

import com.abbah.ahmed.gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    //todo complete all the validators
    public static List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veuillez renseigner le code de l'article.");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("veuillez renseigner la designation de l'article.");
        }
        if(!StringUtils.hasLength(articleDto.getPhoto())){
            errors.add("veuillez renseigner une photo de l'article.");
        }

        if(articleDto.getCategorie() == null){
            errors.add("veuillez renseigner une catégorie de l'article.");
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veuillez renseigner le code de l'article.");
        }
        return errors;
    }
}
