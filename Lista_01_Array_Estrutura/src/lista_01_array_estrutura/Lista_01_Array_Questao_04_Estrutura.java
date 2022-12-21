/*
4. Crie um programa que leia 5 valores e adicione em um array. Depois, imprima todos
os elementos que são ímpares.
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_04_Estrutura {
    public static void main(String[] args){
        
      valorimpares();  
        
        
    }public static int valorimpares(){
        Scanner leia = new Scanner(System.in);

        int n1[] = new int[5];
        int i;
        
        for(i = 0 ; i < 5 ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor");
            n1[i] = leia.nextInt();           
        }for(i = 0 ; i < 5 ; i++){
            if(n1[i] %2 == 1){
                System.out.println(n1[i]);
            }
        }
                
                
return 0;
    }
}
