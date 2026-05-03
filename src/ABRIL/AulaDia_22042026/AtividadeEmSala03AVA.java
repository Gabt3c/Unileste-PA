package AulaDia_22042026;
import java.util.Scanner;
public class AtividadeEmSala03AVA {
    public static void main(String[] args) {
        //variables
    int x, aprovados=0;
    double nota=0;
    Scanner sc = new Scanner(System.in);
    //Data
    for (x = 1; x <= 10; x++)
        {System.out.println("Insira a nota do aluno " +x+ ":");
        nota = sc.nextDouble();
    
     if (nota >= 7) {
        aprovados = aprovados + 1;
         }
    System.out.println("A quantidade de alunos aprovados é de: " +aprovados+ " alunos.");
        }
sc.close();
     }
}
