package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table()
public class LigneCommandeClient extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private CommandeClient commandeClient;


}
