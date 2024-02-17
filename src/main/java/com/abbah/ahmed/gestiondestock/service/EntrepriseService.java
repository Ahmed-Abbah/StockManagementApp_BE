package com.abbah.ahmed.gestiondestock.service;

import com.abbah.ahmed.gestiondestock.dto.EntrepriseDto;

import java.util.List;

public interface EntrepriseService {
    EntrepriseDto save(EntrepriseDto dto);
    EntrepriseDto findEntrepriseByCode(String code);
    EntrepriseDto findEntrepriseById(Integer id);
    List<EntrepriseDto> findAll();
    void delete(EntrepriseDto dto);
}
