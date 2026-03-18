package AulaDia_11032026;
import java.util.Scanner;
public class Calcula_peso {
    public static void main(String[] args) throws Exception
    {
        //varáveis
        float pesokg;
        float pesog;

        //scanner
        Scanner ler;
        ler = new Scanner(System.in);

        //entrada
        System.out.println("Digite seu peso em kg: ");
        pesokg = ler.nextFloat();
        pesog = pesokg * 1000f; // Conversão para gramas
        System.out.println("Seu peso em gramas é: " + pesog + " !");
        ler.close();
    }