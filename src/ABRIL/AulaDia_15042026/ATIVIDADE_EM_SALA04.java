package ABRIL.AulaDia_15042026;
import java.util.Scanner;
public class ATIVIDADE_EM_SALA04 {
public static void main(String[] args) {
    //Variables
    int position;
    double wage, result;
    //Scanner
    Scanner sc = new Scanner(System.in);
    //Data reading
    System.out.println("Please, enter your position code:");
    position = sc.nextInt();
    System.out.println("Please, enter your wage:");
    wage = sc.nextDouble();
    //Conditions
    if (position == 101) {
        result = wage * 1.1;
        }
        else if (position == 102) {
        result = wage * 1.2;
        }
        else if (position == 103) {
        result = wage * 1.3;
        }

    else {result = wage * 1.4;}
    System.out.println("Congratulantions, your new wage is $" +result);
    sc.close();
}
}
