/*
13 - Faça um programa que:
- Leia dois inteiros n e m, crie e leia uma estrutura de dados que é uma matriz de inteiros
positivos, contendo suas dimensões n e m bem como seus elementos.
- Leia um inteiro x e procure na matriz, mostrando na tela a linha e a coluna em que está.
Repita esse processo até ler um número menor que zero.


for(int n = 0 ; n < matriz.length ; n++){
        for(int m = 0 ; m < matriz.length ; m++){
          if(x < 0){
            System.out.println("O valor digitado está na coluna ["+n+"] na linha ["+m+"]");                       
            }
        }
    }




*/
package lista_01_matriz;
import java.util.Scanner;
public class Lista_01_Matriz_Questao_13 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int matriz[][] = {{1,2,3,4}};
    int x, n = 0, m = 0;
    boolean acha=false;
    
        
          /*for( n = 0 ; n < matriz.length ; n++){
        for( m = 0 ; m < matriz.length ; m++){
            System.out.println("Digite o valor na matriz ["+n+"] ["+m+"] :");
            matriz[n][m] = leia.nextInt();
                }
            }*/
        System.out.println("Digite um valor para ser localizado: ");
        x = leia.nextInt();
        if(x >= 0){
            do{
                do{
                   if(matriz[n][m] == x){
                       acha = true;
                   }
                   m++;
                }while(n  < matriz.length && acha == false);
                n++;
            }while(m < matriz.length && acha == false);
        }System.out.println("O valor digitado está na coluna ["+(n-1)+"] na linha ["+(m-1)+"]");
            
        
               
        
        
        System.out.println("Processo Finalizado!!!");        
    }
}