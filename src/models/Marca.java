package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Marca {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy="marca")
	private List<Modelo> modelos;
	
	
	
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
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
