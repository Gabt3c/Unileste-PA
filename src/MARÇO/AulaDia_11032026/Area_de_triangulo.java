package MARÇO.AulaDia_11032026;
import java.util.Scanner;
public class Area_de_triangulo {
    public static void main(String[] args) throws Exception
    {
        //valores
        float a;
        float h;
        //calculo
        float formula;
        //Scanner
        Scanner ler;
        ler = new Scanner(System.in);
        
        System.out.println("Insira o valor da base: ");
        a = ler.nextFloat();
        System.out.println("insira o valor da altura: ");
        h = ler.nextFloat();
        formula = (a * h) / 2;
        System.out.println("A área do seu triângulo é: " + formula);
        ler.close();


        
    }
    
}

