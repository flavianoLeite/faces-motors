package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Marca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy="montadora")
	private List<Modelo> modelos;
	
	@OneToOne(cascade=CascadeType.ALL)
	private DetalheMarca detalhe;
	
	
	public DetalheMarca getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(DetalheMarca detalhe) {
		this.detalhe = detalhe;
		
	}
	
	
	public Marca() {
		super();		
	}
	public Marca(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Modelo> getModelos() {		
		return modelos;
	}
	public void setModelos(List<Modelo> modelos) {
		/*if(modelos != null){
			for(Modelo m : modelos){
				m.setMarca(this);
			}
		}*/
		this.modelos = modelos;
	} 
	
}
