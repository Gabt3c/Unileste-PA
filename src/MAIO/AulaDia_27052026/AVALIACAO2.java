package MAIO.AulaDia_27052026;

import java.util.Scanner;

public class AVALIACAO2 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        String maquina, maquinaMaiorProducao = "";
        char setor;
        int pecasProduzidas;
        int maiorProducao = 0, contMontagem = 0, somaMontagem = 0, contEmbalagem = 0, somaEmbalagem = 0;
        int contQualidade = 0, somaQualidade = 0, totalMaquinas = 5;
        int eficiencia, contEficiencia=0;
        
        
        for (int i = 1; i <= totalMaquinas; i++){
        System.out.println("Nome da máquina:");
        maquina = ler.next();
        System.out.println("Setor: M-Montagem | E-Embalagem | Q-Qualidade");
        setor = ler.next().charAt(0);
        System.out.println("Contagem de peças produzidas:");
        pecasProduzidas = ler.nextInt();
        System.out.println("Avalie a eficiência da máquina numa escala de 1 a 10");
        eficiencia=ler.nextInt();
        //Medidor de eficiência
        if(eficiencia <6){
            contEficiencia++;
        }
        //Setorização das máquinas
        if (setor == 'M') {
            contMontagem++;
            somaMontagem += pecasProduzidas;
        }
        if(setor == 'Q') {
            contQualidade++;
            somaQualidade += pecasProduzidas;
        }
        if(setor == 'E') {
            contEmbalagem++;
            somaEmbalagem += pecasProduzidas;
        }
        //Seleção da maior produção
        if (pecasProduzidas>=maiorProducao){
            maiorProducao=pecasProduzidas;
            maquinaMaiorProducao=maquina;
        }
    }
        
        if(contEficiencia>2){
            System.out.println("\nProdução crítica");
        }
        else{
            System.out.println("\nProdução estável");
        }
        System.out.println("A quantidade de máquinas com baixa eficiência foi: "+contEficiencia);
        System.out.println("Montagem: "+ contMontagem);
        System.out.println("Embalagem: "+ contEmbalagem);
        System.out.println("Qualidade: "+ contQualidade);
        System.out.println("Média da produção do setor Montagem: "+ (somaMontagem / contMontagem));
        System.out.println("Média da produção do setor Embalagem: "+ (somaEmbalagem / contEmbalagem));
        System.out.println("Média da produção do setor Qualidade: " + (somaQualidade / contQualidade));
        System.out.println("Máquina com maior produção: "+ maquinaMaiorProducao);
        ler.close();
    }
}

