package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Opcional {

	@Id @GeneratedValue
	private Long id;
	private String descricao;
	
	/*@ManyToMany(mappedBy="opcionais")
	private List<Automovel> automoveis;*/
	
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
	/*public List<Automovel> getAutomoveis() {
		return automoveis;
	}
	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}*/
	
}
