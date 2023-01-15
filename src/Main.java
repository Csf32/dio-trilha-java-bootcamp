import java.time.LocalDate;

import DioBootcampDesafio.Bootcamp;
import DioBootcampDesafio.Curso;
import DioBootcampDesafio.Dev;
import DioBootcampDesafio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();

        curso.setTitulo("Curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println();

        Dev devCaique = new Dev();
        devCaique.setNome("Caique");

        System.out.println(" Matrícula Caique ________________");
        // Matricula
        devCaique.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Caique: " + devCaique.getConteudosInscritos());

        System.out.println();
        System.out.println("Progresso Caique: ________");

        // Progresso
        devCaique.progedir();
        devCaique.progedir();
        System.out.println("Conteúdos inscritos Caique: " + devCaique.getConteudosConcluidos());

        System.out.println();
        // Conclusão
        System.out.println("Cursos concluídos Caique:");

        System.out.println("Conteúdos concluídos Caique: " + devCaique.getConteudosConcluidos());

        // Calcular XP
        System.out.println();
        System.out.println("Calculo do total de XP Caique");
        System.out.println("XP total de Caique: " + devCaique.calcualarTotalXp());
        System.out.println();

        System.out.println("Cursos de Eliana: ");

        System.out.println(" Matrícula Eliana ________________");

        Dev devEliana = new Dev();
        devEliana.setNome("Eliana");

        devEliana.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Eliana: " + devEliana.getConteudosInscritos());
        System.out.println();
        System.out.println("Progresso Eliana: ________");
        // Progresso
        devEliana.progedir();
        System.out.println("Conteúdos concluídos Eliana: " + devEliana.getConteudosConcluidos());

        System.out.println();
        // Conclusão
        System.out.println("Cursos concluídos Eliana:");
        System.out.println();
        System.out.println("Conteúdos concluídos Eliana: " + devEliana.getConteudosConcluidos());

        // Calcular XP
        System.out.println();
        System.out.println("Calculo do total de XP Eliana");
        System.out.println("XP total de Eliana: " + devEliana.calcualarTotalXp());

        // Conteudo conteudo = new Curso();

        // System.out.println(curso);
        // System.out.println(curso2);
        // System.out.println(mentoria);

    }
}
