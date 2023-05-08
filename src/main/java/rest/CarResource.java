package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CarApiDTO;
import dtos.CarDTO;
import facades.CarFacade;
import utils.EMF_Creator;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("car")
public class CarResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   private static final CarFacade FACADE = CarFacade.getCarFacade(EMF);

    @GET
    @Produces({MediaType.APPLICATION_JSON})
      public Response getCar() throws Exception {
        CarDTO cardto = FACADE.createCarDTO(FACADE.fetchData("https://carapi.app/api/makes"));
        System.out.println(cardto);
        CarApiDTO car = new CarApiDTO(cardto);
        return Response.ok().entity(car).build();

        }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("user")
    @RolesAllowed("user")
    public Response getFromUser() throws IOException {
        CarDTO cardto = FACADE.createCarDTO(FACADE.fetchData("https://carapi.app/api/makes"));
        System.out.println(cardto);
        System.out.println("This is an endpoint only for users");
        CarApiDTO car = new CarApiDTO(cardto);
        return Response.ok().entity(car).build();
    }
}
