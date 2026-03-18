package AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_02 {public static void main(String[] args) {
    //Variáveis de notas
    int Nota1;
    int Nota2;
    int Nota3;
    //variável de cálculo
    float Média;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //Onde a mágica acontece
    System.out.println("Insira a o valor da notas de compra.");

    System.out.println("Nota 1: ");

    Nota1 = ler.nextInt();
    
    System.out.println("Nota 2: ");
    
    Nota2 = ler.nextInt();
    
    System.out.println("Nota 3: ");
    
    Nota3 = ler.nextInt();
    
    Média = (Nota1 + Nota2 + Nota3) / 3; 
    
    System.out.println("O valor médio das notas é: " + Média);
    ler.close();
    }

}
