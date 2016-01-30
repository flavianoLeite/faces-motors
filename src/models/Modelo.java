package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Modelo {
	@Id @GeneratedValue
	private Long id;
	private String descricao;
	private Integer potencia;
	@ManyToOne
	private Marca marca;
	public Modelo(String descricao) {
		this.descricao = descricao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		/*if(marca != null){
			if(marca.getModelos() != null){
				marca.getModelos().add(this);
			}
		}*/
		this.marca = marca;
	}
	
}
