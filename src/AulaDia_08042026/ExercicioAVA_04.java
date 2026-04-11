package AulaDia_08042026;
import java.util.Scanner;
public class ExercicioAVA_04 {
    public static void main(String[] args) {
        //variables
        int x, y, z;
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de x: ");
        x=sc.nextInt();
        System.out.println("Insira o valor de y: ");
        y=sc.nextInt();
        System.out.println("Insira o valor de z: ");
        z=sc.nextInt();
        //Conditions
        if(x > y && x > z)
            else if (y > z) {
        System.out.println("Ordem crescente dos valores é: " +x+ " " +y+ " " +z+);
        }
            else{
                System.out.println("Ordem crescente dos valores é: " +x+ " " +z+ " " +y+);
            }
    }
}
