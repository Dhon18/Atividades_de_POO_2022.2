package poo_14_09_2022;
import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        Calculo c = new Calculo();
        
        System.out.println("Informe a altura do Retangulo: ");
        c.altura = leia.nextDouble();
        System.out.println("Informe a altura do Retangulo: ");
        c.largura = leia.nextDouble();
        System.out.println("Informe a largura do retangulo: ");
        c.largura = leia.nextDouble();
        
        System.out.println("A diagonal do retangulo é de "+c.diagonal());
        System.out.println("A area do retangulo é de "+c.area());
        System.out.println("O perimetro do retangulo é de "+c.perimetro());
        
    }
}