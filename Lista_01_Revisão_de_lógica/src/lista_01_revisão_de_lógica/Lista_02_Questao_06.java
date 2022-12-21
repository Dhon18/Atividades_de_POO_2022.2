/*
6º) Escreva um programa que leia uma letra e mostre se ela é vogal ou consoante.
 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_06 {
    public static void main (String[] args){
     Scanner leia = new Scanner (System.in);
        
        String L;
        
        System.out.println("Digite a letra para ser identificada: ");
        L = leia.nextLine();
        
         if(null == L){
             System.out.println("Essa letra é Cosoante");
         }else switch (L) {
            case "A":
            case "a":
                System.out.println("Essa letra é Vogal");
                break;
            case "E":
            case "e":
                System.out.println("Essa letra é Vogal");
                break;
            case "I":
            case "i":
                System.out.println("Essa letra é Vogal");
                break;
            case "O":
            case "o":
                System.out.println("Essa letra é Vogal");
                break;
            case "U":
            case "u":
                System.out.println("Essa letra é Vogal");
                break;
            default:
                System.out.println("Essa letra é Cosoante");
                break;
        }
        
    }   
}