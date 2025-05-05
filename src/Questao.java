import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Questao {
    int numQ = 0;
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta){

        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("\u001B[32mParabéns resposta Correta! - Letra: " + this.correta + "\u001B[0m");
            System.out.println("");
            return true;
        } else {
            System.out.println("\u001B[31mResposta Errada!\u001B[0m");
            System.out.println("\033[34mA opção correta é a letra: " + this.correta + "\u001B[0m");
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.print("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.print("");
        return false;
    }

    public void randomizarOpcoes() {

        List<String> opcoes = new ArrayList<>(Arrays.asList(opcaoA, opcaoB, opcaoC, opcaoD, opcaoE));
        Collections.shuffle(opcoes);

        opcaoA = opcoes.get(0);
        opcaoB = opcoes.get(1);
        opcaoC = opcoes.get(2);
        opcaoD = opcoes.get(3);
        opcaoE = opcoes.get(4);

        if (opcaoA.equalsIgnoreCase(this.correta)) {
            correta = "A";
        } else if (opcaoB.equalsIgnoreCase(this.correta)) {
            correta = "B";
        } else if (opcaoC.equalsIgnoreCase(this.correta)) {
            correta = "C";
        } else if (opcaoD.equalsIgnoreCase(this.correta)) {
            correta = "D";
        } else if (opcaoE.equalsIgnoreCase(this.correta)) {
            correta = "E";
        }
    }


    public void escrevaQuestao(int numQ){
        System.out.println(numQ + " - " + this.pergunta);
        System.out.println();
        System.out.println("a) " + this.opcaoA);
        System.out.println("b) " + this.opcaoB);
        System.out.println("c) " + this.opcaoC);
        System.out.println("d) " + this.opcaoD);
        System.out.println("e) " + this.opcaoE);
        System.out.println();
    }

}