package MAIO.AulaDia_13052026;
import java.util.Scanner;
public class ExercicioLogico3UPGRADE {
    public static void main(String[] args) {
        int x, cont=0, menorOrdem=0, menorValor=0, maiorOrdem=0, maiorValor=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Insira o valor inteiro desejado e, quando quiser parar o comparador, digite 0.");
            x=sc.nextInt();
            
            if (cont == 0){
                maiorValor=x;
                menorValor=x;
            }
            else{
                if(x>maiorValor){
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
    System.out.println("Menor Ordem: "+menorOrdem+"\nMenor Valor: "+menorValor+"\nMaior Ordem: "+maiorOrdem+"\nMaior Valor: "+maiorValor);
    sc.close();
  }
}