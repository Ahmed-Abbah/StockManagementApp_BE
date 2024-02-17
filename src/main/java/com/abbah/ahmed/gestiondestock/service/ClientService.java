package com.abbah.ahmed.gestiondestock.service;

import com.abbah.ahmed.gestiondestock.dto.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto save(ClientDto dto);
    ClientDto findClientByCode(String code);
    ClientDto findClientById(Integer id);
    void delete(ClientDto dto);
    List<ClientDto> findAll();
}
