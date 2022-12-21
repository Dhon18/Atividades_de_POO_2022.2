/*

 */
package projetovendasdecarro;
import java.util.Scanner;
public class ProjetoVendasdeCarro {
    public static void main(String[] args) {
       Scanner leia  = new Scanner(System.in);  
       int opcao=0, cal=0;
       float op5, op4;
       String op1=null, op2=null, op3=null;
       
        
       
       
       
   
          switch(opcao()){
              case 1:
                System.out.println("Informe o Carro");
                op1 = leia.next();
                System.out.println("Informe a Placa");
                op2 = leia.next();
                System.out.println("Informe o Modelo do Carro");
                op3 = leia.next();
                System.out.println("Informe o Custo do Carro");
                op4 = leia.nextInt();
                System.out.println("Informe o Valor do Carro");
                op5 = leia.nextInt();
                
                opcao();
              break;
              
              case 2:           
                   imprimirdados();              
              break;
              
              case 3:
                  calcular();
                  System.out.println("Resultado do Calculo: "+ cal);
              break;
              default:
                //opcao();
          }       
       }
    
    
    
    
    
    
    
       
                    //Nomeio  o nome public static int opcao() para poder chamar no switch como opção inicial
    public static int opcao(){
        Scanner leia  = new Scanner(System.in);
        int opcao;
        
//Pedindo para o usuario digitar uma função no menu
System.out.println("Digite uma opção \n 1- Dados do Veiculo \n 2- Imprimir dados \n 3- Calcular Lucro do Veiculo \n 4- Valor do Veiculo Financiado \n 5- Valor do Veiculo Avista");
opcao = leia.nextInt();
return opcao;
    }
    
    
    
    
    
    
    public static float calcular(){
        Scanner leia  = new Scanner(System.in);
       float cal, valor=0, custo=0;
       
       System.out.println("Digite o Valor do Veiculo: ");
       valor = leia.nextFloat();
       System.out.println("Digite o Custo do Carro: ");
       custo = leia.nextFloat();
       cal = valor - custo;   
       return 2;
    }
    
    
    
    
    
    public static int imprimirdados(){
        Scanner leia  = new Scanner(System.in);
        
          String op1 = null, op2 = null, op3 = null;
        float op5 = 0, op4 = 0;
        int op6;
        
        
        
        do{
            
            
                System.out.println("Informações do Carro: " + op1);
                System.out.println("Informações da Placa: " + op2);
                System.out.println("Informações do Modelo do Carro: " + op3);
                System.out.println("Informações do Custo do Carro: " + op4);
                System.out.println("Informações do Valor do Carro: " + op5 + "\n" + "\n");
                
                System.out.println("Digite 1 para voltar ao Menu Inicial:");
                op6=leia.nextInt();
                
                if(op6 == 1){
                    return opcao();
                }
                
        }while(op6 == 1);                
         return 3;

       
    }           
}