import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Instanciar o cabecalho

        Cabecalho cabecalho = new Cabecalho("Centro Univeritário Alfredo Nasser - UNIFAN",
                "Giancarlo Pinheiro de Abreu",
                "Brenno Pimenta",
                "Tema das perguntas: Logística");

        cabecalho.imprimir(); // imprimir cabecalho

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("========= MENU =========");
            System.out.println("1 - Iniciar Quiz");
            System.out.println("2 - Ver Explicacao das respostas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    IniciaQuiz quiz = new IniciaQuiz();
                    quiz.iniciar(); // metodo criado para mostrar o quiz
                    break;
                case 2:
                    RespostaDetalhada.mostrar(); // metodo criado para mostrar respostas detalhadas
                    break;
                case 3:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}