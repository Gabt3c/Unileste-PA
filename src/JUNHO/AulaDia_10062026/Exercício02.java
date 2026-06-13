package JUNHO.AulaDia_10062026;
import java.util.Scanner;

public class Exercício02 {
    public static Scanner sc = new Scanner(System.in);
    public static int calcularCubo(int a){
        int resp;
        resp = a*a*a;
        return resp;
    }
    public static void lerXY(int x, int y){
        System.out.print("Digite o valor de x: ");
        x=sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y=sc.nextInt();

    }
    public static void main(String[] args) {
        int raio, x, y, k;
        double V;
        System.out.print("Digite o valor do raio da esfera: ");
        raio = sc.nextInt();
        V = 4/3 * 3.14 * calcularCubo(raio);
        System.out.println("O volume da esfera é: "+V);
    }
}
