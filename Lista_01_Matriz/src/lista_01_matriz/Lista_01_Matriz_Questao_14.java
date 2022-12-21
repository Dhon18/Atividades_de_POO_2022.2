/*
14 - Faça um programa que leia uma matriz 3x6 com valores reais
- Imprima a soma de todos os elementos das colunas ímpares
- Imprima a média aritmética dos elementos da seguida e quarta coluna
- Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2
- Imprima a matriz modificada
 */
package lista_01_matriz;
import java.util.Scanner;
public class Lista_01_Matriz_Questao_14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    int vetor[][] = new int [3][6];
    int i, j=0, c = 0, t;
    float m=0;
    
    for(i = 0 ; i < 3 ; i++){
        for(j = 0 ; j < 6 ; j++){
            System.out.println("Digite o valor na coluna ["+i+"] da matriz na linha ["+j+"] :");
            vetor[i][j] = leia.nextInt();
            
            }   
        }
    
    for(i = 0 ; i < 3 ; i++){
        for(j = 1 ; j < 5 ; j+=2){
            System.out.println(vetor[i][j]);
            m+=vetor[i][j];
            
                }            
            }System.out.println("A média aritmetica é: " + m /6);   
        }
     
    }
