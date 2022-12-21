/*
9º) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser 
apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro 
valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a 
mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem 
‘Acesso permitido’.

 */
package lista_02_revisão_de_lógica;
import java.util.Scanner;
public class Lista_1_Questao09 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
    
    int num1;
    
        System.out.println("Digite o código de usuario: ");
        num1 = leia.nextInt();
        
        if(num1 == 1234){
    int senha;
        System.out.println("Digite a senha de usuario: ");
        senha = leia.nextInt();
        if(senha == 9999){
              System.out.println("Acesso permitido");  
        }else{
            System.out.println("Acesso de usuario negado, senha incorreta");
            }       
        }else{
            System.out.println("Usuário inválido!");
        }
    }
}