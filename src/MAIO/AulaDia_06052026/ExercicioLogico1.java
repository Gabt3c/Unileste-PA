package MAIO.AulaDia_06052026;
import java.util.Scanner;
public class ExercicioLogico1 {
    public static void main(String[] args) {
        int contador=0, somaPositivos=0, Negativos=0;
        Scanner sc= new Scanner(System.in);
        while (contador < 5) {
            System.out.println("Informe um número: ");
            int x = sc.nextInt();

            if (x > 0){
                somaPositivos += x;
            }
            else{
                Negativos++;
            }
            contador++;
        }
         System.out.println("A soma dos números positivos resultará em: "+somaPositivos);
         System.out.println("A quantidade de números negativos foi: " +Negativos);
        sc.close();
    }
}
