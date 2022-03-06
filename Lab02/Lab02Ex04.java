package lab02ex04;

public class Lab02Ex04 {
    
    public static void main(String[] args) {
        
        Invoice entrada1 = new Invoice();
        entrada1.setDescricao("Entrada1");
        entrada1.setIdentiﬁcador("entrada1");
        entrada1.setQuantidade(-20);
        entrada1.setPreco(-99);
        entrada1.show();
        
        Invoice entrada2 = new Invoice();
        entrada2.setDescricao("Entrada2");
        entrada2.setIdentiﬁcador("entrada2");
        entrada2.setQuantidade(250);
        entrada2.setPreco(990);
        entrada2.show();
    }
    
}
