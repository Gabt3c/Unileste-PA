package AulaDia_25032026;
import java.util.Scanner;
public class Trabalho_PA {public static void main(String[] args) {
//Scanner
Scanner ler; ler = new Scanner(System.in);
//Valores
 int codcargo;  double vlrsal; double calculo; double calcArr;

//Entrada de Dados
    System.out.println("insira o código do seu cargo: ");
    codcargo = ler.nextInt();

    System.out.println("Insira seu salário: ");
    vlrsal = ler.nextFloat();

    if (codcargo == 101) {
        calculo = vlrsal + (vlrsal * 0.10);
        calcArr = Math.round(calculo * 10) / 10.0;
    
        System.out.println("Seu novo salário é: " + calcArr);
    }
        
    else if (codcargo == 102) {
        calculo = vlrsal + (vlrsal * 0.20);
        calcArr = Math.round(calculo * 100) / 10.0;

        System.out.println("Seu novo salário é: " + calcArr);
    }
     else {
        calculo = vlrsal + (vlrsal * 0.40);
        calcArr = Math.round(calculo * 100) / 10.0;

        System.out.println("Seu novo salário é: " + calcArr);
    }
    ler.close();
}

}
