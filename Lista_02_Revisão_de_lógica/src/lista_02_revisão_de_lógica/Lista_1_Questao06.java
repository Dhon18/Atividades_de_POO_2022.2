/*
6º) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. 
Caso não haja vencedor deverá ser impressa a palavra EMPATE.
 */
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao06 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
     
        String time1, time2;
        int goltime1, goltime2;
        
        System.out.println("Digite o nome do Primeiro time: ");
        time1 = leia.nextLine();
        System.out.println("Digite o nome do segundo time: ");
        time2 = leia.nextLine();
        System.out.println("Digite total de gols do primeiro time: ");
        goltime1 = leia.nextInt();      
        System.out.println("Digite o total de gols do segundo time: ");
        goltime2 = leia.nextInt();
        
        if(goltime1 > goltime2){
            System.out.println("O time: " +time1+" é o vencedor com " + goltime1+" pontos no placar!!!");
        }
        else if(goltime2 > goltime1){
            System.out.println("O time: " +time2+" é o vencedor com " + goltime2+" pontos no placar!!!");
        }
        else{
            System.out.println("O jogo terminou com EMPATE");
        }       
    }
}