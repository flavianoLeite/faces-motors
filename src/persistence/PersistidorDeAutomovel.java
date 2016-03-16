package persistence;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Automovel;
import models.DetalheMarca;
import models.Marca;
import models.Modelo;

public class PersistidorDeAutomovel {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Marca marca = new Marca("Porshe");
		Modelo model = new Modelo("Carrera 911");
		model.setMontadora(marca);
		model.setPotencia(100);
		Automovel auto = new Automovel();
		auto.setModelo(model);
		em.persist(auto);
		
		/*Marca porsche = new Marca("Porsche");
		em.persist(porsche);
		
		Marca ferrari = new Marca("Ferrari");
		Marca outraFerrari = em.merge(ferrari);
		System.out.println(ferrari == outraFerrari);*/
		
		/*Modelo modelo = new Modelo("Fusca");
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
		em.persist(auto);*/
		tx.commit();
		em.close();		
	}
}