package dominio;

public class Curso {

	private String titulo;
	private String descricao;
	private double cargaHoraria;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return "Titulo: "+ getTitulo() +" Descricao: "+ getDescricao() +
		" Carga horária: " + getCargaHoraria();
	}
	
}
