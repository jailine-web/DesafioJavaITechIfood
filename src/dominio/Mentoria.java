package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private String titulo;
	private String descricao;
	private LocalDate data;
	
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Titulo: "+ getTitulo()+ "\nDescrição: "+ getDescricao()+ "\nData: " + getData();
	}
	
	@Override
	public double calcularXP() {
		return ELEMENTO_PADRAO + 20d;
	}
}
