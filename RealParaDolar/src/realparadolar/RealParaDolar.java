package realparadolar;

//Elaborar um programa em Java que converta o valor fornecido pelo usuário convertido para dólar.
import java.util.Scanner;

public class RealParaDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float cambioDolar;
        float real;
        System.out.println("Insira o valor do real em dolares");      
        cambioDolar = input.nextFloat();
        System.out.println("Insira o valor a converter");
        real = input.nextFloat();
        
        real = real*cambioDolar;
        
        System.out.printf("O valor em dolares é US$ %.2f \n", real);
        
    }
}
