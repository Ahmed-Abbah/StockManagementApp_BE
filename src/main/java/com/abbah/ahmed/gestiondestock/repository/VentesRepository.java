package com.abbah.ahmed.gestiondestock.repository;

import com.abbah.ahmed.gestiondestock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentesRepository extends JpaRepository<Ventes,Integer> {
}
