package MAIO.AulaDia27052026.ATIVIDADES_ava;
/*O Objetido deste algoritmo é obter nome e nota de 20 alunos,
calcular a média da turma e depois informar quais são os alunos
que obtiveram nota acima da média calculada(Primeiro exercício praticando o uso de vetores) */
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double notas[] = new double[5]; double totalAlunos=20, somaNotas=0;
    String nome[] = new String[5], acimaMed = "";

        for(int cont=0; cont<totalAlunos; cont++){
        System.out.println("Insira o nome do seu aluno "+cont+":");
        nome[cont] = sc.nextLine();
        System.out.println("Insira a nota do aluno "+cont+":");
        notas[cont] = sc.nextDouble();
      
        somaNotas = somaNotas+notas[cont];
    }
    
    double media = somaNotas/totalAlunos;
    System.out.println(""+media);
    for (int cont=0; cont<totalAlunos; cont++)
    if (notas[cont] > media){
        acimaMed = nome[cont];
      System.out.println("O alunos com nota acima da média são: "+acimaMed);
    }
    sc.close();
  }
}

