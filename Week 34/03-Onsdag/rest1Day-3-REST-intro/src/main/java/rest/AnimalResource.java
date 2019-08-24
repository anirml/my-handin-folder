/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import entities.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Jeppe
 */
@Path("animal")
public class AnimalResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnimalResource
     */
    public AnimalResource() {
    }

    /**
     * Retrieves representation of an instance of rest.AnimalResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
       return "Hello from my first web service";
    }

    @Path("/random1")
    //OBS link til path http://localhost:8080/rest1Day-3-REST-intro/api/animal/random1
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String randomNumber(){
        Random rand = new Random();
        //Tilfældigt tal mellem 1 og 100
        int rNumber = rand.nextInt(100)+1;
        return String.valueOf(rNumber);
    }
    //Get request response header content type is text.
    
    
    @Path("/random")
    //OBS link til path http://localhost:8080/rest1Day-3-REST-intro/api/animal/random
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String randomAnimal(){
        
        List<Animal> animals = new ArrayList<Animal>();
        
        Animal Elephant = new Animal(1989,"Elephant","yeeehaaa im an elephant");
        Animal Cat = new Animal(2011,"Cat","Meeoow");
        Animal Spider = new Animal(2018,"Spider","No Sound!");
        Animal Bat = new Animal(2016,"Bat","Squeak");
        
        animals.add(Elephant);
        animals.add(Cat);
        animals.add(Spider);
        animals.add(Bat);
        
        Random rand = new Random();
        Animal randomAnimal = animals.get(rand.nextInt(animals.size()));
        return randomAnimal.toString(); 
    }
    /**
     * PUT method for updating or creating an instance of AnimalResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
