package AulaDia_25032026;
import java.util.Scanner;
public class Trabalho_PA {public static void main(String[] args) {
//Scanner
Scanner ler; ler = new Scanner(System.in);
//Valores
 int codcargo;  int vlrsal; double calculo;

//Entrada de Dados
    System.out.println("insira o código do seu cargo: ");
    codcargo = ler.nextInt();

    System.out.println("Insira seu salário: ");
    vlrsal = ler.nextInt();

    if (codcargo == 101) {
        calculo = vlrsal + (vlrsal * 0.10);
        System.out.println("Seu novo salário é: " + calculo);
    }
        
    if (codcargo == 102) {
        calculo = vlrsal + (vlrsal * 0.20);
        System.out.println("Seu novo salário é: " + calculo);
    }
     else {
        calculo = vlrsal + (vlrsal * 0.40);
        System.out.println("Seu novo salário é: " + calculo);
    }
    ler.close();
}

}
