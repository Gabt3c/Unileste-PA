package MAIO.AulaDia_30052026;
/*O objetivo deste algoritmo é criar uma matriz 3x3 com números inteiros e 
depois calcular a soma dos valores presentes na diagonal principal, depois 
a resposta e os valores da matriz*/
import java.util.Scanner;
public class Atividade_Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor[][] = new int[3][3];
        int soma=0, L, C;

        for (L=0; L<3; L++){
            for(C=0; C<3; C++){
                System.out.println("Informe o valor de linha e coluna, respectivamente.");
                valor[L][C]= sc.nextInt();
            }
        }
        for(L=0; L<3; L++){
            for(C=0; C<3; C++){
                System.out.print(valor[L][C]+" ");
            }
            System.out.println();
        }
        for(L=0; L<3; L++){
            for(C=0; C<3; C++){
            if (L==C) {
                soma += valor[L][C];
            }
          }
        }
        System.out.println("A soma dos valores da diagonal principal será: "+soma);
        sc.close();
    }
}
