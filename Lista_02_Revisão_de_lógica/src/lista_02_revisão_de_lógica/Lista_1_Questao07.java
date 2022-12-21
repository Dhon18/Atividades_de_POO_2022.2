/*
7º) Ler dois valores e imprimir uma das três mensagens a seguir:
●	‘Números iguais’, caso os números sejam iguais
●	‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
●	‘Segundo maior’, caso o segundo seja maior que o primeiro.

 */
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao07 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite o primeiro Valor: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo Valor: ");
        num2 = leia.nextInt();
        
        if(num1 == num2){
            System.out.println("Números iguais");
        }
        else if(num1 > num2){
            System.out.println("Primeiro é maior");
        }
        else{
            System.out.println("Segundo é maior");
        }
        
        
    }
}