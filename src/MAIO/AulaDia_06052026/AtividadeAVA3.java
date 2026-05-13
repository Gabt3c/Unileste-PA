package MAIO.AulaDia_06052026;
import java.util.Scanner;
public class AtividadeAVA3 {
    public static void main(String[] args) {
        int aluno=1;
        Scanner sc = new Scanner(System.in);

        while (aluno <= 2) {
            System.out.println("Informe a primeira nota do aluno "+aluno+": ");
            float nota1=sc.nextFloat();
            System.out.println("Informe a segunda nota do aluno "+aluno+": ");
            float nota2=sc.nextFloat();
            //calculo de média das notas
            float mediaNota = (nota1+nota2) / 2;
            System.out.printf("A média de seu aluno é: %.1f \n" ,mediaNota);
            aluno++;
        }
        sc.close();
    }
}
