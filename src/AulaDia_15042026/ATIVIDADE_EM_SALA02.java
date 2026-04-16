package AulaDia_15042026;
import java.util.Scanner;
public class ATIVIDADE_EM_SALA02 {
    public static void main(String[] args) {
        //variables
        int x, y, z; 
        int MAIOR, INTER, MENOR;
        //Scanner
        Scanner sc = new Scanner(System.in);
        //data reading
        System.out.println("Insert the first value: ");
        x = sc.nextInt();
        System.out.println("Insert the second value: ");
        y = sc.nextInt();
        System.out.println("Insert the third value:");
        z = sc.nextInt();
        //conditions
        if (x == y && y ==z){
            System.out.println("The values are all the same.");
        }

        //MAIOR
        else {
            if (x > y && x > z) {
            MAIOR = x;
            }
            else if (y > x && y > z) {
            MAIOR = y;
            } 
            else {
            MAIOR = z;
            }
        //INTER
            if (x < y && x>z) {
            INTER = x;
            }
            else if ( y < x && y > z) {
            INTER = y;
            }
            else {
            INTER = z;
            }
        //MENOR
            if (x < y && x < z){
            MENOR = x;
            }
            else if (y < x && y < z){
            MENOR = y;
            }
            else {
            MENOR = z;
            }
        //Data printing
        System.out.println("MAIOR: " +MAIOR);
        System.out.println("INTER: " +INTER);
        System.out.println("MENOR: " +MENOR);
    }
    sc.close();

    }
}
