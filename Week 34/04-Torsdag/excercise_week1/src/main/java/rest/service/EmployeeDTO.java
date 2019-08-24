package rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Employee;
import facades.EmployeeFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("employee")
public class EmployeeDTO {

    EntityManagerFactory emf; 
    EmployeeFacade facade =  EmployeeFacade.getFacadeExample(emf);
        @Context
    private UriInfo context;
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"succes\"}";
    }
    
    @Path("/all")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllEmployees(){
        List<Employee> employee = facade.getAllEmployees();
        return gson.toJson(employee);
    }

    @Path("/{id}")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    public String getEmployeeById(int id) {
    Employee employee = facade.getEmployeeById(id);
        return gson.toJson(employee);
    }
    
    @Path("/highestpaid")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getEmployeesWithHighestSalary() {
        List<Employee> employee = facade.getEmployeesWithHighestSalary();
        return gson.toJson(employee);
    }
    
    @Path("/name/{name}")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    public String getEmployeesByName(String name) {
        List<Employee> employee = (List<Employee>) facade.getEmployeesByName(name);
        return gson.toJson(employee);
}
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Employee entity) {
        throw new UnsupportedOperationException();
    }
    

}
