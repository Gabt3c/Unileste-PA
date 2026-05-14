package MAIO.AulaDia_13052026;
import java.util.Scanner;
public class ExercicioLogico3 {
    public static void main(String[] args) {
    int Option;
    Scanner sc=new Scanner(System.in);

    do{
        System.out.println("Insira o primeiro valor desejado: ");
        int x = sc.nextInt();
        System.out.println("Insira o segundo valor desejado: ");
        int y = sc.nextInt();

        System.out.println("Quando estiver pronto para continuar, digite qualquer valor diferente de 0");
        Option=sc.nextInt();

        if(x>y){
            System.out.println("O primeiro algarismo digitado foi o maior!! Seu valor é: "+x);
        }
        else{System.out.println("O segundo algarismo digitado foi o maior!! Seu valor é: "+y);}
    }
    while(Option!=0);
    System.out.println("--------FIM--------");

    sc.close();
    }

}
