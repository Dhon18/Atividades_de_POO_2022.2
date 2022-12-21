package Teste;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        ArrayList<Estudante> armazenar = new ArrayList();
        
        
        
        
        System.out.println("Quantos alunos você deseja cadastrar: ");
        int quant  = leia.nextInt();
        
        for(int i = 0 ; i < quant ; i++){
        leia = new Scanner(System.in);
            
        System.out.println("Digite seu Nome: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite o nome do Cursos: ");
        String nomecurso = leia.nextLine();
        
        System.out.println("Digite o Semestre a ser cursado: ");
        String semestre = leia.nextLine();
        
            System.out.println("Este estudante é 1 - bolsista ou 2 - pagante?: ");
            int resposta = leia.nextInt();
            
            if(resposta == 1){
                Bolsista estudante = new Bolsista(nome, nomecurso, semestre);
                armazenar.add(estudante);
            }else{
                
                System.out.println("Qual a sua média?: ");
                double notapague = leia.nextDouble();
                
                System.out.println("Qual a mensalidade?: ");
                double mensalidade = leia.nextDouble();
                Pagante pagante = new Pagante(notapague, mensalidade, nome, nomecurso, semestre);
                armazenar.add(pagante);
            }
                
        }
        System.out.println(armazenar);
    }   
}