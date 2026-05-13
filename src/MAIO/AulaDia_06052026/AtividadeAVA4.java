package MAIO.AulaDia_06052026;
import java.util.Scanner;
public class AtividadeAVA4 {
  public static void main(String[] args) {
    int paciente=1, idPaciente=0;
    String nomePaciente="";
    Scanner sc=new Scanner(System.in);
    while (paciente <= 1) {
    System.out.print("Insira o nome do Paciente: ");
    nomePaciente=sc.nextLine();
    System.out.print("Insira a idade do paciente: ");
    idPaciente=sc.nextInt();
    System.out.println("Paciente cadastrado!");
    System.out.println(nomePaciente);
    System.out.println(idPaciente);
    paciente++;
    }
    sc.close();
}
}
