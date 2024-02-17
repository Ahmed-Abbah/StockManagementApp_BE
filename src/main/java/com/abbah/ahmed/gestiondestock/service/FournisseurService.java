package com.abbah.ahmed.gestiondestock.service;

import com.abbah.ahmed.gestiondestock.dto.FournisseurDto;

import java.util.List;

public interface FournisseurService {
    FournisseurDto save(FournisseurDto dto);
    FournisseurDto findFournisseurByCode(String code);
    FournisseurDto findFournisseurById(Integer id);
    List<FournisseurDto> findAll();
    void delete(Integer id);
}
