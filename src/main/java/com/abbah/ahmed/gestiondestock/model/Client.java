package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="client")
public class Client extends AbstractEntity {

    private String nom;

    private String prenom;

    private Adresse adresse ;

    private String photo;

    private String email;

    private String numTel;
    @OneToMany(mappedBy="client")
    private List<CommandeClient> commandesClient ;
}
