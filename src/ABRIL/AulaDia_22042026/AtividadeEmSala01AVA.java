package ABRIL.AulaDia_22042026;
import java.util.Scanner;
public class AtividadeEmSala01AVA {
    public static void main(String[] args) {
        //variables
        int x, funcionarios;
        double salario = 0, somaSalario = 0, médiaSalarial;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Data
        System.out.println("Insira a quantidade de funcionários da empresa: ");
        funcionarios = sc.nextInt();
        //repetitions
        for (x=1; x <= funcionarios; x++) {
            System.out.println("Insira o salário do funcionário em questão: ");
            salario = sc.nextDouble();
            somaSalario = somaSalario + salario;
        }
        //conditions
        if (funcionarios <= 0) {
            System.out.println("Por favor, insira uma quantidade superior a 0");
        }
        else {
            médiaSalarial = somaSalario / funcionarios;
            System.out.printf("A salárial de sua empresa é: R$%.2f" ,médiaSalarial);
        }
        sc.close();
    }

}
