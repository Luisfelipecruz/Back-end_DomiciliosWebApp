package com.backend_domicilioswebapp.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Clase para el manejo de vacaciones causadas...
 * @author Luis Cruz
 **/

@Getter
@Setter
@NoArgsConstructor
public class UserWebDTO implements Serializable {

    private static final long serialVersionUID = 5156593020300315375L;

    private Long id;

    private String usuario;

    private String password;

    private Long idPermisos;

    private String rolUsuario;

}
