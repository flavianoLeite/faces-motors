package persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Consumidor;
import models.ConsumidorProduto;
import models.ConsumidorProdutoPK;
import models.Produto;

public class PersistidorDeConsumidorProduto {
	public static void main(String[] args) {		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Produto produto = new Produto("Pão");
		Consumidor consumidor = new Consumidor("Flaviano");		
		em.persist(produto);
		em.persist(consumidor);
		ConsumidorProdutoPK pk = new ConsumidorProdutoPK();
		pk.setConsumidorId(consumidor.getId());
		pk.setProdutoId(produto.getId());		
		ConsumidorProduto consumidorProduto = new ConsumidorProduto();
		consumidorProduto.setId(pk);
		consumidorProduto.setConsumidor(consumidor);
		consumidorProduto.setProduto(produto);
		em.persist(consumidorProduto);
		tx.commit();
		em.close();		
	}
}