package ec.edu.ups.ppw63.demo63.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

import ec.edu.ups.ppw63.demo63.model.Deuda;

@Stateless
public class DeudaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Deuda> findByCedula1(String cedula) {
        // Implementa la lógica para buscar las deudas por cedula en la base de datos
        return entityManager.createQuery("SELECT d FROM Deuda d WHERE d.cedula = :cedula", Deuda.class)
                .setParameter("cedula", cedula)
                .getResultList();
    }

	public List<Deuda> findByCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
}



