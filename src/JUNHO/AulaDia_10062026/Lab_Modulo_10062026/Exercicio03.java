package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
/*o objetivo deste algoritmo é absorver 3 valores em um vetor*/
import java.util.Scanner;
public class Exercicio03 {
    public static void Metade(double A[]){
        for(int cont=0; cont<3; cont++){
            double met;
            met = A[cont] / 2;
            A[cont]=met;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double A[]= new double[3];
    for(int cont=0; cont<3; cont++){
        System.out.print("Insira o valor desejado: ");
        A[cont] = sc.nextInt();
    }
    System.out.println("pos.1: "+A[0]+" / / pos.2: "+A[1]+" / / pos.3: "+A[2]);
    Metade(A);
    System.out.println("pos.1: "+A[0]+" / / pos.2: "+A[1]+" / / pos.3: "+A[2]);
    sc.close();
  }
}