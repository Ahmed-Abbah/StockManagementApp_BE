package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table()
public class LigneVente extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;

    private BigDecimal quantite;


}
