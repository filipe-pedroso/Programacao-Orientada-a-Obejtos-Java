package lab02ex02;

import java.util.Scanner;

public class Lab02Ex02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        System.out.print("Digite o Modelo da tv1: ");
        tv1.setModelo(input.nextLine());
        System.out.print("Digite o Preço da tv1: ");
        tv1.setPreco(input.nextFloat());
        System.out.print("Digite o Tamanho da tv1: ");
        tv1.setTamanho(input.nextFloat());
        System.out.print("Digite o Volume da tv1: ");
        tv1.setVolume(input.nextInt());
        System.out.print("Digite o Canal da tv1: ");
        tv1.setVolume(input.nextInt());
        System.out.print("Digite o Status atual da tv1 (true ou false): ");
        tv1.setLigada(input.nextBoolean());
        System.out.print("\n\n");

        System.out.print("\n\n");
        System.out.print("Digite o Modelo da tv2: ");
        tv2.setModelo(input.nextLine());
        System.out.print("Digite o Preço da tv2: ");
        tv2.setPreco(input.nextFloat());
        System.out.print("Digite o Tamanho da tv2: ");
        tv2.setTamanho(input.nextFloat());
        System.out.print("Digite o Volume da tv2: ");
        tv2.setVolume(input.nextInt());
        System.out.print("Digite o Canal da tv2: ");
        tv2.setVolume(input.nextInt());
        System.out.print("Digite o Status atual da tv2 (true ou false): ");
        tv2.setLigada(input.nextBoolean());
        
        //alterações solicitadas
        System.out.println("Alterando canal da TV1");
        tv1.alteraCanal( 2 );
        System.out.println("Alterando canal da TV2");
        tv2.alteraCanal( -3 );
        System.out.println("Alterando volume da TV1");
        tv1.alteraVolume( 3 );
        System.out.println("Alterando volume da TV2");
        tv2.alteraVolume( 2 );
        System.out.println("Desligando a TV2");
        tv2.setLigada(false);
    }
    
}
