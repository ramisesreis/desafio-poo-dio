import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRamises = new Dev();
        devRamises.setNome("Ramisés");
        devRamises.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ramisés" + devRamises.getConteudoInscritos());
        devRamises.progredir();
        devRamises.progredir();
        System.out.println("Conteúdos Concluídos Ramisés" + devRamises.getConteudoConcluidos());
        System.out.println("XP" + devRamises.calcularTotalXp());

        System.out.println("---------------------------------------------");

        Dev devNeliane = new Dev();
        devNeliane.setNome("Neliane");
        devNeliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neliane" + devNeliane.getConteudoInscritos());
        devNeliane.progredir();
        System.out.println("Conteúdos Concluídos Neliane" + devNeliane.getConteudoConcluidos());
        System.out.println("XP" + devNeliane.calcularTotalXp());
    }
}