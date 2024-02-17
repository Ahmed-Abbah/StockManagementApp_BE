package com.abbah.ahmed.gestiondestock.service;

import com.abbah.ahmed.gestiondestock.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {
    UtilisateurDto findUtilisateurByCode(String code);
    UtilisateurDto findUtilisateurById(Integer id);
    List<UtilisateurDto> findAll();
    UtilisateurDto save(UtilisateurDto dto);
    void delete(UtilisateurDto dto);
}
