import com.dio.bootcamp.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso voltado para ensinamentos em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso voltado para ensinamentos em JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria em Java");
        mentoriaJava.setDescricao("Mentoria para as aulas de Java");
        mentoriaJava.setData(LocalDate.now().format(formatado));

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Mentoria em JavaScript");
        mentoriaJavaScript.setDescricao("Mentoria para as aulas de JavaScript");
        mentoriaJavaScript.setData(LocalDate.now().plusDays(1).format(formatado));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Neste Bootcamp você irá aprender mais sobre o mundo Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoriaJava);
        bootcamp.getConteudos().add(mentoriaJavaScript);




        Dev devMariaFernanda = new Dev();
        devMariaFernanda.setNome("Maria Fernanda");
        devMariaFernanda.inscricaoBootcamp(bootcamp);
        System.out.println("Bem vindo(a) "+devMariaFernanda.getNome()+ " ao " +bootcamp.getNome());
        System.out.println("Conteúdos inscritos: ");
        devMariaFernanda.mostrarConteudosInscritos();
        System.out.println(("Início do Bootcamp: "+ bootcamp.getDataInicialFormatada()+"\n"+"Prazo final: "+bootcamp.getDataFinalFormatada() + "\n"));
        System.out.println("Acompanhe seu progresso: \n");
        devMariaFernanda.progresso();
        devMariaFernanda.progresso();
        System.out.println("Conteúdos inscritos: ");
        devMariaFernanda.mostrarConteudosInscritos();
        System.out.println("Conteúdos concluídos: ");
        devMariaFernanda.mostrarConteudosConcluidos();
        System.out.println("XP: " + devMariaFernanda.TotalXP());

        System.out.println("\n-------------------------\n");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscricaoBootcamp(bootcamp);
        System.out.println("Bem vindo(a) "+devPaula.getNome()+ " ao " +bootcamp.getNome());
        System.out.println("Conteúdos inscritos: ");
        devPaula.mostrarConteudosInscritos();
        System.out.println(("Início do Bootcamp: "+ bootcamp.getDataInicialFormatada()+"\n"+"Prazo final: "+bootcamp.getDataFinalFormatada() + "\n"));
        System.out.println("Acompanhe seu progresso: \n");
        devPaula.progresso();
        devPaula.progresso();
        devPaula.progresso();
        System.out.println("Conteúdos inscritos: ");
        devPaula.mostrarConteudosInscritos();
        System.out.println("Conteúdos concluídos: ");
        devPaula.mostrarConteudosConcluidos();
        System.out.println("XP: " + devPaula.TotalXP());

    }
}
