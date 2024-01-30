package com.abbah.ahmed.gestiondestock.dto;


import com.abbah.ahmed.gestiondestock.model.Client;
import com.abbah.ahmed.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
public class ClientDto {

    private Integer id ;

    private String nom;

    private String prenom;

    private AdresseDto adresse ;

    private String photo;

    private String email;

    private String numTel;

    private List<CommandeClientDto> commandesClient ;


    public static ClientDto fromEntity(Client client){
        if(client == null){
            return null;
            // todo handle exceptions
        }
        List<CommandeClientDto> listCommandeClientsTemp = new ArrayList<>();

        for ( CommandeClient com : client.getCommandesClient()){
            listCommandeClientsTemp.add(CommandeClientDto.fromEntity(com));
        }

        return ClientDto.builder()
                .id(client.getId())
                .email(client.getEmail())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .numTel(client.getNumTel())
                .photo(client.getPhoto())
                .prenom(client.getPrenom())
                .nom(client.getNom())
                .commandesClient(listCommandeClientsTemp)
                .build();
    }


    public static Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
            // todo handle exceptions
        }

        List<CommandeClient> listCommandeClientsTemp = new ArrayList<>();

        for ( CommandeClientDto com : clientDto.getCommandesClient()){
            listCommandeClientsTemp.add(CommandeClientDto.toEntity(com));
        }

        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setPhoto(clientDto.getPhoto());
        client.setNumTel(clientDto.getNumTel());
        client.setEmail(clientDto.getEmail());
        client.setCommandesClient(listCommandeClientsTemp);
        return client ;
    }

}

