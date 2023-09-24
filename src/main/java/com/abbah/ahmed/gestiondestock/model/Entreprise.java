package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table
public class Entreprise extends AbstractEntity {

    private String nom;

}
