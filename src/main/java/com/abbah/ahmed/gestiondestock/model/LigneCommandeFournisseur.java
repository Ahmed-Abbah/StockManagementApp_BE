package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article ;

    @ManyToOne
    @JoinColumn(name="idcommandefournisseur")
    private CommandeFournisseur commandefournisseur;

}
