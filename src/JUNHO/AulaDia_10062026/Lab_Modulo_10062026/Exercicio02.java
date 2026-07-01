package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
/*O objetivo deste algoritmo é fazer cálculo de potenciação através de uma função */
import java.util.Scanner;

public class Exercicio02 {
            public static int power(int base,int exp){
            int calc=1;
            int qt;
            for(qt=0;qt < exp; qt++){
                calc *= base;
            }
            return calc;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,Y;
        System.out.println("Insira o valor da base: ");
        X = sc.nextInt();
        System.out.println("Insira o valor do expotente: ");
        Y = sc.nextInt();

        System.out.println(""+X+" elevado a "+Y+" é igual a "+power(X,Y));
        sc.close();
    }
}
