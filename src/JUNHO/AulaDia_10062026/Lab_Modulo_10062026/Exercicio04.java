package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
import java.util.Scanner;
/*o objetivo deste algoritmo é criar uma função que receba três valores e retorne a média entre eles */
public class Exercicio04 {
    public static double MEDIA(double a,double b,double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, z;
        System.out.print("Insira o primeiro valor: ");
        x=sc.nextDouble();
        System.out.print("Insira o segundo valor: ");
        y=sc.nextDouble();
        System.out.print("Insira o terceiro valor: ");
        z=sc.nextDouble();
    
        System.out.println("\n"+MEDIA(x,y,z));
        sc.close();  
    }

}
