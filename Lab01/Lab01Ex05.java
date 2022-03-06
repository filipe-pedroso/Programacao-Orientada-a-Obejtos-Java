package lab01ex05;

import java.util.Scanner;

public class Lab01Ex05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int whl=1, ent1, ent2, ent3, ent4, ent5;
        
        System.out.println("Primeira entrada: ");
        ent1 = input.nextInt();
        
        System.out.println("Segunda entrada: ");
        ent2 = input.nextInt();
        
        System.out.println("Terceira entrada: ");
        ent3 = input.nextInt();
        
        System.out.println("Quarta entrada: ");
        ent4 = input.nextInt();
        
        System.out.println("Quinta entrada: ");
        ent5 = input.nextInt();
        
        if(ent1<1){
            ent1=1;
        }
        else if(ent1>30){
            ent1=30;
        }
        
        if(ent2<1){
            ent2=1;
        }
        else if(ent2>30){
            ent2=30;
        }
        
        if(ent3<1){
            ent3=1;
        }
        else if(ent3>30){
            ent3=30;
        }
        
        if(ent4<1){
            ent4=1;
        }
        else if(ent4>30){
            ent4=30;
        }
        
        if(ent5<1){
            ent5=1;
        }
        else if(ent5>30){
            ent5=30;
        }
        
        while(whl<=ent1){
            System.out.print("*");
            whl++;
        }
        whl=1;
        System.out.println();
        
        while(whl<=ent2){
            System.out.print("*");
            whl++;
        }
        whl=1;
        System.out.println();
        
        while(whl<=ent3){
            System.out.print("*");
            whl++;
        }
        whl=1;
        System.out.println();
        
        while(whl<=ent4){
            System.out.print("*");
            whl++;
        }
        whl=1;
        System.out.println();
        
        while(whl<=ent5){
            System.out.print("*");
            whl++;
        }
        whl=1;
        System.out.println();
    }
    
}
