package com.abbah.ahmed.gestiondestock.dto;


import com.abbah.ahmed.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
    private Integer id ;

    private String nom;


    public static RolesDto fromEntity(Roles roles) {

        if(roles == null){
            return null;
            //todo throw exception
        }

        return RolesDto.builder()
                .id(roles.getId())
                .nom(roles.getNom())
                .build();
    }

    public Roles toEntity(RolesDto rolesDto) {
        if(rolesDto == null){
            return null;
            //todo throw exception
        }
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setNom(rolesDto.getNom());
        return roles;
    }
}
