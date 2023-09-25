package com.abbah.ahmed.gestiondestock.validator;


import com.abbah.ahmed.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto){

        List<String> errors = new ArrayList<>();


        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez renseigner un nom.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez renseigner un prenom.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veuillez renseigner un email.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getAdresse().toString())){
            errors.add("Veuillez renseigner une adresse.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getCodePostal().toString())){
            errors.add("veuillez saisir un code postal.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getVille().toString())){
            errors.add("le champ ville est obligatoire.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getPays().toString())){
            errors.add("le champs pays est obligatoire.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getDateDeNaissance())){
            errors.add("Veuillez renseigner une date de naissance.");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Veuillez saisir un mot de passe.");
        }

        return errors;
    }
}
