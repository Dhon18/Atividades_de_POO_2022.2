/*
4º) Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% 
ao ano, e um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% 
ao ano, escreva um programa, que imprima o tempo necessário para que a população 
do país A ultrapasse a população do país B.
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_04 {
    public static void main (String[] args){
     Scanner leia = new Scanner(System.in);
        
     
     int a = 9000, div;
        
        div = a / 300;
        System.out.println("O pais A precisa de " + div + " anos" +  " para ultrapassar o pais B");
        
        
    }   
}

//A 30 anos chega a 9 mil
//B 40 anos chega a 8 mil