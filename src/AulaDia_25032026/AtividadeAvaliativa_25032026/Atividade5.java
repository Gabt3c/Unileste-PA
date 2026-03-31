package AulaDia_25032026.AtividadeAvaliativa_25032026;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        //variables
        String descprod;
        int qtdprod;
        double value, amount, discount, totvalue;
        //scanner
        Scanner scanner = new Scanner(System.in);
        //Entrada de Dados
        System.out.println("Informe o nome do produto desejado: ");
        descprod = scanner.nextLine();

        System.out.println("Informe o valor dos produtos: ");
        value = scanner.nextDouble();
        System.out.println("Informe a quantidade desejada: ");
        qtdprod = scanner.nextInt();

        amount = value * qtdprod;

        if (qtdprod<=5) {
            discount = amount * 0.2;
            totvalue = amount * 0.98;
            System.out.println("Normalmente, o valor do total da compra do " +descprod+ " seria: R$" +amount);
            System.out.println("Entretanto, graças ao volume comprado, você é elegível a ter " +discount+ "% de desconto!");
            System.out.printf("O novo valor de sua compra é: R$%.2f", totvalue);
            }
        else if (qtdprod>5) {
            discount = amount * 0.3;
             totvalue = amount * 0.97;
            System.out.println("Normalmente, o valor do total da compra do " +descprod+ " seria: R$" +amount);
            System.out.println("Entretanto, graças ao volume comprado, você é elegível a ter " +discount+ "% de desconto!");
            System.out.printf("O novo valor de sua compra é: R$%.2f", totvalue);
            
        }
            scanner.close();
    }

}
