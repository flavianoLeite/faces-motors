package models;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Automovel {

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Modelo modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	@ElementCollection @Column(length=20)
	private List<String> tags;
	@ManyToMany
	private List<Opcional> opcionais;
	
	public List<Opcional> getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(List<Opcional> opcionais) {
		this.opcionais = opcionais;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	@Override
	public String toString() {	
		return this.id + " "+ getModelo().getMarca() + " modelo: " + modelo + " ano modelo: " + anoModelo + " fabricação: " + anoFabricacao;
	}
	
}
