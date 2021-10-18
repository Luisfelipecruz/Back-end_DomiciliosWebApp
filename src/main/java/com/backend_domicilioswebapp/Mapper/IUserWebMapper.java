package com.backend_domicilioswebapp.Mapper;

import com.backend_domicilioswebapp.DTO.UserWebDTO;
import com.backend_domicilioswebapp.Model.UserWeb;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Clase para la gestion de usuarios...
 * @author Luis Cruz
 * @since 1.0
 **/

@Mapper
public interface IUserWebMapper {
    IUserWebMapper INSTANCE = Mappers.getMapper(IUserWebMapper.class);

    // Dto's to Entitys

    /**
     * Convert UserWeb-dto to UserWeb
     **/

    @Mapping(target = "id", source = "id")
    @Mapping(target = "usuario", source = "usuario")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "idPermisos", source = "idPermisos")
    @Mapping(target = "rolUsuario", source = "rolUsuario")
    @Mapping(target = "permiso", ignore = true)
    UserWeb toUserWeb(UserWebDTO aUserWebDTO);

    // Entitys to DTO's

    /**
     * Convert UserWeb to UserWeb-dto
     **/

    @Mapping(target = "id", source = "id")
    @Mapping(target = "usuario", source = "usuario")
    @Mapping(target = "idPermisos", source = "idPermisos")
    @Mapping(target = "rolUsuario", source = "rolUsuario")
    UserWebDTO toUserWebDTO(UserWeb aUserWeb);

}
