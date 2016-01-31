package persistence;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Automovel;
import models.Marca;
import models.Modelo;

public class PersistidorDeAutomovel {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Modelo modelo = new Modelo("Fusca");
		modelo.setPotencia(60);
		Marca marca =  new Marca("Volkswagem"); //em.getReference(Marca.class, 11L);
		em.persist(modelo);
		em.persist(marca);
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(1976);
		auto.setAnoModelo(1976);
		auto.setModelo(modelo);
		auto.getModelo().setMarca(marca);
		auto.setObservacoes("observações");
		auto.setTags(new ArrayList<String>());
		auto.getTags().add("automático");
		auto.getTags().add("novo");
		auto.getTags().add("bom estado");
		em.persist(auto);
		tx.commit();
		em.close();		
	}
}