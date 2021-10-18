package com.backend_domicilioswebapp.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * Clase para el manejo de loguin usuarios...
 * @author Luis Cruz
 **/

@Getter
@Setter
@NoArgsConstructor
public class UserLoginDTO  implements Serializable {

    private static final long serialVersionUID = 7649916089082924050L;

    @NotNull
    private String usuario;
    @NotNull
    private String password;

}
