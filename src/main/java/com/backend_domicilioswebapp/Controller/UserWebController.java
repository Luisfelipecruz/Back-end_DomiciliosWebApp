package com.backend_domicilioswebapp.Controller;

import com.backend_domicilioswebapp.DTO.UserLoginDTO;
import com.backend_domicilioswebapp.DTO.UserWebDTO;
import com.backend_domicilioswebapp.Mapper.IUserWebMapper;
import com.backend_domicilioswebapp.Model.UserWeb;
import com.backend_domicilioswebapp.Service.interfaces.IUserWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Clase para la gestion de usuarios...
 * @author Luis Cruz
 * @since 1.0
 **/

@RestController
@RequestMapping("/usuario")
public class UserWebController {

    private IUserWebService userWebService;

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@Valid @RequestBody UserLoginDTO userLoginDTO) {
        UserWebDTO userDTO = new UserWebDTO();
        userDTO.setUsuario(userLoginDTO.getUsuario());
        userDTO.setPassword(userLoginDTO.getPassword());
        Boolean respuesta = this.userWebService.validateUser(IUserWebMapper.INSTANCE.toUserWeb(userDTO));

        if (respuesta == null || !respuesta) {
            return new ResponseEntity<>(false, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    /**
     * Create una usuarios. validate restrictions by DTO
     * @param userLoginDTO
     **/

    @PostMapping("/crear")
    public ResponseEntity<UserWebDTO> createTipoVacacion(@Valid @RequestBody UserLoginDTO userLoginDTO) {
        UserWebDTO userDTO = new UserWebDTO();
        userDTO.setUsuario(userLoginDTO.getUsuario());
        userDTO.setPassword(userLoginDTO.getPassword());
        UserWeb userWeb = this.userWebService.createUserWeb(IUserWebMapper.INSTANCE.toUserWeb(userDTO));
        return new ResponseEntity<>(IUserWebMapper.INSTANCE.toUserWebDTO(userWeb), HttpStatus.CREATED);
    }

    // inyecciones
    @Autowired
    public void setUserWebService(IUserWebService userWebService) {
        this.userWebService = userWebService;
    }
}
