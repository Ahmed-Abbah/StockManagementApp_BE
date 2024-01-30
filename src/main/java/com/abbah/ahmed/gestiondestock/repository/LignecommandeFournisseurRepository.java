package com.abbah.ahmed.gestiondestock.repository;

import com.abbah.ahmed.gestiondestock.model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LignecommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur,Integer> {
}
