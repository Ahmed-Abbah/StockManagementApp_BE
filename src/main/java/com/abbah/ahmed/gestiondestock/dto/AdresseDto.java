package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private String adresse1 ;

    private String adresse2 ;

    private String ville ;

    private String codePostal;

    private String Pays;

    public static AdresseDto fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
            // To Do handle exceptions
        }

        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostal(adresse.getCodePostal())
                .ville(adresse.getVille())
                .Pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDto adresseDto){
        if(adresseDto == null){
            return null ;
            // To do handle exceptions
        }

        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getCodePostal());
        adresse.setCodePostal(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());

        return adresse ;

    }


}
