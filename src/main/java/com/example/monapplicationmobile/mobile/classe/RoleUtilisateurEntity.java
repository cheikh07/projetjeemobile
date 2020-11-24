package com.example.monapplicationmobile.mobile.classe;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_utilisateur", schema = "public", catalog = "SanaEvent")
public class RoleUtilisateurEntity {
    private int idRole;
    private String nomRole;

    @Id
    @Column(name = "id_role")
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "nom_role")
    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleUtilisateurEntity that = (RoleUtilisateurEntity) o;
        return idRole == that.idRole &&
                Objects.equals(nomRole, that.nomRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, nomRole);
    }
}
