package testejavageral;
import java.util.ArrayList;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<CriarLoginsRecepcionista> usuario = new ArrayList();    
        
        boolean constante = true;   
        while(constante){
       
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("1 - Cadastrar Usuario: ");
        System.out.println("2 - Logar: ");
        System.out.println("***********************************");
        System.out.println("***********************************");
        String menu = leia.nextLine();
        

        System.out.println("\n \n \n");
        
        switch(menu){
            case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                   
                
                System.out.println("***********************************");
                System.out.println("***********************************");
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                System.out.println("Senha: ");
                String senha = leia.nextLine();               
                System.out.println("***********************************");
                System.out.println("***********************************");

                CriarLoginsRecepcionista funcionario = new CriarLoginsRecepcionista();
                funcionario.setNome(nome);
                funcionario.setSenha(senha);               
                usuario.add(funcionario);
                
                System.out.println("\n \n \n");
                break;
                
            }
                case "2":{
                
                System.out.println("\n \n \n");
                System.out.println("====LOGIN DE FUNCIONARIO==== \n");
                
                
                System.out.println("***********************************");
                System.out.println("***********************************");
                System.out.println("Digite o Nome completo: ");
                String nome = leia.nextLine();          
                System.out.println("Digite a Senha: ");
                String senha = leia.nextLine();
                System.out.println("***********************************");
                System.out.println("***********************************");

                
                
                for(int i = 0 ; i < usuario.size() ; i++){
                    CriarLoginsRecepcionista funcionaro = usuario.get(i);
                    
                   if(senha.equals(funcionaro.getSenha()) && nome.equals(funcionaro.getNome())){
                        System.out.println("Acesso Permitido!!");

                        
                       
                        System.out.println("1 - Cadastrar Funcionario: ");
                        System.out.println("2 - Listar Todos os Funcionario: ");
                        System.out.println("3 - Pesquisar Funcionario por CPF: ");
                        System.out.println("4 - Atualizar Dados do Funcionario: ");
                        System.out.println("5 - Remover Funcionario: ");
                        System.out.println("6 - Sair");
                        System.out.println("Digite o que Deseja ?: ");
        
                        String menup = leia.nextLine();
                        System.out.println("\n \n \n");
                       
                switch(menup){
                case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                
                System.out.println("Nome completo: ");
                String nome1 = leia.nextLine();
                
                System.out.println("Senha: ");
                String senha2 = leia.nextLine();
                
                
                CriarLoginsRecepcionista funcionario = new CriarLoginsRecepcionista();
                funcionario.setNome(nome1);
                funcionario.setSenha(senha2);
                usuario.add(funcionario);
                System.out.println("\n \n \n");
                break;
                
            }
                       }
                       
                       
                       
                       
                       
                       
                          //constante=false;                                             
                        }
                   else{
                       System.out.println("====SENHA INCORRETA====");
                        }
                    }
                break;
                }      
            }
        }
        
        
        
        
        
        
        
        
        
        
        /*
        System.out.println("1 - Cadastrar Funcionario: ");
        System.out.println("2 - Listar Todos os Funcionario: ");
        System.out.println("3 - Pesquisar Funcionario por CPF: ");
        System.out.println("4 - Atualizar Dados do Funcionario: ");
        System.out.println("5 - Remover Funcionario: ");
        System.out.println("6 - Sair");
        System.out.println("7 - Cadastrar Pascientes: ");
        System.out.println("8 - Listar Todos os Pascientes");
        System.out.println("9 - Pesquisar Pascientes por CPF: ");
        System.out.println("10 - Atualizar Dados do Pascientes: ");
        System.out.println("11 - Remover Pascientes: ");
        System.out.println("Digite o que Deseja ?: ");
        
        String menu = leia.nextLine();
        System.out.println("\n \n \n");
        */
        
        
        
        
        
        
        
    }
}