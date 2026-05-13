package MAIO.AulaDia_06052026;
import java.util.Scanner;
/*O intuito do exercício é montar um sistema que some todos os valores inseridos pelo usuário*/
public class AtividadeAVA1 {
    public static void main(String[] args) {
        int somaX = 0, cont=1;
        Scanner sc = new Scanner(System.in);

        while (cont <= 10) {
            System.out.print("Informe um número: ");
            int x= sc.nextInt();
            somaX += x;
            cont++;
        }
        System.out.print("A soma dos valores será: "+somaX+"!");
        sc.close();
    }
}
