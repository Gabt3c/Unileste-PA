package AulaDia_22042026;
import java.util.Scanner;
public class AtividadeEmSala04AVA {
    public static void main(String[] args) {
    //variables
    int Alunos, idAlunos=0; 
    double nota=0;
    Scanner sc = new Scanner (System.in);

        for (Alunos=1; Alunos <=10; Alunos++) {
            System.out.println("insira a nota do aluno " +Alunos+ ":");
            nota = sc.nextDouble();

            System.out.println("Insira a idade do aluno: " +Alunos+ ":");
            idAlunos = sc.nextInt();
        }
        if (idAlunos >= 18){
            System.out.printf("A nota do aluno %d foi: %.2f\n" ,Alunos, nota);
            }
        
        sc.close();
        
    }

}
