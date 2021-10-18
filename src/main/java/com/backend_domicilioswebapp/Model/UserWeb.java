package com.backend_domicilioswebapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "usersweb", schema = "heroku_c36f23775e6d083")
public class UserWeb implements Serializable {

    private static final long serialVersionUID = 1149347013781487364L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user")
    private String usuario;

    @Column(name = "pass")
    private String password;

    @Column(name = "id_permisos", nullable = false)
    private Long idPermisos;

    @Column(name = "rol")
    private String rolUsuario;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_permisos", insertable = false, updatable = false)
    private Permiso permiso;

}
