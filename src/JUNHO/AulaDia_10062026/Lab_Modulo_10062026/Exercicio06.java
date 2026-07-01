package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
import java.util.Scanner;
public class Exercicio06 {
    public static Scanner sc=new Scanner(System.in);
    public static void lerMatriz(int matriz[][]){
        for(int L=0; L<3; L++){
            for(int C=0; C<3; C++){
                System.out.print("Insira o valor da "+(L+1)+"ª linha e "+(C+1)+"ª coluna: ");
                matriz[L][C]=sc.nextInt();
            }
        }    
     }
     public static void imprimirMatriz(int matriz[][]){
        for (int L=0; L<3; L++){
            for (int C=0; C<3; C++){
                System.out.print(matriz[L][C]+" ");           
            }
            System.out.println("");
        }
     }
    public static int somaMatriz(int matriz[][]){
        int soma = 0;
        for(int L=0; L<3; L++){
            for(int C=0;C<3;C++){
                soma+=matriz[L][C];
            }
        }
        return soma;
    }
    public static void main(String[] args) {
        int matriz[][]=new int[3][3];
        lerMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("\nO total obtido da soma dos elementos da matriz é: "+somaMatriz(matriz));
    }
}
