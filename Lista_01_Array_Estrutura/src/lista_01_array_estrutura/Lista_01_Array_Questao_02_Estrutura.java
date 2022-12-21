/*
2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores
lidos
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_02_Estrutura {
    public static void main (String[] args){
           numerosinteiros();  
    }
    
    public static int numerosinteiros(){
        Scanner leia = new Scanner(System.in);
        
       int n1[] = new int [6];
       int i;
       
       for( i = 0; i < n1.length ; i++){
           System.out.println("Digite um valor na posição " + i + "°n do vetor:");
           n1[i] = leia.nextInt();
       }
       for(i = 0 ; i < n1.length ; i++){
           System.out.println(n1[i]);
       }       
       return 0;
    }
}
