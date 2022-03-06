package lab02ex05;

public class PerfilSaude {
    
  private String nome,sobrenome,sexo;
  private int dia,mes,ano;
  private double peso,altura;

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getNome() {
    return nome;
  }
  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
  
  public String getsobrenome() {
    return sobrenome;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  
  public String getSexo() {
    return sexo;
  }
  public void setDia(int dia) {
    this.dia = dia;
  }
  
  public int getDia() {
    return dia;
  }
  public void setMes(int mes) {
    this.mes = mes;
  }
  
  public int getMes() {
    return mes;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  
  public int getAno() {
    return ano;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  public double getPeso() {
    return peso;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  public double getAltura() {
    return altura;
  }

  public void show(){
    System.out.println("\nNome: "+nome+" "+sobrenome);
    System.out.println("\nSexo: "+sexo);
    System.out.printf("\nData de Nascimento: %d/%d/%d",dia,mes,ano);
    System.out.printf("\nIdade: %d",(2022-ano));
    System.out.printf("\nPeso: %.2f",peso);
    System.out.printf("\nAltura: %.2f",altura);
    System.out.printf("\nIMC: %.2f",(peso/(altura*altura)));
  }
}
