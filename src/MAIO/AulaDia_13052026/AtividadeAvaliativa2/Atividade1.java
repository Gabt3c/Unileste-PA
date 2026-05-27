package MAIO.AulaDia_13052026.AtividadeAvaliativa2;
/*O objetivo deste algoritmo é ler o gênero, cor dos olhos e altura de um grupo de 4 pessoas.
Ao final o algoritmo deve calcular e imprimir:
1) Menor altura do grupo
2) Maior altura do grupo
3) Quantidade de homens com olhos pretos*/
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cor; //cores dos olhos
        char gen; //Gênero
        int pessoa=1, cont=0;
        double altura, menorAltura=0, maiorAltura=0;

        do{ 
            System.out.print("Insira altura da "+pessoa+"ª pessoa: ");
            altura=sc.nextDouble();
            
            System.out.println("Insira o gênero da pessoa. Masculino(M) ou feminino(F)");
            gen=sc.next().charAt(0);
            
            System.out.println("Insira a cor dos olhos desta pessoa considerando as seguintes opções: \n(C)-Castanho \n(P)-Preto \n(A)-Azul \n(V)-Verde");
            System.out.print("Selecione uma das opções: ");
            cor=sc.next().charAt(0);
            System.out.println(""+cor+" // "+gen+" // "+altura );

            if (pessoa==1){
                menorAltura=altura;
                maiorAltura=altura;
            }

            else{
                
                if (altura>=maiorAltura){
                maiorAltura=altura;
                }

                if (altura<=menorAltura){
                menorAltura=altura;
                }
            }
            if (gen=='M' && cor=='P'){
                cont++;
            }
            pessoa++;
        }
        while(pessoa <= 4);
        System.out.println("Maior altura: "+maiorAltura+
            "\nMenor altura: "+menorAltura+
            "\nQuantidade de homens com cabelo preto: "+cont
        );
        sc.close();
}
}
//Uma sugestão de upgrade seria buscar formas de impedir que o usurário digite opções inválidas e reinicie o loop sempre que isso ocorrer