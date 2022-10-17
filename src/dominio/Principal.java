package dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("A era do gelo");
		curso1.setDescricao("Animação de 2009");
		curso1.setCargaHoraria(1.30);
		
		System.out.println("Cursos:\n");
		System.out.println(curso1);
		System.out.println();
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Java");
		m1.setDescricao("Java básico");
		m1.setData(LocalDate.now());
		
		System.out.println("Mentorias:\n");
		System.out.println(m1);
		
	}

}
