package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Entreprise;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {
    private Integer id ;
    private String nom;

    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
            // todo throw sxception
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .build();


    }

    public static Entreprise fromEntity(EntrepriseDto entrepriseDto){
        if(entrepriseDto == null){
            return null;
            // todo throw sxception
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        return entreprise;

    }

}
