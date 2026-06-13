package JUNHO.AulaDia_10062026.Lab_Modulo_10062026;
import java.util.Scanner;
public class Exercicio10 {
    public static Scanner sc= new Scanner(System.in);

    public static void lerMatriz (int matriz[][]){
                for (int L=0; L<4;L++){
                    for(int C=0; C<4; C++){
                    System.out.print("Escreva o valor da linha " +(L+1)+ " e coluna "+(C+1)+": ");
                    matriz[L][C]=sc.nextInt();
            }
        }
    }

    public static void exibirMatriz(int matriz[][]){
                for (int L=0; L<4;L++){
                    for(int C=0; C<4; C++){
                    System.out.print(" "+matriz[L][C]);
            }
            System.out.println("");
        }
    }
    public static int somaDiagonalPrincipal (int matriz[][]){
        int somaDp=0;
                for (int L=0; L<4;L++){
                    for(int C=0; C<4; C++){
                        if(L==C){
                    somaDp += matriz[L][C];
                }
            }
        }
        return somaDp;
    }

    public static int somaDiagonalSecundaria (int matriz[][]){
        int somaDs=0;
                for (int L=0; L<4;L++){
                    for(int C=0; C<4; C++){
                        if((L+C)==3){
                    somaDs += matriz[L][C];
                }
            }
        }
        return somaDs;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int matriz[][]= new int[4][4];
        int diff = somaDiagonalPrincipal(matriz)-somaDiagonalSecundaria(matriz);
        lerMatriz(matriz);
        exibirMatriz(matriz);
        System.out.print("A soma da diagonal principal é: " +somaDiagonalPrincipal(matriz));
        System.out.print("\nA soma da diagonal secundária é: " +somaDiagonalSecundaria(matriz));
        System.out.print("\nA diferença entre as diagonais desta matriz será: "+diff);
        sc.close();
            }
    }

