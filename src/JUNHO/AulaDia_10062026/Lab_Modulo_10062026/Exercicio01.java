package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
import java.util.Scanner;
public class Exercicio01 {
    public static int diasVividos(int a){
        int diasVividos = a*365;
        return diasVividos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Digite sua idade: ");
        id=sc.nextInt();
        diasVividos(id);
        System.out.println("Você viveu um total de "+diasVividos(id)+" dias!");
        sc.close();
    }
}
