package lab02ex01;

import java.util.Scanner;

public class Lab02Ex01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        //RET1
        System.out.print("Digite o lado de ret1: ");
        ret1.setLado1(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o outro lado de ret1: ");
        ret1.setLado2(Integer.parseInt(input.nextLine()));
        
        //RET2
        System.out.print("Digite o lado de ret2: ");
        ret2.setLado1(Integer.parseInt(input.nextLine()));
        System.out.print("Digite o outro lado de ret2: ");
        ret2.setLado2(Integer.parseInt(input.nextLine()));
        
        //RET
        System.out.println("Retângulo 1:");
        System.out.println("Área: " + ret1.area());
        System.out.println("Perímetro: " + ret1.perimetro());
        
        //RET2
        System.out.println("Retângulo 2:");
        System.out.println("Área: " + ret2.area());
        System.out.println("Perímetro: " + ret2.perimetro());
    }   
}