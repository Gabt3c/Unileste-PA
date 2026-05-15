package MAIO.AulaDia_13052026;
import java.util.Scanner;
/*O objetivo deste algoritmo é permitir que o usurário insira quantos valores desejar e depois calcule a média artimética deles */
public class ExercicioLogico2UPGRADE {
    public static void main(String[] args) {
        int cont=0;
        float x=0, med=0, sum=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Insira o valor que deseja adicionar ao cálculo. Quando quiser parar, digite 0.");
            x = sc.nextInt();

            if (x!=0){
                sum=sum+x;
                cont++;
            }
        }
        while (x!=0);
        med=sum/cont;
        System.out.println("\nVocê fez "+cont+" inserções.");
        System.out.println("\nA soma dos valores inseridos será "+sum+ " e a média deles é "+med);
        System.out.println("---------FIM---------");
        sc.close();
    }
}
