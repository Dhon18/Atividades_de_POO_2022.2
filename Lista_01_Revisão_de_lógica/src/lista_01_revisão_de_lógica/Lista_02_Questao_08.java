/*
8º) Ler 4 números inteiros e calcular a soma dos que forem par.
 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_08 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
  /*      
        int n1, n2, n3, n4;
        
        System.out.println("Digite o primeiro Valor");
        n1 = leia.nextInt();
        System.out.println("Digite o seguno Valor");
        n2 = leia.nextInt();
        System.out.println("Digite o terceiro Valor");
        n3 = leia.nextInt();
        System.out.println("Digite o quarto Valor");
        n4 = leia.nextInt();
        
        if(n1 %2 == 0){
            System.out.println("");
        }
        */
        int num, cont=0, i;
             
            for(num = 0 ; num <= 4 ; num++){
                System.out.println("Digite o valor: " + "\n");
                i = leia.nextInt();
                
                if(i %2 == 0){
                  cont+=i;
                  System.out.println("\n" + "O resultado é: " + cont);
            }              
        }
            
    }   
}