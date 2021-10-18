package com.backend_domicilioswebapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "permisos", schema = "heroku_c36f23775e6d083")
public class Permiso {

    private static final long serialVersionUID = -703488222250480384L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "detPerm")
    private String nombrePermiso;
}
