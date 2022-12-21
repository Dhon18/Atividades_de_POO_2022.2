/*
5º) Faça um programa que leia um array de 10 posições e conte quantos números 
pares são elementos do array. Imprima esta quantidade.
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Lista_03_Questao_05 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        int n[]= new int[10], i;
        
       for(i = 0 ; i < 10 ; i++){
         System.out.print("Digite o " +(i+1)+ "º numero: " );
         n[i]=leia.nextInt();
         
         if(n[i] %2==0){
                System.out.println("O número " + n[i] + " da posição "+ i + "º é pá " );
            }
       }      
    }
}