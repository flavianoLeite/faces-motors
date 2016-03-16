package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Modelo {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Integer potencia;
	
	@OneToMany(mappedBy="modelo")
	private List<Automovel> automoveis;
	
	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	private Marca montadora;
	
	public Modelo() {
		super();
	}
	
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

	public Marca getMontadora() {
		return montadora;
	}

	public void setMontadora(Marca montadora) {
		this.montadora = montadora;
	}
	
	
}
