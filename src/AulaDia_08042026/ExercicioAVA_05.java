package AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_05 {
    public static void main(String[] args) {
        //variables
        int age;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Data reading
        System.out.println("Please insert your age: ");
        age = sc.nextInt();
        //Conditions
        if (age >= 18 && age < 65) {
            System.out.println("You are am adult person");
        }
        else if (age < 18){
            System.out.println("You are an underage person");
        }
        else if (age > 65){
            System.out.println("You are an elder person");
        }
        sc.close();
    }
}
