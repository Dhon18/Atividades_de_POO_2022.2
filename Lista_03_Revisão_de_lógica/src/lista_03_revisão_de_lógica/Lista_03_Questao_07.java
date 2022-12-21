/*
7º) Escreva um programa que leia o índice pluviométrico dos 10 primeiros dias do
mês de junho e informe o dia que mais choveu, o dia que menos choveu e a média 
pluviométrica do período.
 */
package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_07 {
    public static void main(String[] args){
        Scanner leia = new Scanner (System.in);
        
        double in = 0,mi = 0, ma = 0,so = 0;
        int di = 0, Me = 0;

        for(int c = 0; c < 10; c++){
    
    System.out.println("informe o indice pluvial do "+(c+1)+" dia");
    in = leia.nextDouble();
    so += in;
    
    if(c == 0){
        mi = in;
        Me = c+1;
    }
    if(in < mi){
        Me = c+1;
        mi = in;
    }
    if(in > ma){
        di = c + 1;
        ma = in;
    }
}
so /= 10;
    System.out.println("dia que mais choveu foi o dia :"+di);
    System.out.println("Com um indice pluvial de :"+ma+"ml");
    System.out.println("no dia que menos chovel foi o dia :"+Me);
    System.out.println(" com um indice puvial de "+mi+" ml");
    System.out.println("Média pluviometrica :"+so);
        
        
        
    }
}