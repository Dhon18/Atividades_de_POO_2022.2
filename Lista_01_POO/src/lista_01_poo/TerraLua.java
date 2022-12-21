package lista_01_poo;
import java.util.Scanner;
public class TerraLua {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ResultTerraLua calcular = new ResultTerraLua(); 

    System.out.println("Informe a distancia");
    calcular.setDis(leia.nextFloat());
    
    System.out.println("Distancia: "+calcular.getDis());
    System.out.println("\nMilhas: "+calcular.CalculaMilhas());
    System.out.println("\nPés: "+calcular.calculaPes());


    }
}