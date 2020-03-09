package arearetangulo;
/*laborar um programa que leia os valores da medida dos lados de um retângulo, calcule e retorne sua área e seu perímetro.
*/
import java.util.Scanner;
public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base;
        float alt;
        float area;
        float perimetro;
        
        System.out.println("Digite a altura do retangulo");
        alt = input.nextFloat();
        System.out.println("Digite a base do retangulo");
        base = input.nextFloat();
        
        area = base*alt;
        perimetro = (base*2)+(alt*2);
        
        System.out.println("O retângulo tem "+area+"de área e o perimetro é "+perimetro);
    }
}
