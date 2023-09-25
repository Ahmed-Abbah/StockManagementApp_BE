package com.abbah.ahmed.gestiondestock.dto;

import com.abbah.ahmed.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {
    //FIXME
    private String code;



    public static Ventes toEntity(VentesDto ventesDto) {
        if (ventesDto == null) {
            return null;
            //todo throw exception
        }

        Ventes ventes = new Ventes();
        ventes.setCode(ventesDto.getCode());
        return  ventes;
    }

    public static VentesDto fromEntity(Ventes ventes) {
        if (ventes == null) {
            return null;
            //todo throw exception
        }

        return VentesDto.builder()
                .code(ventes.getCode())
                .build();
    }
}
