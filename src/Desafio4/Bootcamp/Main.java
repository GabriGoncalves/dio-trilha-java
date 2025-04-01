package Desafio4_Bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Formação Java");
        curso1.setCargaHoraria(44);

        curso2.setTitulo("Python");
        curso2.setDescricao("Formação Python");
        curso2.setCargaHoraria(34);

        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Aprimorando Linguagem Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp para aprimorar os conhecimentos na linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("Conteúdos Inscritos de Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP Total: " + devGabriel.calcularXpTotal());

        Dev devJaime = new Dev();
        devJaime.setNome("Jaime");
        devJaime.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Jaime: " + devJaime.getConteudosInscritos());
        devJaime.progredir();
        devJaime.progredir();
        devJaime.progredir();
        System.out.println("Conteúdos Inscritos de Jaime: " + devJaime.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Jaime: " + devJaime.getConteudosConcluidos());
        System.out.println("XP Total: " + devJaime.calcularXpTotal());

    }
}
