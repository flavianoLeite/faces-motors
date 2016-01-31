package models;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ConsumidorProdutoPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 612309148156069357L;
	/**
	 * 
	 */
	
	
	private Long consumidorId;
	private Long produtoId;
	
	public Long getConsumidorId() {
		return consumidorId;
	}
	public void setConsumidorId(Long consumidorId) {
		this.consumidorId = consumidorId;
	}
	public Long getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((consumidorId == null) ? 0 : consumidorId.hashCode());
		result = prime * result
				+ ((produtoId == null) ? 0 : produtoId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsumidorProdutoPK other = (ConsumidorProdutoPK) obj;
		if (consumidorId == null) {
			if (other.consumidorId != null)
				return false;
		} else if (!consumidorId.equals(other.consumidorId))
			return false;
		if (produtoId == null) {
			if (other.produtoId != null)
				return false;
		} else if (!produtoId.equals(other.produtoId))
			return false;
		return true;
	}
	
	

}
