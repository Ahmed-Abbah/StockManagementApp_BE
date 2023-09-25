package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Adresse;
import com.abbah.ahmed.gestiondestock.model.CommandeFournisseur;
import com.abbah.ahmed.gestiondestock.model.Fournisseur;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
public class FournisseurDto {

    private Integer id ;

    private String nom;

    private String prenom;

    private AdresseDto adresse ;

    private String photo;

    private String email;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseur ;

    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return null;
            //To Do handle exceptions
        }

        List<CommandeFournisseur> commandeFournisseursTemp = new ArrayList<>();
        for ( CommandeFournisseurDto com : fournisseurDto.getCommandeFournisseur()){
            commandeFournisseursTemp.add(CommandeFournisseurDto.toEntity(com));
        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseur.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setAdresse(fournisseur.getAdresse());
        fournisseur.setPhoto(fournisseur.getPhoto());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setNumTel(fournisseur.getNumTel());
        fournisseur.setCommandeFournisseur(commandeFournisseursTemp);
        return fournisseur;

    }

    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
            //To Do handle exceptions
        }

        List<CommandeFournisseurDto> commandeFournisseursDtoTemp = new ArrayList<>();
        for ( CommandeFournisseur com : fournisseur.getCommandeFournisseur()){
            commandeFournisseursDtoTemp.add(CommandeFournisseurDto.fromEntity(com));
        }


        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .photo(fournisseur.getPhoto())
                .email(fournisseur.getEmail())
                .numTel(fournisseur.getNumTel())
                .commandeFournisseur(commandeFournisseursDtoTemp)
                .build();


    }

}
