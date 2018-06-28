package com.springdata.populator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

    public Film() {
    }

    public String getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getRealisateur() {
        return this.realisateur;
    }

    public Integer getAnnee() {
        return this.annee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Film)) return false;
        final Film other = (Film) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.id;
        final Object other$id = other.id;
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nom = this.nom;
        final Object other$nom = other.nom;
        if (this$nom == null ? other$nom != null : !this$nom.equals(other$nom)) return false;
        final Object this$realisateur = this.realisateur;
        final Object other$realisateur = other.realisateur;
        if (this$realisateur == null ? other$realisateur != null : !this$realisateur.equals(other$realisateur))
            return false;
        final Object this$annee = this.annee;
        final Object other$annee = other.annee;
        if (this$annee == null ? other$annee != null : !this$annee.equals(other$annee)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.id;
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nom = this.nom;
        result = result * PRIME + ($nom == null ? 43 : $nom.hashCode());
        final Object $realisateur = this.realisateur;
        result = result * PRIME + ($realisateur == null ? 43 : $realisateur.hashCode());
        final Object $annee = this.annee;
        result = result * PRIME + ($annee == null ? 43 : $annee.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Film;
    }

    public String toString() {
        return "Film(id=" + this.id + ", nom=" + this.nom + ", realisateur=" + this.realisateur + ", annee=" + this.annee + ")";
    }
}
