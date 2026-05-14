package MAIO.AulaDia_06052026;
import java.util.Scanner;
public class AtividadeAVA4 {
  public static void main(String[] args) {
    int paciente=1, idPaciente=0, maiorId=0;
    String nomePaciente="";
    String maisVelho="";
    Scanner sc=new Scanner(System.in);
    while (paciente <= 1) {
    System.out.print("Insira o nome do Paciente: ");
    nomePaciente=sc.nextLine();
    System.out.print("Insira a idade do paciente: ");
    idPaciente=sc.nextInt();
    System.out.println("Paciente "+nomePaciente+" cadastrado! Paciente possui" +idPaciente+" anos de idade.");
      //extração da maior idade talvez??
    if(idPaciente > maiorId){
      maiorId=idPaciente;
      maisVelho=nomePaciente;
    }
    paciente++;
    }
    System.out.print("O usuário mais velho cadastrado foi "+maisVelho+ " e sua idade é "+idPaciente);
    sc.close();
}
}
