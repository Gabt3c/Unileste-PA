package MARÇO.AulaDia_11032026;
import java.util.Scanner;
public class Calculo_Idade {
    public static void main(String[] args) throws Exception 
    {int dt;
    int sub;
    Scanner Data;
    Data = new Scanner(System.in);
    
    System.out.println("Digite o ano em que você nasceu: ");
    dt = Data.nextInt();
    sub = 2026 - dt;
    System.out.println("Você completará " + sub + " anos em 2026 !");
    Data.close();
    }
}
