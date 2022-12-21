/*
10º) Faça um programa e surpreenda a todos nós!!!
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_10 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
              
        calcular(); 
    }
    
    public static float calcular(){
        Scanner leia = new Scanner(System.in);
        
        int ope = 0;
        do{
            Float al, pe, cal;
            int op=0;
            
                System.out.println("Informe a sua altura usando virgula: ");
                al = leia.nextFloat();
                System.out.println("Informe o seu peso usando a virgula: ");
                pe = leia.nextFloat();
                cal = (al * al)/pe;
                System.out.println("O Resultado do seu IMC é: " + cal);
                System.out.println("Você deseja recalcular novamente? 1- para sim / 2- para não: ");
                op = leia.nextInt();
                
                if(op == 1){
                    return calcular();
                }
                
        }while(ope == 2);
        System.out.println("PROGRAMA FINALIZADO COM SUCESSO!!!");
         return 0;
       
    }
}