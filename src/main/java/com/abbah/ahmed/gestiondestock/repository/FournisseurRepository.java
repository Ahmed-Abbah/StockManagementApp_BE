package com.abbah.ahmed.gestiondestock.repository;

import com.abbah.ahmed.gestiondestock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {
}
