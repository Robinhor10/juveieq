package com.github.Robinhor10.juveieq.resource;

import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.github.Robinhor10.juveieq.model.Cadastro;

import javax.ws.rs.POST;


/* Classe cadastroresource tem o objetivo de receber a requisição ex: postman e iniciar o processo de cadastrar o registro do usuario
*/
@Path("/cadastro")
public class CadastroResource {

    @POST
    @Transactional
    @RolesAllowed("user")
    @Consumes(MediaType.APPLICATION_JSON)

    public void inserir (@Context SecurityContext securityContext, Cadastro cadastro) {
        
    }

}