package com.abbah.ahmed.gestiondestock.repository;

import com.abbah.ahmed.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
}
