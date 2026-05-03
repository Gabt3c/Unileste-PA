package MARÇO.AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_01 {public static void main(String[] args) {
    //variáveis de preço
    float ValorLitro;
    float ValorPagamento;
    float Litro;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //entrada de dados
    System.out.println("Digite quantos Litros de combustível deseja abastecer: ");
    Litro = ler.nextFloat();
    System.out.println("Digite o valor do litro do combustível: ");
    ValorLitro = ler.nextFloat();
    ValorPagamento = ValorLitro * Litro;
    System.out.print("O valor total será: R$" + ValorPagamento);
    ler.close();}
}