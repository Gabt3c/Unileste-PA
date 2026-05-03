package MARÇO.AulaDia_11032026;
import java.util.Scanner;
public class Calculadora_de_preco {
    public static void main(String[] args) throws Exception 
    {   //variáveis
        float preço;
        float totalD;
        float totalC;
        //Scanner
        Scanner ler;
        ler = new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite o valor do produto: ");
        preço = ler.nextFloat();
        totalD = preço * 0.90f; // Desconto de 10% para pagamento em dinheiro
        totalC = preço * 1.05f; // Acréscimo de 5% para pagamento em cartão
        System.out.println("O valor do produto será R$:" + totalD +" se for pago em dinheiro, ou R$:" + totalC +" se for pago em cartão");
        ler.close();
    }

}
