package persistence;
import javax.persistence.EntityManager;

import models.Automovel;
import persistence.JPAUtil;

public class ExcluidorDeAutomovel {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Automovel auto = em.getReference(Automovel.class, 6L);
		em.remove(auto);
		System.out.println(auto);
		em.getTransaction().commit();
	}
}