package MARÇO.AulaDia_25032026;

import java.util.Scanner;
public class ExercicioAVA_01 {public static void main(String[] args) {
    //Static variables
    int A;
    int B;
    int MAIOR = Integer.MAX_VALUE;
    int MENOR = Integer.MIN_VALUE;
    //Scanner
    Scanner scanner; scanner = new Scanner(System.in);

    //Entrada de Dados
    System.out.println("Insira o primeiro valor: ");
    A = scanner.nextInt();
    System.out.println("Insira o segundo valor: ");
    B = scanner.nextInt();

    if (A > B && A != B) {
     MAIOR = A;
     MENOR = B;
     System.out.println("O maior valor é: " +MAIOR);
     System.out.println("O menor valor é: " +MENOR);
        } 
    else if (B > A && A != B) {
        MAIOR = B;
        MENOR = A;
        System.out.println("O maior valor é: " +MAIOR);
        System.out.println("O menor valor é: " +MENOR);
        }
    else {
        System.out.println("Os valores apresentados são iguais.");
    }
    scanner.close();
    }
}
