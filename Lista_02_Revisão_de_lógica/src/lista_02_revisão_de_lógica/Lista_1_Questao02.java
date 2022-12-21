
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
    
        int quantCar, somaCar;
        float totaldevendas, salario, porcento, somatotal;
        
        System.out.println("Quantos carros você vendeu: ");
        quantCar = leia.nextInt();
        System.out.println("Valor do seu salario: ");
        salario = leia.nextFloat();
        System.out.println("Total de Vendas: ");
        totaldevendas = leia.nextFloat();
        
        somaCar = quantCar + 100;
        porcento = (float) (0.01 * somaCar);
        somatotal = (somaCar + salario) + porcento;
        
        System.out.println("Valor Total " + " " + somatotal );
        
    }
}