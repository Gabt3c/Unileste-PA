package MARÇO.AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_05 { public static void main (String[] args) {
    //base
    int Base;
    //expoente
    int expo;
    //resultado
    int result;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //onde a mágica acontece
    System.out.println("Informe o valor da base: ");
    Base = ler.nextInt();
    System.out.println("Informe o valor do expoente: ");
    expo = ler.nextInt();
    result = (int) Math.pow(Base, expo);
    System.out.println("" + Base + " elevado por " +expo + " é igual a: " + result);
    ler.close();
}

}
