package ABRIL.AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_03 {
    public static void main(String[] args) {
        //variables
        int x;
        //scanner
        Scanner sc = new Scanner(System.in);
        //Data Insertion
        System.out.println("Insira o valor desejado: ");
        x = sc.nextInt();
        //Conditions
        if (x > 0) {
            System.out.println("VALOR POSITIVO");
        }
        else if (x == 0) {
            System.out.println("VALOR NULO");
        }
        else {
            System.out.println("VALOR NEGATIVO");
        }
        sc.close();
    }
}
