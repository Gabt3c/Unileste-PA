import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    //Ensinando a montar variáveis
    { /*//int Id1, Id2 = 20; //variável de números inteiros = int
     double salario = 5000.3; //variável de números Reais
     char letra = '&'; //variável de caracteres especiais
     String nome ="Gabriel de Souza"; //variável que permite espaço na atrbuição
     boolean ativo = true, inativo = false; //variável que serve de "resposta" para questões lógicas*/

    /*String id ;
    Scanner nome;
    nome = new Scanner(System.in);

    System.out.print("Insira o nome do camisa 10 da seleção esse ano: ");
    id = nome.nextLine();
    System.out.println("O nome do camisa 10 da seleção esse ano é: " + id + " Fala o que você achou desse camisa 10");
    nome.close();*/

    //Scanner
    Scanner ler;
      ler = new Scanner(System.in);
    //variáveis de valores
    int num1;
    num1 = 10;
    int num2;
    num2 = 3;
    // varíaveis de cálculo
    int soma; 
    int mult;
    int sub;
    float div;

    //onde a mágica acontece
    System.out.println("Digite o primeiro algarismo: "); //pede o primeiro valor
    num1 = ler.nextInt(); //cliente insere
    System.out.println("Digite o segundo algarismo: "); //pede o segundo valor
    num2 = ler.nextInt();
    // calculos
    soma = num1 + num2;
    mult = num1 * num2;
    sub = num1 - num2;
    div = num1 / num2;
    //resultado
    System.out.println("O Resultado de sua soma é : " + soma + " !");
    System.out.println("O Resultado de sua multiplicação é : " + mult + " !");
    System.out.println("O Resultado de sua subtração é : " + sub + " !");
    System.out.println("O Resultado de sua divisão é : " + div + " !");
    


    ler.close();

}
}

