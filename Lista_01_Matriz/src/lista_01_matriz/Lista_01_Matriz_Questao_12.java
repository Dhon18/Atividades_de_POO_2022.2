/*
12 - Leia uma matriz 5x5. Leia também um valor X. O programa deverá fazer uma busca
desse valor na matriz e, ao final escrever a localização (linha e coluna) ou uma
mensagem de "não encontrado"
 */
package lista_01_matriz;
import java.util.Scanner;
public class Lista_01_Matriz_Questao_12 {

    public static void main (String args[]){
        double[][] matriz = new double [5][5];
        double num;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.println("Digite o valor["+i+"]["+j+"]: ");
                matriz[i][j] = leia.nextDouble();
            }
        }
        System.out.println("Digite um número: ");
        num = leia.nextDouble();

        boolean encontrou = false;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                if(num == matriz[i][j]){
                    encontrou = true;
                    System.out.println("["+i+"]"+"["+j+"]");
                }
            }
        }

        if(encontrou == false){
            System.out.println("Não encontrado");
        }


    }
}