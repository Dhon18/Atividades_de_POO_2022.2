/*
3 - Faça um programa que leia um vetor de 10 posições e verifique se existem valores
iguais e os escreva. Dica: para cada valor do vetor, você terá que comparar com os
valores posteriores a ele. 
 */
package lista_02_array_estrutura;
import java.util.Scanner;
public class Lista_02_Array_Questao_03 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int[10];
        int cont=0, i;
        
          recebe(n1);
          System.out.println("Existe: " + retorna(n1) + " Vetores Iguais");

    }
    
    
    public static int recebe(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int[10];
        int cont ;
        for(int i = 0 ; i < vt.length ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do Vetor: ");
            vt[i] = leia.nextInt();
        }              
        return 0;
    }
    
    public static int retorna(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [10];
        int resp=0;   
    for (int i = 0; i <= vt.length; i++) {
        for (int j = i + 1; j < vt.length; j++) {// tem a função de percorrer o código e testar uma por uma
            if (vt[j] == vt[i]) { //tem a função de comparar o vetor através do tamanho dele
                resp += 1; // há um valor repetido ele soma mais um
            }
        }
    }

        return resp;
    }
}