package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.*;
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
@Table(name="commandeClient")
public class CommandeClient extends AbstractEntity {

    private String code;

    private String dateCommande;

    @ManyToOne()
    @JoinColumn(name="idClient")
    private Client client ;

    @OneToMany(mappedBy="commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients ;

}
