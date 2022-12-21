package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);     
        int A=10, B=20, C=0;             
                C=B;
                B=C;
                A=C;            
                System.out.println("O valor de A é: " + A + " " + "\n" + "E o valor de B é:" + " " + B);
    }
}