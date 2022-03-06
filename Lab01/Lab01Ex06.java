package lab01ex06;

public class Lab01Ex06 {

    public static void main(String[] args) {
        for(int lado1 = 1; lado1<=500 ; lado1++){
            for(int lado2 = 1 ; lado2<= 500; lado2++){
                for (int hip = 1; hip<=500 ; hip++){
                    if ((lado1*lado1)+(lado2*lado2)==(hip*hip)){
                        System.out.printf("Lado1 = %d, Lado2 = %d, Hipotenusa =%d \n", lado1,lado2,hip);
                    }
                }
            }
        }
    }
    
}
