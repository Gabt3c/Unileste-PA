package MAIO.AulaDia_13052026.AtividadeAvaliativa2;
/*O objetivo deste algoritmo é ler a idade e profissão T para Técnico e E para Engenheira de 5 pessoas,
depois calcule e escreva:
a)A quantidade de pessoas que possuem a profissão de técnico e tem idade acima ou igual a 30.
b)A média de idade das pessoas que possuem a profissão de Engenheiro.
c)Porcentagem de pessoas que possuem idade abaixo de 25 anos.
d)A idade e a profissão da pessoa mais velha.*/
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char profissao, maiorProfissao = 'A';
        int qt=1, tecVelho=0, qtEng=0;
        double idade, maiorId=0, mediaEng=0, porcentagemJovem=0, contId=0, idEng=0;

        do{System.out.print("Insira sua profissão, (T)Técnico ou (E)Engenheiro: ");
        profissao=sc.next().charAt(0);

        System.out.print("Insira sua idade: ");
        idade = sc.nextDouble();
        qt++;
        if (idade>= maiorId){
          maiorId=idade;
          maiorProfissao = profissao;
        }

        if (idade >= 30 && profissao == 'T') {
            tecVelho++;
        }

        if (profissao == 'E'){
          qtEng++;
          idEng=idEng+idade;
        }

        if (idade<25) {
          contId++;
        }
        
        }
        while(qt<=5);
        porcentagemJovem = (contId/5)*100;
        mediaEng = idEng/qtEng;
        System.out.println("Tecnicos velhos: "+tecVelho);
        System.out.println("Maior idade: "+maiorId+"\nMaior Profissão: "+maiorProfissao);
        System.out.println("Média de idade dos engenheiros: "+mediaEng);
        System.out.println("Porcentagem de funcionários jovens: "+porcentagemJovem);
        sc.close();
    }
}
