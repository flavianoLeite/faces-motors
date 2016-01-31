package models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ConsumidorProduto {

	@EmbeddedId
	private ConsumidorProdutoPK id;
	private Boolean enviaEmail;
	
	@ManyToOne
	private Consumidor consumidor;
	
	@ManyToOne
	private Produto produto;
	
	public ConsumidorProdutoPK getId() {
		return id;
	}
	public void setId(ConsumidorProdutoPK id) {
		this.id = id;
	}
	public Boolean getEnviaEmail() {
		return enviaEmail;
	}
	public void setEnviaEmail(Boolean enviaEmail) {
		this.enviaEmail = enviaEmail;
	}
	public Consumidor getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
}
