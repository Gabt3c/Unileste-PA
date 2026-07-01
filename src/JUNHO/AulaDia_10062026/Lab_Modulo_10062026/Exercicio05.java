package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
import java.util.Scanner;
public class Exercicio05 {
    public static double AUMENTO(double x, double y){
        return x+((x*y)/100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, porcentagem;

        System.out.print("Insira o valor do salário: ");
        salario=sc.nextDouble();
        System.out.print("Insira a porcentagem de aumento: ");
        porcentagem=sc.nextDouble();

        System.out.printf("O valor total do novo salário será: R$%.2f",AUMENTO(salario,porcentagem));
        sc.close();
    }
}
