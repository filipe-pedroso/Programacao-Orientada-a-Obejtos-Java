package lab01ex03;

import java.util.Scanner;

public class Lab01Ex03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pos;
        
        System.out.println("Digite a posição da porta P (0 ou 1):");
        pos = input.nextInt();
        
        if(pos==0){
            System.out.println("A bolinha caiu pela saída C!");
        }
        else if(pos==1){
            System.out.println("Digite a posição da porta R (0 ou 1):");
            pos = input.nextInt();
            
            if(pos==0){
                System.out.println("A bolinha caiu pela saída B!");
            }
            else if(pos==1){
                System.out.println("A bolinha caiu pela saída A!");
            }
            else{
                System.out.println("Posição inválida!!!");
            }
        }
        else{
            System.out.println("Posição inválida!!!");
        }
        
    }
    
}
