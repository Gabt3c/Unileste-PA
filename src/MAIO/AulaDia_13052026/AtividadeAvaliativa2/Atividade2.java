package MAIO.AulaDia_13052026.AtividadeAvaliativa2;
import java.util.Scanner;
/*O Objetivo deste algoritmo é registrar 5 compras e mostar
a) O valor total das compras à vista
b) O valor total das compras à prazo
c) O valor total de TODAS as as compras
d) A média geral de todas as compras*/
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char payMetod;
        double valorCompra, totalP=0, totalV=0, totalAll, media;
        int qt=1;

        do{
            System.out.println("Insira o valor da "+qt+"ª compra: ");
            valorCompra=sc.nextDouble();

            System.out.println("Insira o método de pagamento.");
            System.out.print("À vista(V) ou à Prazo(P): ");
            payMetod=sc.next().charAt(0);

            if (payMetod == 'P') {
                totalP=valorCompra+totalP;
            }
            if (payMetod == 'V') {
                totalV=valorCompra+totalV;
            }
            qt++;
        }
        while(qt<=4);
        totalAll=totalP+totalV;
        media=totalAll/(qt-1);
        System.out.println(totalP+" // "+totalV+" // "+totalAll+" // "+qt+" // "+media);
        sc.close();
    }
}
