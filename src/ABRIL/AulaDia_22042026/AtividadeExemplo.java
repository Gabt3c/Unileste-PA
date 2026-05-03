package ABRIL.AulaDia_22042026;
import java.util.Scanner;
public class AtividadeExemplo {
    public static void main(String[] args) {
        //variables
        int x, jogadores;
        double altura, somaAltura = 0, mediaAltura;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Entrada de Dados
        System.out.println("Insira a quantidade de jogadores: ");
        jogadores = sc.nextInt();
        //Repetition
        for (x = 1; x <= jogadores; x++) {
         System.out.println("Insira a altura de cada jogador: ");
         altura = sc.nextDouble();
         somaAltura = somaAltura + altura;
        }

        if (jogadores <= 0) {
            System.out.println("Por favor, insira uma quantidade válida de jogadores: ");
        }
        else {
            mediaAltura = somaAltura / jogadores;
            System.out.printf("A altura média dos jogadores será de : %.2f metros" , mediaAltura);
        }
        sc.close();
    }
}
