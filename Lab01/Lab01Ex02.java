package lab01ex02;

import java.util.Scanner;

public class Lab01Ex02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int produto = 0;
        double total = 0;
        
        System.out.println("Digite o número do produto: ");
        produto = input.nextInt();
        
        while(produto != 0){
            System.out.println("Digite a quantidade: ");
            int quantidade = input.nextInt();
            switch(produto){
                case 1:
                    total=total+2.98*quantidade;
                    break;
                case 2:
                    total=total+4.5*quantidade;
                    break;
                case 3:
                    total=total+3.98*quantidade;
                    break;
                case 4:
                    total=total+4.49*quantidade;
                    break;
                case 5:
                    total=total+6.87*quantidade;
                    break;
                default:
                    System.out.println("Produto não cadastrado!");
            }
            System.out.println("Digite o número do produto ou 0 para sair: ");
            produto = input.nextInt();
        }
        System.out.println("Total de vendas R$ " + total);
    }
    
}
