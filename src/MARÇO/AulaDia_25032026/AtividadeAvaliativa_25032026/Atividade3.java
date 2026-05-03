package MARÇO.AulaDia_25032026.AtividadeAvaliativa_25032026;
import java.util.Scanner;
import java.util.Locale;
public class Atividade3 {
    public static void main(String[] args) {
    //variables
    String name;
    int codpc, qtd;
    double vlr, calc, calcArr;
    //Scanner
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    //Entrada de dados
    System.out.println("Bem vindo ao portal de vendas! Por favor, insira as informações na ordem em que for solicitado: ");
      System.out.println("Insira seu nome de usuário: ");
     name = scanner.nextLine();
    
      System.out.println("Insira o código da peça: ");
     codpc = scanner.nextInt();
    
      System.out.println("Insira o valor unitário da peça: ");
     vlr = scanner.nextDouble();
    
      System.out.println("Insira a quantidade de peças: ");
     qtd = scanner.nextInt();
     calc = (vlr * qtd) * 0.05;
     calcArr = (calc * 10) / 10.0;

      System.out.println("\n" + name + ", sua comissão de venda em cima de "+qtd+" unidades do item "+codpc+" será de: R$"+calcArr+"!");
      scanner.close();
    }
}                                                                          
