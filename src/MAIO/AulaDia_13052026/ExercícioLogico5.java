package MAIO.AulaDia_13052026;
/*O objetivo deste algoritmo é receber a nota de 25 alunos de uma turma e calcular a média das notas de todos os alunos da turma.*/
import java.util.Scanner;
public class ExercícioLogico5 {
    public static void main(String[] args) {
        double nota=0,
        soma=0,
        mediaNota=0,
        alunos=0;
        Scanner sc = new Scanner(System.in);

        do{
            alunos++;
            System.out.println("Insira a nota do "+alunos+"° aluno.");
            nota=sc.nextDouble();
            soma=soma+nota;      
        }
        while(alunos<25);
        mediaNota = soma / alunos;
        System.out.println("\nA média da turma foi: "+mediaNota);
        sc.close();
    }

}
