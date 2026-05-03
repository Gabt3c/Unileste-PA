package ABRIL.AulaDia_08042026;
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
        //X Major case
        if(x > y && x > z){
            if (y > z){
            System.out.println("A ordem crescente dos valores será z: " +z+ ", y: " +y+ ", x: " +x);
             }
            else{System.out.println("A ordem crescente dos valores será y: " +y+ ", z: " +z+ ", x: " +x);}
        }
        //Y Major case
        if(y > x && y > z){
            if (x > z){
                System.out.println("A ordem crescente dos valores será z: " +z+ ", x: " +x+ ", y: "+y);
            }
            else{System.out.println("A ordem crescente dos valores será x: " +x+ ", z: " +z+ ", y:" +y);}
            }
        //Z Major case
        if (z > x && z > y){
            if (x > y){
                System.out.println("A ordem crescente dos valores será y: " +y+ ", x: " +x+ ", z: "+z);
            }
            else{System.out.println("A ordem crescente dos valores será x: " +x+ ", y: " +y+ ", z: "+z);}
        }
        //Equal values
        else if (x==y && y==z){
            System.out.println("Todos os valores são iguais.");
        }
        sc.close();
    }
}

