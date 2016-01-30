package persistence;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import models.Automovel;
import persistence.JPAUtil;

public class BuscadorDeAutomovel {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("select a from Automovel a where a.anoModelo < 2011", Automovel.class);
		@SuppressWarnings("unchecked")
		List<Automovel> list = q.getResultList();
		for(Automovel a : list){
			System.out.println(a);
		}
	}
}