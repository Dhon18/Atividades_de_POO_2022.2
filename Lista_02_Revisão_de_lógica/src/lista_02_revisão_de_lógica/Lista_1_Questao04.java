/*
4º) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o 
jogo pode iniciar em um dia e terminar no dia seguinte.
*/

package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int horaInicial, horaFinal, calcular;
        
        System.out.println("Informe a hora inicial: ");
        horaInicial = leia.nextInt();
        System.out.println("Informe a hora Final: ");
        horaFinal = leia.nextInt();
        
        calcular = (horaInicial - horaFinal);
        
        if(calcular > 24){
            System.out.println("O jogo excedeu o tempo limite de duração!!!");
        }else{
            System.out.println("O tempo de duração do jogo foi de: " + calcular + ":00 horas");
        }      
    }
}