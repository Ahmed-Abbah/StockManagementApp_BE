package com.abbah.ahmed.gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Article extends AbstractEntity {

    private String codeArticle ;

    private String designation ;

    private BigDecimal prixUnitaireHt ;

    private BigDecimal tauxTva ;

    private BigDecimal prixUnitaireTtc;

    private String photo;
    @ManyToOne()
    @JoinColumn(name="idcategorie")
    private Category categorie;

}
