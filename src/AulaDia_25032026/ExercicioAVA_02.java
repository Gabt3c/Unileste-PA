package AulaDia_25032026;
import java.util.Scanner;
public class ExercicioAVA_02 {public static void main(String[] args) {
    //Valores
    int A, B;
    int C;    
    //Scanner
    Scanner ler = new Scanner(System.in);
    //Entrada de dados
    System.out.println("Insira o primeiro valor :");
    A = ler.nextInt();
    System.out.println("Insira o segundo valor :");
    B = ler.nextInt();
    ler.close();

  if ( A>B ) {
    C = A;
  }
  else {
    C=B;
  }
  
  System.out.println("O maior valor é: " +C );
  ler.close();

}
}


