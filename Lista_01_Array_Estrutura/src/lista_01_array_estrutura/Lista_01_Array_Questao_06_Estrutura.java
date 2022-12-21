/*
6. Crie um programa que leia 8 valores e adicione em um array. Depois, apresente a
média dos elementos do array
 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_06_Estrutura {
    public static void main(String[] args){
        media();
    }public static int media(){
        Scanner leia = new Scanner(System.in);
        
        
        int n1[] = new int[8];
        int i, soma=0, media;
        
        for(i = 0 ; i < 8 ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor");
            n1[i] = leia.nextInt();
        }for(i = 0 ; i < 8 ; i++){
            soma += n1[i];
        }
        //media = soma / 8;
            System.out.println("O resultado da média dos vetores é: " + soma/8);
        
        
        
        return 0;
    }
}
