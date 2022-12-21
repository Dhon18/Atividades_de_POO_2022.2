package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
     
        int num1, num2;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = leia.nextInt();
        
        if(num1 < num2){
            System.out.println(num1 + "\n");
            System.out.println(num2);
        }else{
            System.out.println(num2 + "\n");
            System.out.println(num1);
        } 
    }
}
