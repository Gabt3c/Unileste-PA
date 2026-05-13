package MAIO.AulaDia_13052026;
import java.util.Scanner;
public class ExercicioLogico2 {
    public static void main(String[] args) {
        int Option;
        Scanner sc=new Scanner(System.in);

        
    do{
        System.out.println("Se estiver pronto para começar, pode digitar qualquer número diferente de 0");
        Option=sc.nextInt();
        System.out.println("Insira o primeiro valor desejado: ");
        float x=sc.nextFloat();
        System.out.println("Insira o segundo valor desejado: ");
        float y=sc.nextFloat();

        float media = (x+y) / 2;
        System.out.println("A média dos valores é:" +media);
    }
    while(Option!=0);
    System.out.println("--------FIM--------");
    sc.close();
    }
}
