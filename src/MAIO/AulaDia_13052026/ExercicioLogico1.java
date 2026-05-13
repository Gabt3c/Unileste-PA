package MAIO.AulaDia_13052026;
import java.util.Scanner;
public class ExercicioLogico1 {
    public static void main(String[] args) {
        int Option;//Seleção do user
        int x, y, result; //valores da conta 

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor desejado: ");
        x=sc.nextInt();
        System.out.println("Insira o segundo valor desejado: ");
        y=sc.nextInt();

        do{
            System.out.println("Você deseja somar(1), subtrair(2), multiplicar(3), dividir(4) ou sair(5)?");
            Option=sc.nextInt();
            switch (Option){
            case 1 : result=x+y;
            System.out.println(result+" é o valor obtido da soma dos valores.");
            case 2 : result=x-y;
            System.out.println(result+" é o valor obtido da subtração dos valores.");
            case 3 : result=x*y;
            System.out.println(result+" é o valor obtido da multiplicação dos valores.");
            case 4 : result=x/y;
            System.out.println(result+" é o valor obtido da divisão dos valores.");
            default: System.out.println("Valor inválido!");
        }
    }
        while (Option != 5);
            System.out.println("ACABOU!!!");

        sc.close();
    }

}
