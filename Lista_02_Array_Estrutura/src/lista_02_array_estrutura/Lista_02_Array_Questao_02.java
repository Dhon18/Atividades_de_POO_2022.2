/*
2 - Faça um programa que leia um vetor de cinco posisções para números reais e, depois,
um valor x inteiro. Se o valor x for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de
1 e 2 escreva uma mensagem falando que o valor é inválido.
 */
package lista_02_array_estrutura;
import java.util.Scanner;
public class Lista_02_Array_Questao_02 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int[5];              
        retornar(n1);
    }
    
    public static int retornar(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int[5];
        int ident ;
        for(int i = 0 ; i < vt.length ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vetor: ");
            vt[i] = leia.nextInt();          
        }   System.out.println("\n" + "*******************************");
            System.out.println("* Digite um codigo 0 / 1 / 2: *");
            System.out.println("*******************************");
            ident = leia.nextInt();
        
        switch (ident){
            case 0:
                System.out.println("Sistema Finalizado com Sucesso!!");
                break;
            case 1:
                for(int i = 0 ; i < vt.length ; i++){
                        System.out.println("Vetor na ordem Direta: " + "\n" + vt[i]);
                    }   
                break;
                
            case 2:  
                for(int i =  vt.length -1; i >= 0   ; i--){  
                         System.out.println("***********************************************");  
                         System.out.println("* Vetor na ordem Inversa: " + "\n" + vt[i] + "*");  
                         System.out.println("***********************************************");  
                     }   
                break;                    
            default:
        }
        return 0;
    }
}