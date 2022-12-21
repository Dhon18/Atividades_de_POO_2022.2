/*
11 - Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui
*/
package lista_01_matriz;
import java.util.Scanner;
public class Lista_01_Matriz_Questao_11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    int [][] matriz = new int [4][4];
    int cont = 0;    
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz.length ; j++){
                System.out.println("Digite uma valor ["+i+"] ["+j+"] :");
                matriz[i][j] = leia.nextInt();
                if(matriz[i][j] > 10){
                    cont++;                   
                }
            }
        }System.out.println("Existem " + cont + " valores maior que 10");        
    }    
}