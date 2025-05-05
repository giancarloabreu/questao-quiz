import java.util.List;


public class Cabecalho {

    String faculdade;
    String aluno;
    String professor;
    String tema_perguntas;//-Classe Cabeçalho com informações da Faculdade, aluno, professor e tema das perguntas,

    public Cabecalho(String faculdade, String aluno, String professor, String tema_perguntas){
        this.faculdade = faculdade;
        this.aluno = aluno;
        this.professor = professor;
        this.tema_perguntas = tema_perguntas;
    }

    public void imprimir(){

        System.out.println(String.format("%s%n%s%n%s%n%s%n","\033[42m" + faculdade + "\033[0m","\033[42m" +  aluno + "\033[0m","\033[42m" +  professor + "\033[0m", "\033[44m" + tema_perguntas + "\033[0m"));

    }
}