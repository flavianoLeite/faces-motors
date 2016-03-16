package models;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Automovel.listarTodos", query="select a from Automovel a")
public class Automovel {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String placa;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Modelo modelo;
	
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;	
	private transient Integer idade;
	
	@ElementCollection @Column(length=20)
	private List<String> tags;
	
	@ManyToMany
	private List<Opcional> opcionais;
	
	
	
	public Automovel() {
		super();	
	}
	
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
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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
	
	/*@Override
	public String toString() {	
		return this.id + " "+ getModelo().getMarca() + " modelo: " + modelo + " ano modelo: " + anoModelo + " fabrica��o: " + anoFabricacao;
	}*/
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
