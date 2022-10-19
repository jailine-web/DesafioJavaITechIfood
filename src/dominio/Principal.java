package dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Tech Java");
		curso1.setDescricao("Java do básico ao avaçado");
		curso1.setCargaHoraria(3);
		
		//polimorfismo
		
		Conteudo c1 = new Curso(); 
		c1.setTitulo("JavaScript");
		c1.setDescricao("Tudo sobre o mundo javaScript");
		/*System.out.println("Cursos:\n");
		System.out.println(curso1);*/
		System.out.println();
		
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Java");
		m1.setDescricao("Java básico");
		m1.setData(LocalDate.now());
		
		//System.out.println("Mentorias:\n");
		//System.out.println(m1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java-se");
		bootcamp.setDescricao("Imersão Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(c1);
		bootcamp.getConteudos().add(m1);
		
		Dev d1 = new Dev();
		d1.setNome("Anna Paula");
		d1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos pelo dev: "+ d1.getNome()+" \n\n" +d1.getConteudosInscritos() );
		System.out.println();
		d1.progredir();
		
		System.out.println("Conteúdos concluídos pelo dev: "+ d1.getNome()+" \n\n" +d1.getConteudosConcluidos() );
		System.out.println("\nConteúdos restantes "+ d1.getNome()+" " +d1.getConteudosInscritos() );
		System.out.println("XP: "+d1.calcularXP());
		
		System.out.println();
		
		Dev d2 = new Dev();
		d2.setNome("Júlia Santos");
		d2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "+ d2.getNome()+ "\n"+ d2.getConteudosInscritos() );
		System.out.println();
		d2.progredir();
		d2.progredir();
		d2.progredir();
		System.out.println("Conteúdos concluídos "+ d2.getNome()+ " "+ d2.getConteudosConcluidos() );
		System.out.println("\nConteúdos restantes "+ d2.getNome()+ " "+ d2.getConteudosInscritos() );
		System.out.println("XP: "+d2.calcularXP());
	}
	
	

}
