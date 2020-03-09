package idadeemdias;

//Elaborar um programa em Java que leia a idade de uma pessoa e informe o número de dias que ela já viveu.
import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade");
        idade = input.nextInt();
        
        idade = idade*365;
        
        System.out.println("Você ja viveu "+ idade+" dias!");
    }
}