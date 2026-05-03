package MARÇO.AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_06 {public static void main(String[] args) {
    //inserção do usuário
    float Num;
    //Variáveis de resultado
    double Up;
    double Down;
    double Equal;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //Onde a mágica acontece
    System.out.println("Informe um número decimal qualquer: ");
    Num = ler.nextFloat();
    Up = Math.ceil(Num);
    Down = Math.floor(Num);
    Equal = Math.round(Num);
    System.out.println("Os valores aproximados para cima, para baixo e o valor arredondado são respectivamente: " + Up + ", " + Down + " e " + Equal);
    ler.close();
}

}
