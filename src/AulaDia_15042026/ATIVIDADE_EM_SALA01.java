package AulaDia_15042026;
import java.util.Scanner;
public class ATIVIDADE_EM_SALA01 {
    public static void main(String[] args) {
        //variables
        String x;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Data Reading
        System.out.println("Please insert one of the options ahead: A, B, C, D or E");
        x = sc.nextLine();
        //Switch case
        switch (x) {
            case "A":
                System.out.println("Excelente!");
                break;
            case "B":
                System.out.println("Muito bom!");
                break;
            case "C":
                System.out.println("Bom.");
                break;
           case "D":
                System.out.println("Regular.");
                break;
            case "E":
                System.out.println("Insuficiente.");
                break;
            default:
                System.out.println("Please insert a valid option.");
        }
        sc.close();
    }
}
//testar a sintaxe moderna depois!

