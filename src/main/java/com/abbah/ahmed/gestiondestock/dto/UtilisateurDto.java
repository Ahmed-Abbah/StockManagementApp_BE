package com.abbah.ahmed.gestiondestock.dto;



import com.abbah.ahmed.gestiondestock.model.Roles;
import com.abbah.ahmed.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id ;

    private String nom;

    private String prenom;

    private String email;

    private AdresseDto adresse;

    private String ville;

    private String codePostal;

    private String pays;

    private String dateDeNaissance;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;


    public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
            //todo throw exception
        }

        List<RolesDto> temp = new ArrayList<>();
        for(Roles role : utilisateur.getRoles()){
            temp.add(RolesDto.fromEntity(role));
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
                .ville(utilisateur.getVille())
                .codePostal(utilisateur.getCodePostal())
                .pays(utilisateur.getPays())
                .email(utilisateur.getEmail())
                .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .roles(temp)
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            return null;
            //todo throw exception
        }

        List<Roles> temp = new ArrayList<>();
        for(RolesDto role : utilisateurDto.getRoles()){
            temp.add(RolesDto.toEntity(role));
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setAdresse(AdresseDto.toEntity(utilisateurDto.getAdresse()));
        utilisateur.setVille(utilisateurDto.getVille());
        utilisateur.setCodePostal(utilisateurDto.getCodePostal());
        utilisateur.setPays(utilisateurDto.getPays());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setEntreprise(EntrepriseDto.toEntity(utilisateurDto.getEntreprise()));
        utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
        utilisateur.setRoles(temp);

        return utilisateur;
    }
}
