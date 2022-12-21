package implementaçãodecodigo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class ImplementaçãoDeCodigo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Marcar_consulta> MC = new ArrayList();
        int menu_medico=0, i, num=0;
        String nompas;
        do{
            System.out.println("1 - Você deseja Marcar consulta:");
            System.out.println("2 - Você deseja Marcar Data de Retorno:");
            System.out.println("3 - Sair do Sistema:");
            num = leia.nextInt();
            leia.nextLine();
            
            switch(num){
                case 1:{
                Marcar_consulta marcar = new Marcar_consulta();
                System.out.println("=====MARCAR CONSULTA=====");
                System.out.println("\n");
                
                System.out.println("Nome do Pasciente: ");
                String nome_do_pasciente = leia.nextLine();
                
                System.out.println("Data da Consulta: ");
                String data_de_consulta = leia.nextLine();
                
                System.out.println("Especialista: ");
                String especialista = leia.nextLine();
                
                System.out.println("Data de Retorno: ");
                String data_retornar = leia.nextLine();
                
                
                marcar.setNome_pasciente(nome_do_pasciente);
                marcar.setData_consulta(data_de_consulta);
                marcar.setProfissional(especialista);
                marcar.setData_retorno(data_retornar);
                MC.add(marcar);
                
                //System.out.println("Deseja outra operação? 1 - SIM 2 - Não: ");
                //menu_medico = leia.nextInt();
                leia.nextLine();
                break;
                }
                
            
//*******************************************************************************************
//*******************************************************************************************
                case 2:{
                System.out.println("\n \n \n");
                System.out.println("====PESQUISAR PASCIENTE POR POSIÇÃO====");
                System.out.println("\n \n \n");
                for( i = 0 ; i < MC.size() ; i++){
                    Marcar_consulta editarmarcapasc = MC.get(i);
                    System.out.println("["+i+"]" + editarmarcapasc.getNome_pasciente());
                }
                try{
                System.out.println("\n \n \n");
                System.out.println("QUAL POSIÇÃO SE ENCONTRA O NOME DO PASCIENTE?");
                nompas = leia.nextLine();
                leia.nextLine();
                System.out.println("\n \n \n");
                }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("DIGITE UM VALOR INTEIRO DAS POSIÇÕES ACIMA");
                }catch(ArrayIndexOutOfBoundsException e){ //Informa que estourou o limite do vetor
                    
                    
                    
                System.out.println("====VOCÊ ESTOUROU O LIMITE MAXIMO DO VETOR====");
                leia = new Scanner(System.in);
                int b=1;
                }
                }
                
                
                
                
        }      
        System.out.println("Deseja outra operação? 1 - SIM 2 - Não: ");
        menu_medico = leia.nextInt();
        //leia.nextLine();
                
        }while(menu_medico != 0);
        System.out.println("====SISTEMA FINALIZADO====");
        
        
        
        
        
    }    
}