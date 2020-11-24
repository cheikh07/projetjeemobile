package com.example.monapplicationmobile.mobile.classe;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "utilisateur", schema = "public", catalog = "SanaEvent")
public class UtilisateurEntity {
    private int idUser;
    private String nomUser;
    private String prenomUser;
    private String loginUser;
    private String passwordUser;
    private String adresseUser;

    @Id
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nom_user")
    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    @Basic
    @Column(name = "prenom_user")
    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    @Basic
    @Column(name = "login_user")
    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Basic
    @Column(name = "password_user")
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Basic
    @Column(name = "adresse_user")
    public String getAdresseUser() {
        return adresseUser;
    }

    public void setAdresseUser(String adresseUser) {
        this.adresseUser = adresseUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilisateurEntity that = (UtilisateurEntity) o;
        return idUser == that.idUser &&
                Objects.equals(nomUser, that.nomUser) &&
                Objects.equals(prenomUser, that.prenomUser) &&
                Objects.equals(loginUser, that.loginUser) &&
                Objects.equals(passwordUser, that.passwordUser) &&
                Objects.equals(adresseUser, that.adresseUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, nomUser, prenomUser, loginUser, passwordUser, adresseUser);
    }
}
