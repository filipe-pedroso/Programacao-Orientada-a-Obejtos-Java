package lab01ex04;

import java.util.Scanner;

public class Lab01Ex04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Double salario, novo_salario, ValorGanho;
        String perc = null;
        
        System.out.println("Digite seu salário:");
        salario = Double.parseDouble(input.nextLine());
        
        if(salario>=0 && salario<=400.00){
            novo_salario=salario*1.15;
            ValorGanho=salario*0.15;
            perc = "15%";
        }
        else if(salario>=400.01 && salario<=800.00){
            novo_salario=salario*1.12;
            ValorGanho=salario*0.12;
            perc = "12%";
        }
        else if(salario>=800.01 && salario<=1200.00){
            novo_salario=salario*1.1;
            ValorGanho=salario*0.1;
            perc = "10%";
        }
        else if(salario>=1200.01 && salario<=2000.00){
            novo_salario=salario*1.07;
            ValorGanho=salario*0.07;
            perc = "7%";
        }
        else{
            novo_salario=salario*1.04;
            ValorGanho=salario*0.04;
            perc = "4%";
        }
        
        System.out.printf("Novo salário R$ %.2f\n", novo_salario);
        System.out.printf("Valor ganho de reajuste R$ %.2f\n", ValorGanho);
        System.out.println("Percentual de reajuste: " + perc);
    }
    
}
