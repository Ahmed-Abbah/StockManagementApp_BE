package com.abbah.ahmed.gestiondestock.repository;

import com.abbah.ahmed.gestiondestock.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
}
