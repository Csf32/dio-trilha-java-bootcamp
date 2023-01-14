import java.time.LocalDate;

import DioBootcampDesafio.Curso;
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

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        
    }
}
