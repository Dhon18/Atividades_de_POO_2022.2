/*
4- Crie uma função calculaMedia(n1, n2, n3) para calcular a média de 3 notas e
retorna a média.
 */
package questao01estrutura;
import java.util.Scanner;
public class Questao04Estrutura {
    
    public static void  main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, cal, med;
        
        System.out.println("Digite o primeiro Valor");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo Valor");
        n2 = leia.nextInt();
        System.out.println("Digite o segundo Valor");
        n3 = leia.nextInt();
        
        
            cal = n1 + n2 + n3;
            med = cal / 3;






            
    }
    public static float resultado(float med){
       //resultado();
       return med;
    }
}