package com.abbah.ahmed.gestiondestock.dto;


import com.abbah.ahmed.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;



@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id ;

    private String code ;

    private Instant dateCommande;


    private FournisseurDto fournisseur;


    private List<LigneCommandeFournisseurDto> ligneCommandeFourniseurs;


    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur == null){
            return null;
            //todo handle exceptions
        }

        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                //.fournisseur(FournisseurDto.fromEntity())
                .ligneCommandeFourniseurs(CommandeFournisseurDto.fromEntity(commandeFournisseur).getLigneCommandeFourniseurs())
                .build();
    }

    public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){
        if(commandeFournisseurDto == null){
            return null;
            //todo handle exceptions
        }


        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()));
        commandeFournisseur.setLigneCommandeFourniseurs(CommandeFournisseurDto.toEntity(commandeFournisseurDto).getLigneCommandeFourniseurs());

        return commandeFournisseur;
    }
}
