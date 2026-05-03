package ABRIL.AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_02 {
    public static void main(String[] args) {
    //variables
    double x;

    //scanner
    Scanner sc = new Scanner(System.in);

    //Insert Data
    System.out.println("Insira o valor desejado: ");
        x = sc.nextDouble();
    //Condition
    if ( x % 3 == 0 && x % 7 == 0 ) {
        System.out.println("O valor pode ser divido tanto por 3 quanto por 7");
    }

    else if (x % 3 == 0) {
        System.out.println("O valor é divisível somente por 3");
    }

    else if ( x % 7 == 0 ) {
        System.out.println("O valor é divisível somente por 7");   
    }

    else {
        System.out.println("O valor inserido NÃO pode ser divido por 3 e nem por 7.");
    }
    sc.close();

    }


}
