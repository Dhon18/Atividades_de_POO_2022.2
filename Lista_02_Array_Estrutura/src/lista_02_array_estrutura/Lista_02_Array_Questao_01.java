/*
1 - Leia 10 números inteiros e armazene em um vetor v. Crie dois novos vetores v1 e v2.
Copie os valores ímpares de v para v1, e os valores paredes de v para v2. Note que cada
um dos vetores v1 e v2 têm no máximo 10 elementos, mas nem todos os elementos são
utilizados. No final escreva os elementos UTILIZADOS de v1 e v2.

São 10 questões
 */
package lista_02_array_estrutura;
import java.util.Scanner;
public class Lista_02_Array_Questao_01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [6];
        int cont;
        
        recebe(n1);
        System.out.println("Quantidade de números impares: " + quantidadedenumerosimpares(n1));
        System.out.println("Quantidade de números pares: " + quantidadedenumerospares(n1));
        
    }
    
    
    //usar void no inicio da função quando ela não retornar nenhum parametro
    public static void recebe(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [6];
        for(int i = 0 ; i < vt.length ; i++){
            System.out.println("Digite um valor na posição ["+i+"] do vertor: ");           
            vt[i] = leia.nextInt();
        }       
    }
    
  
    
    public static int quantidadedenumerospares(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [6];
        int contpa=0;
        
        for(int i = 0 ; i < vt.length ; i++){
            if(vt[i] %2 == 0){
                contpa++;
            }
        }       
        return contpa;
    }
    
    
    public static int quantidadedenumerosimpares(int[] vt){
        Scanner leia = new Scanner(System.in);
        int n1[] = new int [6];
        int contimpa=0;
        
        for(int i = 0 ; i < vt.length ; i++){
            if(vt[i] %2 == 1){
                contimpa++;
            }
        }
        
        return contimpa ;
    }
}