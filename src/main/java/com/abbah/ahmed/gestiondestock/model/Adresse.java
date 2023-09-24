package com.abbah.ahmed.gestiondestock.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {

    private String adresse1 ;

    private String adresse2 ;

    private String ville ;

    private String codePostal;

    private String Pays;

}
