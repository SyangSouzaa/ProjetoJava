import javax.print.StreamPrintService;
import java.util.Scanner;
//Lê um valor do tipo double do teclado
public class ExemploEntradaSaida {

    public static void main(String[] args) {
        //Ler as notas do aluno e calcular a media FIAP
        Scanner leitor = new Scanner(System.in);

        //Declarar as variaveis necessarias
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine() + leitor.next();//Lê mais palavras

        System.out.println("Digite a nota da CP1: ");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP2: ");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do GS: ");
        double gs = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge1: ");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge2: ");
        double challenge2 = leitor.nextDouble();

        //Cálculo da média de Checkpoints
        double mediacp = ((cp1 + cp2) / 2) * 0.20;

        //Cálculo da média dos Challengs
        double mch = ((challenge1 + challenge2 / 2) * 0.20);

        //Cálculo do gs
        double mediags = gs * 0.60;

        //Cálculo da média final
        double mediafinal = mediacp + mch + mediags;

        System.out.println("Aluno: " + nome);
        System.out.println("A sua nota final é: " + mediafinal);

    }
}
