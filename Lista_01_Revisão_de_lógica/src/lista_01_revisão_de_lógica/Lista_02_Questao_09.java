/*
9º) Para ler 3 números reais do teclado e verificar se o primeiro é maior que a soma dos outros dois. 
*/
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_09 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
 
        int n1, n2, n3, so;
        
        System.out.println("Digite o primeiro valor: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = leia.nextInt();
        System.out.println("Digite o terceiro valor: ");
        n3 = leia.nextInt();
        
        so = n2 + n3;
        if(n1 > so){
            System.out.println("O primeiro valor é maior que a soma dos outros dois números");
        }else{
            System.out.println("O primeiro valor é menor que a soma dos outros dois números");
        }
        
        
        
    }
}