package JUNHO.AulaDia_03062026;
/*O objetivo deste algoritmo é desenvolver meu primeiro módulo,
usei como modelo a Atividade_Lab presente no dia 30/05/2026*/
import java.util.Scanner;
public class ExemploModulo {
        public static void LerMatriz(int valor[][]){
            int L,C;
            Scanner sc = new Scanner(System.in);
            for (L=0; L<3; L++){
                for (C=0; C<3; C++){
                    System.out.println("Informe o valor da linha "+ (L+1)+" e e coluna "+(C+1));
                    valor[L][C]=sc.nextInt();
                }
            }
            sc.close();
        }
        public static void ImprimirMatriz(int valor[][]){
            int L,C;
            for(L=0; L<3; L++){
               for(C=0; C<3; C++){
                    System.out.print(valor[L][C]+" ");
              }
            System.out.println();
           }
        }
        public static void SomaDiagonal (int valor[][]){
            int L,C,soma=0;
            for (L=0; L<3; L++){
                for (C=0; C<3; C++){
                    if (L==C){
                        soma += valor[L][C];
                    }
                }
            }
            System.out.println("A soma dos valores da diagonal principal será: "+soma);
        }
    public static void main(String[] args) {
        int valor[][] = new int[3][3];
        LerMatriz(valor);
        ImprimirMatriz(valor);
        SomaDiagonal(valor);
    }
}
