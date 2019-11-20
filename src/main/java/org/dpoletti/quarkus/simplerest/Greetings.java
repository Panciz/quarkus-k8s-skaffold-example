package org.dpoletti.quarkus.simplerest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Greetings {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
    
  /*  @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{name}")
    public String helloName(@PathParam(value = "name") String name) {
        return "hello "+name;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{name}/{surname}")
    public String helloName(@PathParam(value = "name") String name,
                       @PathParam(value = "surname") String surname) {
       return "hello mr "+name+" "+surname;
    } */
}