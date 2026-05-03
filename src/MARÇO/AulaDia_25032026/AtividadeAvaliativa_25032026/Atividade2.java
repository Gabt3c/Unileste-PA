package MARÇO.AulaDia_25032026.AtividadeAvaliativa_25032026;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
    //variaveis
    int passw, Upassw; 
    passw = 1234;
    //Scanner
    Scanner ler; ler = new Scanner(System.in);
    //Entrada de Dados
    System.out.println("Olá! Insira sua senha para continuarmos: ");
    Upassw = ler.nextInt();

    if (Upassw != passw) {
        System.out.println("ACESSO NEGADO");
    }
    else {
        System.out.println("ACESSO PERMITIDO");
    }
    ler.close();

    }
}
