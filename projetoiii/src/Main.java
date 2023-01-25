import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        setLessonParams(curso1, "curso java", "descrição curso java", 8);

        Curso curso2 = new Curso();
        setLessonParams(curso1, "curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria();
        setMentoringParams(mentoria, "mentoria de java", "descrição mentoria java", LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        setDevParams(devCamila, "Camila", bootcamp);
        checkStatus(devCamila, 2);
        
        Dev devJoao = new Dev();
        setDevParams(devJoao, "Joao", bootcamp);
        checkStatus(devJoao, 3);
     
    }
    
    public static void setLessonParams(Curso course, String title, String description, int duration){
        course.setTitulo(title);
        course.setDescricao(description);
        course.setCargaHoraria(duration);
    }
    
    public static void setMentoringParams(Mentoria mentoring, String title, String description, LocalDate date){
        mentoring.setTitulo(title);
        mentoring.setDescricao(description);
        mentoring.setData(date);
    }
    
    public static void setDevParams(Dev developer, String nome, Bootcamp formacao) {
        developer.setNome(nome);
        developer.inscreverBootcamp(formacao);
    }
    
    public static void checkStatus(Dev developer, int progress) {
        System.out.println("\n" + developer.getNome() + " - Conteúdos Inscritos: " + developer.getConteudosInscritos());
        developer.progredir(progress);
        System.out.println(developer.getNome() + " - Conteúdos Inscritos: " + developer.getConteudosInscritos());
        System.out.println(developer.getNome() + " - Conteúdos Concluídos: " + developer.getConteudosConcluidos());
        System.out.println("XP:" + developer.calcularTotalXp());
    }

}
