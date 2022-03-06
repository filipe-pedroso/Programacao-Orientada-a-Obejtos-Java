package lab02ex03;

public class Funcionario {
    
    private String nome, sobrenome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if(salario<0){
            this.salario = 0;
        }
    }
    
    public double anualSalario(){
        double anualSalario;
        
        anualSalario=12*salario;
        
        return anualSalario;
    }
    
    public double novoSalario(){
        double novoSalario=this.salario*1.10;
        return novoSalario*12;
    }
}
