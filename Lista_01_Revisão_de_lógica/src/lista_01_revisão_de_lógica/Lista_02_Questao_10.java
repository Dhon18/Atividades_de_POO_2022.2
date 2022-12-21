/*
10º) Faça um programa e surpreenda a todos nós!!!
*/

package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_10 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        somar();
            

        
  }
    public static int somar(){
        int re;
        do{
            Scanner leia = new Scanner(System.in);
            int n1, n2, so;
        
            System.out.println("Digite o primeiro Valor para somar: ");
            n1 = leia.nextInt();
            System.out.println("Digite o segundo Valor para somar: ");
            n2 = leia.nextInt();
            so = n1 + n2;
            System.out.println("Resultado " + so + "\n \n");
            System.out.println("Desejar fazer qual operação? 1- Para S/ 2- Para N");
            re = leia.nextInt();
            if(re == 1){
                    return somar();
                }else{
                System.out.println("PROGRAMA FINALIZADO COM SUCESSO!!");
            }
            return 0;          
        }while(re == 1);           
    }
}