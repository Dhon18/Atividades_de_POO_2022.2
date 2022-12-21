/*
7. Crie um programa que leia 10 valores e adicione em um array. Depois, imprima os
valores desse array de forma inversa ao que foi digitado.
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_07_Estrutura {
    public static void main(String[] args){
     reverso();
    }
    
    
    public static int reverso(){
        Scanner leia = new Scanner(System.in);
        
        int n1[] = new int [10];
        int i;
        
        for(i = 0 ; i < 10 ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor: ");
            n1[i] = leia.nextInt();
        }
        
        //Não entendo o porque meu Vetor não faz a contagem reversa com seta condição
        
        for(i = 10 ; i > 0 ; i--){
            System.out.println("Valor reverso do vetor é: " + n1[i]);
        }
        
        
        return 0 ;
    }
}