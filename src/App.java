import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    //Ensinando a montar variáveis
    { /*//int Id1, Id2 = 20; //variável de números inteiros = int
     double salario = 5000.3; //variável de números Reais
     char letra = '&'; //variável de caracteres especiais
     String nome ="Gabriel de Souza"; //variável que permite espaço na atrbuição
     boolean ativo = true, inativo = false; //variável que serve de "resposta" para questões lógicas*/

    String id = "Crazy fuckin shit";
    Scanner nome;
    nome = new Scanner(System.in);

    System.out.print("Digite o nome do caba mais gente boa do planeta: ");
    id = nome.nextLine();
    System.out.println("O nome do caba mais gente boa do planeta é: " + id);
    nome.close();
}
}