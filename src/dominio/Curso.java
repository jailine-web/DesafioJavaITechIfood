package dominio;

public class Curso extends Conteudo{

	private String titulo;
	private String descricao;
	private double cargaHoraria;
	
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString() {
		return "Titulo: "+ getTitulo() +"\nDescricao: "+ getDescricao() +
		"\nCarga horária: " + getCargaHoraria()+"";
	}
	
	@Override
	public double calcularXP() {
		return ELEMENTO_PADRAO + cargaHoraria;
	}
	
}
