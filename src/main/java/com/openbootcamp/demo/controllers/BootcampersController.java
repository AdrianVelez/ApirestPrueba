package com.openbootcamp.demo.controllers;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;


@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;
    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Uno", Math.random()));
        this.bootcamperService.add(new Bootcamper("Dos",Math.random()) );
        this.bootcamperService.add(new Bootcamper("Tres",Math.random()));
        this.bootcamperService.add(new Bootcamper("Cuatro",Math.random()));
        this.bootcamperService.add(new Bootcamper("Cinco",Math.random()));

    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre()))
                .build();
    }

    @GET
    @Path(("/bootcampers/{nombre}"))
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }




}
