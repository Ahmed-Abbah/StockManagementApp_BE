package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Integer id ;
    private ArticleDto article ;

    private CommandeFournisseurDto commandeFournisseur;

    public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
        if(ligneCommandeFournisseur == null){
            return null ;
            // todo handle exceptions
        }

        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
                .commandeFournisseur(CommandeFournisseurDto.fromEntity(ligneCommandeFournisseur.getCommandefournisseur()))
                .build();
    }

    public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        if(ligneCommandeFournisseurDto == null){
            return null ;
            // todo handle exceptions
        }

        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setArticle(ArticleDto.toEntity(ligneCommandeFournisseurDto.getArticle()));
        ligneCommandeFournisseur.setCommandefournisseur(CommandeFournisseurDto.toEntity(ligneCommandeFournisseurDto.getCommandeFournisseur()));

        return ligneCommandeFournisseur;
    }

}
