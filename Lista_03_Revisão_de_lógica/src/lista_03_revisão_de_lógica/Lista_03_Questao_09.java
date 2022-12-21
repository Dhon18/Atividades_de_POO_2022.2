/*
9º) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, 
calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores 
válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 
'NOVO CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar 
um novo cálculo, caso contrário deverá encerrar o algoritmo.
 */

package lista_03_revisão_de_lógica;
import java.util.Scanner;
public class Lista_03_Questao_09 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        int n1, n2, me;
        String n3;
    do{
        
            System.out.println("Digite a primeira nota: ");
            n1 = leia.nextInt();
            System.out.println("Digite a segunda nota: ");
            n2 = leia.nextInt();
            me = n1 + n2 / 2;
            System.out.println("A média do aluno é " + me);
            
            System.out.println("S/N");
            n3 = leia.next();
            
    }while("s".equals(n3));
        System.out.println("Operação Cancelada!!");
    
    
    }   
}