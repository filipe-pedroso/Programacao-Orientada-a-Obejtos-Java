package lab02ex05;

import java.util.Scanner;

public class Lab02Ex05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        PerfilSaude paciente = new PerfilSaude();
        
        System.out.print("\n Paciente\n");
        System.out.print("\n Nome: ");
        paciente.setNome(input.nextLine());
        System.out.print("\n Sobrenome: ");
        paciente.setSobrenome(input.nextLine());
        System.out.print("\n Sexo: ");
        paciente.setSexo(input.nextLine());
        System.out.print("\n Altura(m): ");
        paciente.setAltura(input.nextDouble());
        System.out.print("\n Peso(Kg): ");
        paciente.setPeso(input.nextDouble());
        System.out.print("\nData de Nascimento");
        System.out.print("\n dia: ");
        paciente.setDia(input.nextInt());
        System.out.print("\n mês: ");
        paciente.setMes(input.nextInt());
        System.out.print("\n ano: ");
        paciente.setAno(input.nextInt());

        System.out.println();
        System.out.println();
        paciente.show();
    }
    
}
