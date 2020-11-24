package com.example.monapplicationmobile.mobile.classe;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "programme", schema = "public", catalog = "SanaEvent")
public class ProgrammeEntity {
    private int idProg;
    private String nomProg;
    private String animamateurProg;
    private String lieuExecPro;

    @Id
    @Column(name = "id_prog")
    public int getIdProg() {
        return idProg;
    }

    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }

    @Basic
    @Column(name = "nom_prog")
    public String getNomProg() {
        return nomProg;
    }

    public void setNomProg(String nomProg) {
        this.nomProg = nomProg;
    }

    @Basic
    @Column(name = "animamateur_prog")
    public String getAnimamateurProg() {
        return animamateurProg;
    }

    public void setAnimamateurProg(String animamateurProg) {
        this.animamateurProg = animamateurProg;
    }

    @Basic
    @Column(name = "lieu_exec_pro")
    public String getLieuExecPro() {
        return lieuExecPro;
    }

    public void setLieuExecPro(String lieuExecPro) {
        this.lieuExecPro = lieuExecPro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammeEntity that = (ProgrammeEntity) o;
        return idProg == that.idProg &&
                Objects.equals(nomProg, that.nomProg) &&
                Objects.equals(animamateurProg, that.animamateurProg) &&
                Objects.equals(lieuExecPro, that.lieuExecPro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProg, nomProg, animamateurProg, lieuExecPro);
    }
}
