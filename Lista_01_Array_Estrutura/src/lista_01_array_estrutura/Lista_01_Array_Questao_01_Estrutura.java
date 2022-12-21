/*
1. Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:

Feito === a. Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
b. Armazene em uma variável inteira (simples) a soma entre os valores das
posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
c. Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
d. Mostre na tela cada valor do vetor A, um em cada linha.

 */
package lista_01_array_estrutura;
import java.util.Scanner;
public class Lista_01_Array_Questao_01_Estrutura {
    public static void main(String[] args) {
        
      Scanner leia = new Scanner(System.in);
        
        int n1[] = new int [6];
        n1[0] = 1; n1[1] = 0; n1[2] = 5; n1[3] = -2; n1[4] = -5; n1[5] = 7;
        int soma;
        
        soma = n1[0] + n1[1] + n1[5];
        n1[4] = 100;
            System.out.println("A soma dos vetores n1=[0], n1=[1] e n1=[5] é: " + soma);
            System.out.println(n1[4]);  
               
    }
}