/*
10º) Faça um programa e surpreenda a todos nós!!!
*/
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao10 {
 public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
     
     areadoquadrado();
     
    }public static float areadoquadrado(){
        int dec;
        do{
        Scanner leia = new Scanner(System.in);
        Float A, B, H;    
        
        System.out.println("Digite a Base do Quadrado: ");
        B = leia.nextFloat();
        System.out.println("Digite a Altura do Quadrado: ");
        H = leia.nextFloat();
        A = B * H;
            System.out.println("A area do quadrado é: " + A + "\n \n");
            System.out.println("Desejar fazer qual operação? 1- Para S / 2- Para N / 3- Para ir ao IMC");
            dec = leia.nextInt();
            if(dec == 1){
                    return areadoquadrado();
                }
            if(dec == 3){
            
                }
            else{
                System.out.println("PROGRAMA FINALIZADO COM SUCESSO!!");
            }
            return 0;
        }while(dec == 1);
    }
}