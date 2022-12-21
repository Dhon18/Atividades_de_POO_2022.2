//1 – Construa um programa que verifica se uma palavra é palíndromo. Use uma função
//para essa verificação. Exemplo de palavras palíndromos: ARARA, TENET, OSSO.

package estruturadedados;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    String vet[] = new String [4];
        String palavra;
    
                System.out.println("Digite uma palavra ou frase:");
    		palavra = leia.nextLine();
    		String palindromo = "";
    		
    		for(int i = palavra.length() -1; i >= 0; i--){
    			palindromo += palavra.charAt(i);
    		}   		
    		if(palindromo.equals(palavra)) {
    			System.out.print("É um palíndromo!" + "\n" + palindromo);
    		}
    		else {
    			System.out.print("Não é um palíndromo!" + "\n" + palindromo);
    	}
    } 
}