package AulaDia_25032026;
import java.util.Scanner;
public class ExercicioAVA_03 {
    public static void main(String[] args) {
    //variables
        int x, y;
        double calc;

    //scanner    
        Scanner sc = new Scanner(System.in);
        
    //Insert Data
        System.out.println("Please insert the first value: ");
        x = sc.nextInt();
        System.out.println("Please insert the second value: ");
        y = sc.nextInt();
        
    //conditions
        if (x>0 && y>0) {
            calc = x * y;
            System.out.println("The multiplication of theses values is equal to " + calc);
        }
        else{
            calc = x + y;
            System.out.println("The sum of theses values is equal to " + calc);
        }
        sc.close();
    }
}
