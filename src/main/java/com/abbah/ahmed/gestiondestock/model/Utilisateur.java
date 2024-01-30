package com.abbah.ahmed.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
