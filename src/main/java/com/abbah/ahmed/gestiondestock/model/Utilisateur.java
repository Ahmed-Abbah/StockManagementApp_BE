package com.abbah.ahmed.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="utilisateur")
public class Utilisateur extends AbstractEntity {

    private String nom;

    private String prenom;

    private String email;

    private Adresse adresse;
    @Column(insertable=false, updatable=false)
    private String ville;
    @Column(insertable=false, updatable=false)
    private String codePostal;
    @Column(insertable=false, updatable=false)
    private String pays;

    private String dateDeNaissance;

    private String motDePasse;


    private Entreprise entreprise;


    private List<Roles> roles;



}
