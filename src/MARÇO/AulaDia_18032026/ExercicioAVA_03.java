package MARÇO.AulaDia_18032026;
import java.util.Scanner;
public class ExercicioAVA_03 {public static void main(String[] args){
    //Varíavel de custo
    float CustEspec;
    //Variável de lucro
    float ValorConvite;
    //Variável de Valor Mínimo
    float ValorMin;
    //Scanner
    Scanner ler;
    ler = new Scanner(System.in);
    //Onde a mágica acontece
    System.out.println("Digite o valor de custo do Espetáculo:");
    CustEspec = ler.nextFloat();
    System.out.println("Digite o valor do convite:");
    ValorConvite = ler.nextFloat();
    ValorMin = CustEspec / ValorConvite;
    System.out.println("A quantidade mínima de convites que devem ser vendidos para que não hava prejuízo expressivo é de: " + ValorMin + ". Boa sorte com isso! =)");
    ler.close();
}

}
