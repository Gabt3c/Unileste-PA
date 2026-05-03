package ABRIL.AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_01 {
    public static void main(String[] args) {
        //variables
        double x;
        //scanner
        Scanner sc = new Scanner(System.in);
        //Data Insertion
        System.out.println("Insira o primeiro valor: ");
        x = sc.nextDouble();
        //Conditions
        if ( x % 5 == 0) {
            System.out.println("O valor inserido é divisível por 5!");
        }
        else {
            System.out.println("O valor inserido não é divisível por 5");
        }
        sc.close();

    }

}
