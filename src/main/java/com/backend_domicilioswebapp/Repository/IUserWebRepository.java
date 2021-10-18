package com.backend_domicilioswebapp.Repository;


import com.backend_domicilioswebapp.Model.UserWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Clase para la gestion de usuarios...
 * @author Luis Cruz
 * @since 1.0
 **/

@Repository
public interface IUserWebRepository extends JpaRepository<UserWeb, Long> {

    @Query(" SELECT u FROM  UserWeb u" +
            " WHERE (UPPER(u.usuario)  =  UPPER(:usuario) " +
            "AND (UPPER(u.password)  =  UPPER(:password)) )")
    List<UserWeb> findUsuarioWeb(String usuario, String password);

}
