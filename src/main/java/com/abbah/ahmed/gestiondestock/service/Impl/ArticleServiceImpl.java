package com.abbah.ahmed.gestiondestock.service.Impl;

import com.abbah.ahmed.gestiondestock.dto.ArticleDto;
import com.abbah.ahmed.gestiondestock.exception.EntityNotFoundException;
import com.abbah.ahmed.gestiondestock.exception.ErrorCodes;
import com.abbah.ahmed.gestiondestock.exception.InvalidEntityException;
import com.abbah.ahmed.gestiondestock.model.Article;
import com.abbah.ahmed.gestiondestock.repository.ArticleRepository;
import com.abbah.ahmed.gestiondestock.service.ArticleService;
import com.abbah.ahmed.gestiondestock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    ArticleRepository articleRepository;

    @Autowired
    ArticleServiceImpl(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
        List<String> errors = ArticleValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Article is not valid {}",dto);
            throw new InvalidEntityException("L'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID,errors);
        }
        return ArticleDto.fromEntity(
                articleRepository.save(
                    ArticleDto.toEntity(dto)
            )
        );
    }

    @Override
    public ArticleDto findArticleById(Integer id) {
        if (id == null) {
            log.error("Article ID is null");
            return null;
        }
        return articleRepository.findById(id)
                .map(ArticleDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Aucun article avec l'ID = " + id + " n'a été trouve dans la BDD .",
                        ErrorCodes.ARTICLE_NOT_FOUND
                ));
    }


    @Override
    public ArticleDto findArticleByCode(String code) {
        if (code == null) {
            log.error("Article code is null .");
            return null;
        }
        return articleRepository.findArticleByCode(code)
                .map(ArticleDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Aucun article avec le CODE = " + code + " n'a été trouve dans la BDD .",
                        ErrorCodes.ARTICLE_NOT_FOUND
                ));
    }



    @Override
    public List<ArticleDto> findAll() {

        return articleRepository.findAll()
                .stream()
                .map(ArticleDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id){
        if (id == null) {
            log.error("Article id is null .");
            return;
        }
        articleRepository.deleteById(id);
    }
}
