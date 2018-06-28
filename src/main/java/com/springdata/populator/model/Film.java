package com.springdata.populator.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@Document(collection = "films")
public class Film {
    @Id
    private String id;

    private String nom;
    private String realisateur;
    private Integer annee;

    public Film(String nom, String realisateur, Integer annee) {
        this.nom = nom;
        this.realisateur = realisateur;
        this.annee = annee;
    }


}
