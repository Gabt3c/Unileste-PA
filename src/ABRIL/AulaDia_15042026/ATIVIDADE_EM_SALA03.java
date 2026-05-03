package ABRIL.AulaDia_15042026;
import java.util.Scanner;
public class ATIVIDADE_EM_SALA03 {
public static void main(String[] args) {
    //variables
    double averageBalance, creditAmount;
    //double percentual;
    //Scanner
    Scanner sc = new Scanner(System.in);
    //Insert Data
    System.out.println("Please enter the client's average balance: ");
    averageBalance = sc.nextDouble();
    //Conditions
    if (averageBalance > 5000){
        if (averageBalance > 5000 && averageBalance <= 10000){
            creditAmount = averageBalance * 0.3;
        }
        else if(averageBalance > 10000 && averageBalance <= 30000) {
            creditAmount = averageBalance * 0.4;
        }
        else {
            creditAmount = averageBalance * 0.5;
        }
        System.out.printf("Congratulations! You are elegible to a credit bonus of: $%.2f" ,creditAmount);
    }

    else {
        System.out.println("We're sorry! Unfortunately, you are not eligible to our credit bonus.");
    }

    sc.close();
}

}
