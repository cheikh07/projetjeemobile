package com.example.monapplicationmobile.mobile.classe;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "animateur", schema = "public", catalog = "SanaEvent")
public class AnimateurEntity {
    private int idAnimateur;
    private String nomAnimateur;
    private String prenomQnimateur;
    private String profession;
    private String adresseAnimateur;

    @Id
    @Column(name = "id_animateur")
    public int getIdAnimateur() {
        return idAnimateur;
    }

    public void setIdAnimateur(int idAnimateur) {
        this.idAnimateur = idAnimateur;
    }

    @Basic
    @Column(name = "nom_animateur")
    public String getNomAnimateur() {
        return nomAnimateur;
    }

    public void setNomAnimateur(String nomAnimateur) {
        this.nomAnimateur = nomAnimateur;
    }

    @Basic
    @Column(name = "prenom_qnimateur")
    public String getPrenomQnimateur() {
        return prenomQnimateur;
    }

    public void setPrenomQnimateur(String prenomQnimateur) {
        this.prenomQnimateur = prenomQnimateur;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "adresse_animateur")
    public String getAdresseAnimateur() {
        return adresseAnimateur;
    }

    public void setAdresseAnimateur(String adresseAnimateur) {
        this.adresseAnimateur = adresseAnimateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimateurEntity that = (AnimateurEntity) o;
        return idAnimateur == that.idAnimateur &&
                Objects.equals(nomAnimateur, that.nomAnimateur) &&
                Objects.equals(prenomQnimateur, that.prenomQnimateur) &&
                Objects.equals(profession, that.profession) &&
                Objects.equals(adresseAnimateur, that.adresseAnimateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimateur, nomAnimateur, prenomQnimateur, profession, adresseAnimateur);
    }
}
