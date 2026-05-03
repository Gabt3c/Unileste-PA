package MARÇO.AulaDia_25032026.AtividadeAvaliativa_25032026;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        //produtos
        double valprod1, valprod2, valprod3, total;
        
        //método de pagamento
        int paymetod;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
       
        //Entrada de dados
        System.out.println("Insira o valor do primeiro produto: ");
        valprod1 = scanner.nextDouble();
        
        System.out.println("Insira o valor do segundo produto: ");
        valprod2 = scanner.nextDouble();
        
        System.out.println("Insira o valor do terceiro produto: ");
        valprod3 = scanner.nextDouble();

          System.out.println("Selecione uma das formas de pagamento definidas abaixo.");
          System.out.println("1. À vista (Pix ou dinheiro)");
          System.out.println("0. Cheque (30 dias)");
          paymetod = scanner.nextInt();

          if (paymetod != 1 && paymetod != 0) {
            System.out.println("Forma de pagamento inválida");
          }
          else if (paymetod == 1) {
            total = (valprod1 + valprod2 + valprod3) * 0.95; //5% de desconto
            System.out.printf("O valor para pagamento à vista será de: R$%.2f", total);
          }
          else if (paymetod==0) {
            total = (valprod1 + valprod2 + valprod3) * 1.10; //10% de acréscimo
            System.out.printf("O valor para pagamento em cheque será de: R$%.2f", total);
          }
            scanner.close();

    }

}
