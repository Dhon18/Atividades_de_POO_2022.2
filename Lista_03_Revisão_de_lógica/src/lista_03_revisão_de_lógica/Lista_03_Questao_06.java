/*
6º) Faça um programa que leia um array de 10 inteiros e imprima o menor e o maior valor dentre os elementos do array.
 */

package lista_03_revisão_de_lógica;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Lista_03_Questao_06 {
    public static void main (String[] args){
     Scanner leia = new Scanner (System.in);
        
         List<String> lista = new ArrayList<>();

        int numero, maior, menor;
        int i;

        System.out.print("\n Digite o valor: ");
        numero = leia.nextInt();

        maior=numero;
        menor=numero;

        for(i=1; i<10; i++){
        System.out.print("\n Digite o valor: ");
        numero = leia.nextInt();

        if(numero>maior){
            maior=numero;
            
        }
        if(numero<menor){
            menor=numero;

        }


System.out.print("\n O menor numero entrado é: " +  menor);
System.out.print("\n O maior numero entrado é: " + maior + "\n");

        }         
    }
}