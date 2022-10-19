package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataAtual = LocalDate.now();
	private final LocalDate dataFinal = dataAtual.plusDays(45);
	private Set<Dev> DevsInscritos = new HashSet<Dev>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Dev> getDevsInscritos() {
		return DevsInscritos;
	}
	
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		DevsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataAtual() {
		return dataAtual;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Bootcamp boo = (Bootcamp) o;
		return Objects.equals(nome, boo.nome) && Objects.equals(descricao, boo.descricao) && 
			   Objects.equals(dataAtual, boo.dataAtual);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome,descricao, dataAtual, dataFinal,DevsInscritos, conteudos);
	}
	
	
}
