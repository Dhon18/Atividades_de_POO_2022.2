/*
4º) Em uma cidade se deseja sincronizar os semáforos. Com isto, quando um 
semáforo abre (fica verde), os veículos que nele estavam parados tendem a 
encontrar os próximos semáforos também abertos. Para que isto seja feito, 
os próximos semáforos precisam abrir um pouco depois, dependendo da velocidade 
permitida na via e da distância entre eles. Assim, ao abrir o semáforo, um 
veículo começa a acelerar até atingir a velocidade permitida, que mantém até 
chegar ao próximo semáforo, levando um certo tempo para  percorrer essa distância. 
Para que encontre o próximo semáforo aberto, este deve abrir um pouco antes da 
chegada do veículo (por ex: 3 segundos antes). Faça assim um algoritmo que informe 
quanto tempo depois um semáforo deve abrir, dada as seguintes informações:
a. A distância desde o semáforo anterior
b. A velocidade permitida da via

 */
package lista_01_revisão_de_lógica;
import java.util.Scanner;
public class Lista_02_Questao_04 {
    public static void main (String[] args){
     Scanner leia = new Scanner (System.in);
     
     double distancia = 0, velocidade = 0;
     float tempo = 0;

    System.out.println("Informe a distância entre os semáforos(em metros) ");
    distancia = leia.nextDouble();
    System.out.println("Insira a velocidade permitida na via(em km/h)");
    velocidade = leia.nextDouble();
    
    velocidade = velocidade*1000;

    distancia = distancia*3600;
    
    tempo = (float)(distancia/velocidade) ;
    System.out.println(tempo);
    
        if(tempo <= 3){
            System.out.println("Abrir o semáforo simultaneamente");
        }
        else{
            tempo -= 3;
            System.out.println("Abrir semáforo "+tempo+" segundo(s) após o anterior");
        }
     
    }           
}