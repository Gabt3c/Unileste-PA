package MAIO.AulaDia_27052026.ATIVIDADES_ava;
/*O objetido deste algoritmo é ler o nome e a idade de 5 pessoas e armazene em vetores,
 depois escreva o nome e a idade da pessoa mais nova.*/
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome[] = new String[5];
        String nomeJovem = "";
        int idade[] = new int[5];
        int idadeJovem = 0;

        for(int x=0; x <5; x++){
        System.out.println("Insira o nome: ");
        nome[x] = sc.nextLine();
        System.out.println("Insira a idade: ");
        idade[x] = sc.nextInt(); sc.nextLine();

        if (x==0){
            nomeJovem = nome[x];
            idadeJovem=idade[x];
        }
        else if (idade[x]<idadeJovem) {
            nomeJovem = nome[x];
            idadeJovem = idade[x];
         }
        }
        
        System.out.println("Nome e idade do aluno: "+nome[0]+", "+idade[0]);
        System.out.println("Nome e idade do aluno: "+nome[1]+", "+idade[1]);
        System.out.println("Nome e idade do aluno: "+nome[2]+", "+idade[2]);
        System.out.println("Nome e idade do aluno: "+nome[3]+", "+idade[3]);
        System.out.println("Nome e idade do aluno: "+nome[4]+", "+idade[4]);
        System.out.println("A pessoa mais jovem é: "+nomeJovem+", com "+idadeJovem+" ano(s) de idade.");
        sc.close();
    }
}