/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fap.pos.fappos.service;

import java.time.Instant;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ALUNO
 */
@Path("/recurso")
public class PosFapResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public String getInstante() {
        return "A hora atual do servidor é: " + Instant.now();
    }
}
