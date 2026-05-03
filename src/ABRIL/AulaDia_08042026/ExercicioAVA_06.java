package ABRIL.AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_06 {
    public static void main(String[] args) {
        //variables
        double price, profit;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Data reading
        System.out.println("Insert a price for the item:");
        price = sc.nextDouble();
        //Conditions
        if (price < 10) {
            profit = price * 1.7;
            System.out.printf("Your profit with that sale will be: $%.2f" ,profit);
        }
        else if (price >= 10 && price < 30) {
            profit = price * 1.5;
              System.out.printf("Your profit with that sale will be: $%.2f" ,profit);
        }
        else if (price >= 30 && price < 50) {
            profit = price * 1.4;
              System.out.printf("Your profit with that sale will be: $%.2f" ,profit);
        }
        else {
            profit = price * 1.3;
            System.out.printf("Your profit with that sale will be: $%.2f" ,profit);
        }
        sc.close();
    }
}
