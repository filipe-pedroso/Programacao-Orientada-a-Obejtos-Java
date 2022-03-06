package lab01ex01;

import java.util.Scanner;

public class Lab01Ex01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int tam, col, lin=1;
        
        System.out.print("Entre com o tamanho do lado:");
        tam = input.nextInt();
        
            if(tam<1){
                System.out.println("Entrada inválida!");
                tam =1;
            }
            else if(tam>20){
                System.out.println("Entrada inválida!");
                tam=20;
            }
            
            while(lin <= tam){
                col=1;
                while(col<=tam){
                    if(lin==1){
                        System.out.print("*");
                    }
                    else if(lin==tam){
                        System.out.print("*");
                    }
                    else if(col==1){
                        System.out.print("*");
                    }
                    else if(col==tam){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    col++;
                }
                System.out.println();
                lin++;
            }
        }
    }