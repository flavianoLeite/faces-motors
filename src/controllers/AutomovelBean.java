package controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import models.Automovel;
import persistence.JPAUtil;

@ManagedBean
@ViewScoped
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	private List<Automovel> automoveis;
	
	public String salvar(){
		EntityManager em =  JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(automovel);
		em.getTransaction().commit();
		em.close();
		System.out.println(automovel);
		return "listaAutomoveis";
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	@SuppressWarnings("unchecked")
	public List<Automovel> getAutomoveis() {
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createNamedQuery("Automovel.listarTodos", Automovel.class);	
		
		automoveis = q.getResultList();
		em.close();
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}
	
}
