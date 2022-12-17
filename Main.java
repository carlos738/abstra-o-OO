package br.com.desafio.poo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());

//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);

		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos");
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devCarlos.getConteudosInscritos());
		devCarlos.progredir();
		devCarlos.progredir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos" + devCarlos.getConteudosInscritos());
		System.out.println("Conteúdos concluidos" + devCarlos.getConteudosConcluidos());
		System.out.println("XP:" + devCarlos.calcularTotalXp());

		System.out.println("\n-----------");

		Dev devThamires = new Dev();
		devThamires.setNome("Thamires Alves");
		devThamires.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos inscritos" + devThamires.getConteudosInscritos());
		devThamires.progredir();
		devThamires.progredir();
		devThamires.progredir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos" + devThamires.getConteudosInscritos());
		System.out.println("Conteúdos concluidos" + devThamires.getConteudosConcluidos());
		System.out.println("XP:" + devThamires.calcularTotalXp());

	}

}
