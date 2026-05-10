package MAIO.AulaDia_06052026;
import java.util.Scanner;
/*O intuito do exercício é fornecer a tabuada do número que será inserido pelo usuário*/
public class AtividadeAVA2 {
    public static void main(String[] args) {
        int mult=0, result=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("Insira o número desejado: ");
        int x = sc.nextInt();

        while(mult<=10){
            result = x*mult;
            System.out.println(x+" vezes " +mult+ " é igual a: " +result);
            mult++;
        }
        sc.close();
    }
}
