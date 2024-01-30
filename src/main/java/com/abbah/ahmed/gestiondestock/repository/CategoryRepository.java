package com.abbah.ahmed.gestiondestock.repository;


import com.abbah.ahmed.gestiondestock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
