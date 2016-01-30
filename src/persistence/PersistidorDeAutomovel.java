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
		Modelo modelo = new Modelo("Fiesta");
		Marca marca = new Marca("Ford");
		em.persist(modelo);
		em.persist(marca);
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2009);
		auto.setAnoModelo(2010);
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