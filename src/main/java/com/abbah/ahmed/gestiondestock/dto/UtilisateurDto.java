package com.abbah.ahmed.gestiondestock.dto;


import com.abbah.ahmed.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
    private Integer id ;

    private String nom;


    public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
            //todo throw exception
        }

        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            return null;
            //todo throw exception
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        return utilisateur;
    }
}
