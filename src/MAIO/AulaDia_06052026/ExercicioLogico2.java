package MAIO.AulaDia_06052026;
import java.util.Scanner;
/*A idéia é o algoritmo fazer uma listagem considerando o range com valor inicial e final,
 em um cenário onde o valor final é apresentado primeiro a ordem da lista deve ser decrescente e,
 quando o valor inicial é apresentado primeiro a ordem deverá ser decresente*/

 public class ExercicioLogico2 {
    public static void main(String[] args) {
        int ini, fim;
        Scanner sc= new Scanner(System.in);

        System.out.print("Insira o valor inicial: ");
        ini=sc.nextInt();
        System.out.print("Insira o valor final: ");
        fim=sc.nextInt();

        if (ini < fim) {
            while (ini <= fim) {
                System.out.println(ini);
                ini++;
            }
        }
        else if (ini > fim) {
            while (ini >= fim) {
                System.out.println(ini);
                ini--;
            }
        }
        else {System.out.println("Os valores serão iguais");}
        sc.close();
    }
 }