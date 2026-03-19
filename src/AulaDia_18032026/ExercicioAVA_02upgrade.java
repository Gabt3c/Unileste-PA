package AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_02upgrade { public static void main(String[] args) {
    //Variável de nota
    float Nota1;
    float Nota2;
    float Nota3;
    //Varíável de média
    double Média;
    /*double MinApr = 7.0;*/
    double ajuste;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //Onde a mágica acontece
    System.out.println("Digite sua primeira nota: ");
    Nota1 = ler.nextFloat();
    System.out.println("Digite sua segunda nota: ");
    Nota2 = ler.nextFloat();
    System.out.println("Digite sua terceira nota: ");
    Nota3 = ler.nextFloat();
    Média = (Nota1 + Nota2 + Nota3) / 3;
    ajuste = Math.floor(Média * 10) / 10; // Mantém uma casa decimal;
    System.out.println("A média de suas notas foi: " + ajuste);
    System.out.println("A média de suas notas foi: " + Média );
    ler.close();


//Condições de aprovação
    if (Média >= 7) {
        System.out.println("Parabéns=)! Você passou!");
            } 
        else if (Média <= 6.9) {
        System.out.println("Infelizmente você foi não passou =( Faça o L e tente de novo no ano que vem.");
            }       
     }
}


