package com.abbah.ahmed.gestiondestock.dto;



import com.abbah.ahmed.gestiondestock.model.CommandeClient;
import com.abbah.ahmed.gestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id ;

    private String code;

    private String dateCommande;

    private ClientDto client ;

    private List<LigneCommandeClientDto> ligneCommandeClients ;


    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto == null){
            return null;
            // todo handle exceptions
        }

        List<LigneCommandeClient> listLigneCommandeClientsTemp = new ArrayList<>();

        for ( LigneCommandeClientDto ligne : commandeClientDto.getLigneCommandeClients()){
            listLigneCommandeClientsTemp.add(LigneCommandeClientDto.toEntity(ligne));
        }


        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        commandeClient.setLigneCommandeClients(listLigneCommandeClientsTemp);

        return commandeClient ;
    }

    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient == null){
            return null;
            // todo handle exceptions
        }

        List<LigneCommandeClientDto> listLigneCommandeClientsTemp = new ArrayList<>();

        for ( LigneCommandeClient ligne : commandeClient.getLigneCommandeClients()){
            listLigneCommandeClientsTemp.add(LigneCommandeClientDto.fromEntity(ligne));
        }


        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .client(CommandeClientDto.fromEntity(commandeClient).getClient())
                .ligneCommandeClients(listLigneCommandeClientsTemp)
                .build();
    }


}
