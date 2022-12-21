package faculdade;
import java.util.Scanner;
public class Faculdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int media;
        
        System.out.println("Qual a sua media?: ");
        media = leia.nextInt();
        
        System.out.println("Você é um aluno pagante?: 1 - Sim  2 - Não");
        int p = leia.nextInt();
        
        if(p == 1){
            if(media >= 10){
                System.out.println("Sua Mensalidade terá 100% de Desconto");
            }
            else if((media < 10)&&(media >= 8.0)){
                System.out.println("Sua mensalidade terá 80% de Desconto");
            }
            else if((media < 8)&&(media >= 7.0)){
                System.out.println("Sua mensalidade terá 50% de Desconto");
            }
            else if(media < 7.0){
                System.out.println("Você terá 0% de Desconto");
            }
        }else{
            System.out.println("Você Não Entra No Sistema de Descontos");
        }
        
        
    }
}