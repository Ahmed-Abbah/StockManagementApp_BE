package com.abbah.ahmed.gestiondestock.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table()
public class MvtStk extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article ;
}
