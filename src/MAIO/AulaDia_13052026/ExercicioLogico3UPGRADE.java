package MAIO.AulaDia_13052026;
import java.util.Scanner;
public class ExercicioLogico3UPGRADE {
    public static void main(String[] args) {
        int x, cont=1, menorOrdem=0, menorValor=0, maiorOrdem=0, maiorValor=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Insira o valor inteiro desejado e, quando quiser parar o comparador, digite 0.");
            x=sc.nextInt();
            if (cont == 1){
                maiorValor=x;
                menorValor=x;
                maiorOrdem=cont;
                menorOrdem=cont;
            }
            else{
                if(x>=maiorValor && x!=0){
                maiorValor=x;
                maiorOrdem=cont;
                }
                else if(x<=menorValor && x!=0){
                menorValor=x;
                menorOrdem=cont;
                }
            }
            cont++;
    }
    while(x!=0);
    System.out.println("O menor valor inserido foi o número: "+menorValor+" na "+menorOrdem+"° posição.");
    System.out.print("O menor valor inserido foi o número: "+maiorValor+" na "+maiorOrdem+"° posição.");
    sc.close(); 
  }
}