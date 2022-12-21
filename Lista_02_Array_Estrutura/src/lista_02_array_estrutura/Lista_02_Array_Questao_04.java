/*
4 - Leia dois vetores de inteiros X e Y, cada um com 5 elementos (assuma que o usuário
não informa elementos repetidos). Calcule e mostre os vetores resultantes em cada caso
abaixo:
• Soma entre X e Y: soma de cada elemento de X com o elemento da mesma
posição em Y
• Produto entre X e Y: multiplicação de cada elemento de X com o elemento da
mesma posição em Y
• Diferença entre X e Y: todos os elementos de X que não existam em Y
• Interseção entre X e Y: apenas os elementos que aparecem nos dois vetores
• União entre X e Y: todos os elementos de X, e todos os elementos de Y que não
estão em X.
OBS: Para cada caso, você deve criar uma função que realize esse procedimento e
retorno o vetor novo.
 */
package lista_02_array_estrutura;
import java.util.Scanner;
public class Lista_02_Array_Questao_04 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [5];
        int n2[] = new int [5];
        int i;
        
        entradadevetorn1();
        
    }
    
    public static int entradadevetorn1(){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [5];
        int n2[] = new int [5];
        
        for(int i = 0 ; i < n1.length ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor");
            n1[i] = leia.nextInt();
        }
        
        for(int i = 0 ; i < n2.length ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor");
            n2[i] = leia.nextInt();
        }    
        
        for(int i = 0 ; i < 5 ; i++){
            int soma = n1[i] + n2[i];
            System.out.println("Resultado da soma é: " + n1[i] +" + "+ n2[i] +" = "+soma);
        }
        
        for(int i = 0 ; i < 5 ; i++){
            int vetmult = n1[i] * n2[i];
            System.out.println("Resultado da multiplicação é: " + n1[i] +" x "+ n2[i] +" = "+vetmult);
        }
        
        for(int i = 0 ; i < 5 ; i++){
            if(n1[i] != n2[i]){
                System.out.println("\n Valores diferente do vetor n2 é: " + n1[i]);
            }
        }
        
        for(int i = 0 ; i < 5 ; i++){
            int antn1 = n1[i] - 1;
            int antn2 = n2[i] - 1;
            System.out.println("O antecessor de ["+i+"] na posição do vetor ["+n1+"] é: " + antn1);
            System.out.println("O antecessor de ["+i+"] na posição do vetor ["+n2+"] é: " + antn2);
        }
        
        for(int i = 0 ; i < 5 ; i++){
            if(n1[i] != n2[i]){
                System.out.println("\n Valores que não existem no vetor n1 é: " + n1[i]);
            }
        }for(int i = 0 ; i < 5 ; i++){
            if(n2[i] != n1[i]){
                System.out.println("\n Valores que não existem no vetor n2 é: " + n2[i]);
            }
        }
        
        
        
       return 0; 
    }
}