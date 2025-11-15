package com.joseiedo.user;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/user")
@ApplicationScoped
public class UserController {

    @Path("/health")
    @GET
    public String get() {
        return "user module is kinda alright ;)";
    }
}
