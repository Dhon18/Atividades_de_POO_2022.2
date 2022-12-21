package terra;
import java.util.Scanner;
public class Terra {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    CalculaDistancia c = new CalculaDistancia(); 

    System.out.println("Informe a distancia");
    c.setDistancia(ler.nextFloat());
    
    System.out.println("Distancia: "+c.getDistancia()+"\nMilhas: "+c.CalculaMilhas()+"\nPés: "+c.calculaPes());
}
    
}
