/*
5. Crie um programa que leia 6 valores e adicione em um array. Depois, conte quantos
números pares existem no array. Imprima a quantidade.
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_05_Estrutura {
    public static void main(String[] args){
        
        contarpar();
        
    }public static int contarpar(){
        Scanner leia = new Scanner(System.in);
        
        int n1[] = new int [6];
        int i, cont=0;
        
        for(i = 0 ; i < 6 ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor: ");
            n1[i] = leia.nextInt();
        }
        
        
        
        for(i = 0 ; i < 6 ; i++){
            if(n1[i] %2 == 0){
                cont +=1;
            }
            
        }
        
        System.out.println("Há: " + cont + " valores pares no vetor");
        
        
        
        
        return 0;
    }
}
