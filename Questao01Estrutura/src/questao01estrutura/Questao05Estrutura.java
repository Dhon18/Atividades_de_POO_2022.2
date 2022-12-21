/*
5 - Escreva uma função que receba dois números inteiros retorne o menor número
*/
package questao01estrutura;
import java.util.Scanner;
public class Questao05Estrutura {
    public static void main (String[] args){
        
        
    menor();
   }
    
    public static void menor(){
        Scanner leia = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Digite um valor: ");
        num1 = leia.nextInt();
        System.out.println("Digite um valor: ");
        num2 = leia.nextInt();
        
        if(num1 < num2){
            System.out.println("O menor número é:" + num1);
        }
        else{
            System.out.println("O menor número é:" + num2);
        }      
    }
}