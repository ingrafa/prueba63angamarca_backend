package ec.edu.ups.ppw63.demo63.dao;

	
	import jakarta.inject.Inject;
	import jakarta.ejb.Stateless;
	import java.util.List;

import ec.edu.ups.ppw63.demo63.model.Deuda;

	@Stateless
	public class DeudaService {

	    @Inject
	    private DeudaRepository deudaRepository; // Deberás crear esta interfaz

	    public List<Deuda> obtenerDeudasPorCedula(String cedula) {
	        // Implementa la lógica para obtener las deudas del cliente con la cedula proporcionada
	        return deudaRepository.findByCedula(cedula);
	    }
	}


