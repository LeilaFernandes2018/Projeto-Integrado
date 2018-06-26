package modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Filmes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date anoLancamento;
	private Double duracao;
	private String elenco;
	
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public Double getDuracao() {
		return duracao;
	}
	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}
	private String genero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
	
}
