package com.abbah.ahmed.gestiondestock.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class LigneVenteDto {

    private Integer id ;

    private VentesDto vente;

    private BigDecimal quantite;

}
