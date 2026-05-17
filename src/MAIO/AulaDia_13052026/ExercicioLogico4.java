package MAIO.AulaDia_13052026;
/*o objetivo deste algoritmo é receberu números naturais fornecidos pelo usuário e, ao final do processamento, retornar a quantidade de números naturais fornecida pelo usuário. */
import java.util.Scanner;
public class ExercicioLogico4 {
    public static void main(String[] args) {
        int x, cont=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Insira um número positivo qualquer e, quando quiser parar o processamento, digite qualquer número menor do que 0.");
            x=sc.nextInt();

            if(x>=0){
                cont++;
            }
        }
        while (x>=0);
        System.out.println("Você digitou "+cont+" números positivos.");
        sc.close();
    }
}
