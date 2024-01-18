package ec.edu.ups.ppw63.demo63.dao;
	

import java.util.List;
import ec.edu.ups.ppw63.demo63.model.Deuda;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/api/deudas")
public class DeudaDAO {

    @Inject
    private DeudaService deudaService;

    @GET
    @Path("/{cedula}")
    @Produces("application/json")
    public List<Deuda> obtenerDeudasPorCedula(@PathParam("cedula") String cedula) {
   
    	        List<Deuda> deudas = deudaService.obtenerDeudasPorCedula(cedula);
        return deudas;
    }
}
