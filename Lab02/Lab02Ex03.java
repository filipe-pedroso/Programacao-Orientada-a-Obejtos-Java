package lab02ex03;

public class Lab02Ex03 {

    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        
        func1.setNome("Filipe");
        func1.setSobrenome("Pedroso");
        func1.setSalario(8000.00);
        
        func2.setNome("Rafael");
        func2.setSobrenome("Bruhns");
        func2.setSalario(4000.00);
        
        System.out.println("Primeiro funcionário:\n" + func1.getNome()+ " " + func1.getSobrenome());
        System.out.printf("Salário mensal: %.2f", func1.getSalario());
        System.out.printf("\nSalário anual: %.2f", func1.anualSalario());
        System.out.printf("\nNovo salário anual: %.2f", func1.novoSalario());
        System.out.println();
        System.out.println();
        System.out.println("Segundo funcionário:\n" + func2.getNome()+ " " + func2.getSobrenome());
        System.out.printf("Salário mensal: %.2f", func2.getSalario());
        System.out.printf("\nSalário anual: %.2f", func2.anualSalario());
        System.out.printf("\nNovo salário anual: %.2f", func2.novoSalario());
    }
    
}
