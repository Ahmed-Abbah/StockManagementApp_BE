package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Entreprise;
import com.abbah.ahmed.gestiondestock.model.LigneCommandeFournisseur;
import com.abbah.ahmed.gestiondestock.model.LigneVente;
import com.abbah.ahmed.gestiondestock.model.Ventes;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Loader;

import java.math.BigDecimal;
@Data
@Builder
public class LigneVenteDto {

    private Integer id ;

    private VentesDto vente;

    private BigDecimal quantite;

    public static LigneVenteDto fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return null;
            // todo throw sxception
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .vente(VentesDto.fromEntity(ligneVente.getVente()))
                .quantite(ligneVente.getQuantite())
                .build();


    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if(ligneVenteDto == null){
            return null;
            // todo throw sxception
        }

        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setVente(VentesDto.toEntity(ligneVenteDto.getVente()));
        ligneVente.setQuantite(ligneVenteDto.getQuantite());


        return ligneVente;

    }

}
