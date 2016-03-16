package persistence;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import models.Automovel;
import models.Marca;

public class BuscadorDeAutomovel {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		/*Marca marca = em.find(Marca.class, 3L);
		String jplq = "select a from Automovel a where a.modelo.montadora = :marca";*/
		//Query q = em.createQuery(jplq, Automovel.class);
		Query q = em.createNamedQuery("Automovel.listarTodos", Automovel.class);
		//q.setParameter("marca", marca);
		@SuppressWarnings("unchecked")
		List<Automovel> list = q.getResultList();
		for(Automovel a : list){
			System.out.println(a);
		}
	}
}