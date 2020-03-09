package médiadanota;

//Elaborar um programa em Java que leia as notas P1, P2, e de trabalho (T) e informe a média final obtida pelo aluno. 
//O cálculo da média é obtido pela fórmula: MF = P1*0,4 + p2*0,4 + T*0,2.
import java.util.Scanner;

public class MédiaDaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float p1;
        float p2;
        float t;
        float mf;
        
        System.out.println("Insira a primeira nota");
        p1 = teclado.nextFloat();
        
        System.out.println("Insira a segunda nota");
        p2 = teclado.nextFloat();
        
        System.out.println("Insira a nota do trabalho");
        t = teclado.nextFloat();
        
        mf = (float) ((p2*0.4 )+(p1*0.4)+(t*0.2));
        
        System.out.println("A média final é: "+mf);
    }  
}
