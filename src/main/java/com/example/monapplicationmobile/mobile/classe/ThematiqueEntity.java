package com.example.monapplicationmobile.mobile.classe;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "thematique", schema = "public", catalog = "SanaEvent")
public class ThematiqueEntity {
    private int idThem;
    private String nomThem;
    private String imageThem;
    private Timestamp dateDebutThem;
    private Timestamp dateFinThem;

    @Id
    @Column(name = "id_them")
    public int getIdThem() {
        return idThem;
    }

    public void setIdThem(int idThem) {
        this.idThem = idThem;
    }

    @Basic
    @Column(name = "nom_them")
    public String getNomThem() {
        return nomThem;
    }

    public void setNomThem(String nomThem) {
        this.nomThem = nomThem;
    }

    @Basic
    @Column(name = "image_them")
    public String getImageThem() {
        return imageThem;
    }

    public void setImageThem(String imageThem) {
        this.imageThem = imageThem;
    }

    @Basic
    @Column(name = "date_debut_them")
    public Timestamp getDateDebutThem() {
        return dateDebutThem;
    }

    public void setDateDebutThem(Timestamp dateDebutThem) {
        this.dateDebutThem = dateDebutThem;
    }

    @Basic
    @Column(name = "date_fin_them")
    public Timestamp getDateFinThem() {
        return dateFinThem;
    }

    public void setDateFinThem(Timestamp dateFinThem) {
        this.dateFinThem = dateFinThem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThematiqueEntity that = (ThematiqueEntity) o;
        return idThem == that.idThem &&
                Objects.equals(nomThem, that.nomThem) &&
                Objects.equals(imageThem, that.imageThem) &&
                Objects.equals(dateDebutThem, that.dateDebutThem) &&
                Objects.equals(dateFinThem, that.dateFinThem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idThem, nomThem, imageThem, dateDebutThem, dateFinThem);
    }
}
