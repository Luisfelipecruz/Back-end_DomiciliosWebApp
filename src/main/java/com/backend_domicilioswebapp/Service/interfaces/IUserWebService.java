package com.backend_domicilioswebapp.Service.interfaces;

import com.backend_domicilioswebapp.Model.UserWeb;
import org.springframework.stereotype.Service;

/**
 * Clase para la gestion de usuarios...
 * @author Luis Cruz
 * @since 1.0
 **/

@Service
public interface IUserWebService {

    UserWeb createUserWeb(UserWeb aUserWeb);

    Boolean validateUser(UserWeb aUserWeb);

}
