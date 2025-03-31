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

        System.out.println(String.format("%s%n%s%n%s%n%s", faculdade, aluno, professor, tema_perguntas));

    }
}