package ec.edu.ups.ppw63.demo63.business;

import java.util.Date;
import java.util.List;
import ec.edu.ups.ppw63.demo63.dao.ClienteDAO;
import ec.edu.ups.ppw63.demo63.dao.DeudaDAO;
import ec.edu.ups.ppw63.demo63.dao.DeudaService;
import ec.edu.ups.ppw63.demo63.model.Cliente;
import ec.edu.ups.ppw63.demo63.model.Deuda;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private DeudaDAO deuda;
	
	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setDni("0302919881");
		cliente.setDireccion("cuenca");
		cliente.setNombre("prueba");
		
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setDni("098987332");
		cliente.setDireccion("Monay");
		cliente.setNombre("Juan Torres");
		
		daoCliente.insert(cliente);
				
		
		Deuda  deu = new Deuda();
		deu.setId(null);
		deu.setCedula("0302919881");
		deu.setMonto(2000);
		deu.setTipo(null);
		
		
		System.out.println("\n Deudas");
		}
	}
