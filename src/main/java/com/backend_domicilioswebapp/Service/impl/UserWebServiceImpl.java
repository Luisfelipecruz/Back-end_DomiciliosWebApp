package com.backend_domicilioswebapp.Service.impl;

import com.backend_domicilioswebapp.Model.UserWeb;
import com.backend_domicilioswebapp.Repository.IUserWebRepository;
import com.backend_domicilioswebapp.Service.interfaces.IUserWebService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Clase para la gestion de usuarios...
 * @author Luis Cruz
 * @since 1.0
 **/
@Service
public class UserWebServiceImpl implements IUserWebService {

    private IUserWebRepository userWebRepository;

    /**
     * valida un UserWeb existente
     **/

    public Boolean validateUser(UserWeb aUserWeb){
        var usuarioWebList = this.userWebRepository.findUsuarioWeb(aUserWeb.getUsuario(), aUserWeb.getPassword());
        if (usuarioWebList != null && !usuarioWebList.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Crea un UserWeb
     **/

    @Override
    @Transactional
    public UserWeb createUserWeb(UserWeb aUserWeb) {
        aUserWeb.setIdPermisos(5L);
        aUserWeb.setRolUsuario("Cliente");
        return this.userWebRepository.save(aUserWeb);
    }

    // inyecciones
    @Autowired
    public void setUserWebRepository(IUserWebRepository userWebRepository) {
        this.userWebRepository = userWebRepository;
    }

}
