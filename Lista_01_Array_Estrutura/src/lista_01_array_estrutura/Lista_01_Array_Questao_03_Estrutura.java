/*
3. Crie um programa que leia 10 valores e adicione em um array. Depois, some todos
os elementos do array e imprima
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_03_Estrutura {
    public static void main(String[] args){
        
        
        chamarsoma();
        
        
        
    }public static int chamarsoma(){
        Scanner leia = new Scanner(System.in);
        
        int n1[] = new int[10];
        int i, soma=0;
        
        for(i = 0 ; i < 10 ; i++){
            System.out.println("Digite o valor para somar na posição " + i +" do Vetor");
            n1[i] = leia.nextInt();
        }
        for(i = 0 ; i < 10 ; i++){
            soma+=n1[i];
        }
            System.out.println("O valor da soma é: " + soma);
        
        
        
        return 0;
    }
}
