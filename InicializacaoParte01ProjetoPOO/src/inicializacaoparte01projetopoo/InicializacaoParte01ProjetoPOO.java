package inicializacaoparte01projetopoo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InicializacaoParte01ProjetoPOO {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    ArrayList<Funcionarios> usuario = new ArrayList();
    ArrayList<Pasciente> usuariopasciente = new ArrayList();
int id=0;
   boolean repitamenu = true;   
   while(repitamenu){
      // try{
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
       
        
        switch(menu){
            case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("Senha: ");
                String senha = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                Funcionarios funcionario = new Funcionarios();
                funcionario.setNome(nome);
                funcionario.setEmail(email);
                funcionario.setSenha(senha);
                funcionario.setCpf(cpf);
                usuario.add(funcionario);
                System.out.println("\n \n \n");
                break;
                
            }
            case "2":{
                System.out.println("\n \n \n");
                System.out.println("====LISTA DE FUNCIONARIOS CADASTRADOS NO SUS====");
                for(int i = 0 ; i < usuario.size(); i++){
                    //Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("\n \n \n");
                    System.out.println("******************************************************");
                    System.out.println("Funcionario"+"["+i+"]"+"O Email do Funcionario " + i + " é:" + usuario.get(i).getEmail());
                    System.out.println("O CPF do Funcionario " + i + " é:" + usuario.get(i).getCpf());
                    System.out.println("O nome do Funcionario " + i + " é:" + usuario.get (i).getNome());
                    System.out.println("A Senha do Funcionario " + i + " é:" + usuario.get(i).getSenha());
                    System.out.println("******************************************************");
                    System.out.println("\n \n \n");
                }
                
                break;
            }
            case "3":{
                System.out.println("===PROCURAR FUNCIONARIO POR CPF====");
                System.out.println("Digite o CPF: ");
                String cpf = leia.nextLine();
                for(int i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    if(cpf.equals(pegarinformacao.getCpf())){
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====FUNCIONARIO ENCONTRADO NO SISTEMA====");
                        System.out.println("Email: "+pegarinformacao.getEmail());
                        System.out.println("Senha: "+pegarinformacao.getSenha());
                        System.out.println("Nome: " +pegarinformacao.getNome());
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                        break;
                    }else{
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====FUNCIONARIO NÃO ENCONTRADO NO SISTEMA====");
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                    }
                }
                break;
            }
            case "4":{
                System.out.println("\n \n \n");
                System.out.println("===ATUALIZAR DADOS DO FUNCIONARIO====");
                System.out.println("\n \n \n");
                
                for(int i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("["+i+"]" + pegarinformacao.getEmail());
                }
                try{
                System.out.println("\n \n \n");
                System.out.println("QUAL NUMERO DO FUNCIONARIO VOCÊ DESEJA ATUALIZAR OS DADOS?");
                id = leia.nextInt();
                leia.nextLine();
                System.out.println("\n \n \n");
                }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("DIGITE UM VALOR INTEIRO DAS POSIÇÕES ACIMA");
                }
                System.out.print("Digite um novo email de alteração: ");
                String atualizacaoemail = leia.nextLine();
                
                System.out.print("Digite uma nova senha de alteração: ");
                String atualizacaosenha = leia.nextLine();
                
                System.out.println("Digite un bovo nome de alteração: ");
                String atualizacaonome = leia.nextLine();
                
                Funcionarios funcionario = usuario.get(id);
                funcionario.setEmail(atualizacaoemail);
                funcionario.setSenha(atualizacaosenha);
                funcionario.setNome(atualizacaonome);
                System.out.println("\n \n \n");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("====FUNCIONARIO ATUALIZADO COM SUCESSO====");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("\n \n \n");
                break;
            }
            case "5":{
                System.out.println("\n \n \n");
                System.out.println("====REMOVER UM FUNCIONARIO====");
                
                for(int i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("["+i+"]" + pegarinformacao.getEmail());
                }
                
                System.out.println("QUAL NUMERO DE FUNCIONARIO VOCÊ DESEJA ATUALIZAR?");
                id = leia.nextInt();
                
                usuario.remove(id);
                
                
                break;
            }
            case "6":{
                repitamenu = false;
                break;
                }
            case "7":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE PASCIENTE====");
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("Senha: ");
                String senha = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                Pasciente pasciente = new Pasciente();
                pasciente.setNome(nome);
                pasciente.setEmail(email);
                pasciente.setSenha(senha);
                pasciente.setCpf(cpf);
                usuariopasciente.add(pasciente);
                System.out.println("\n \n \n");
                break;
            }
            case "8":{
                System.out.println("\n \n \n");
                System.out.println("====LISTA DE PASCIENTES CADASTRADOS NO SUS====");
                for(int i = 0 ; i < usuariopasciente.size(); i++){
                    //Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("\n \n \n");
                    System.out.println("******************************************************");
                    System.out.println("Funcionario"+"["+i+"]"+"O Email do Funcionario " + i + " é:" + usuariopasciente.get(i).getEmail());
                    System.out.println("O CPF do Funcionario " + i + " é:" + usuariopasciente.get(i).getCpf());
                    System.out.println("O nome do Funcionario " + i + " é:" + usuariopasciente.get (i).getNome());
                    System.out.println("A Senha do Funcionario " + i + " é:" + usuariopasciente.get(i).getSenha());
                    System.out.println("******************************************************");
                    System.out.println("\n \n \n");
                }
                
                break;
            }
            case "9":{
                System.out.println("===PROCURAR PASCIENTES POR CPF====");
                System.out.println("Digite o CPF: ");
                String cpf = leia.nextLine();
                for(int i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente = usuariopasciente.get(i);
                    if(cpf.equals(pegarinformacaopasciente.getCpf())){
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====PASCIENTES ENCONTRADO NO SISTEMA====");
                        System.out.println("Email: "+pegarinformacaopasciente.getEmail());
                        System.out.println("Senha: "+pegarinformacaopasciente.getSenha());
                        System.out.println("Nome: " +pegarinformacaopasciente.getNome());
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                        break;
                    }else{
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====PASCIENTES NÃO ENCONTRADO NO SISTEMA====");
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                    }
                }
                break;
            }
            case "10":{
                System.out.println("\n \n \n");
                System.out.println("===ATUALIZAR DADOS DO PASCIENTES====");
                System.out.println("\n \n \n");
                
                for(int i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente = usuariopasciente.get(i);
                    System.out.println("["+i+"]" + pegarinformacaopasciente.getEmail());
                }
                
                System.out.println("\n \n \n");
                System.out.println("QUAL NUMERO DO PASCIENTES VOCÊ DESEJA ATUALIZAR OS DADOS?");
                id = leia.nextInt();
                leia.nextLine();
                System.out.println("\n \n \n");
                
                System.out.print("Digite um novo email de alteração: ");
                String atualizacaoemailpasciente = leia.nextLine();
                
                System.out.print("Digite uma nova senha de alteração: ");
                String atualizacaosenhapasciente = leia.nextLine();
                
                System.out.println("Digite un novo nome de alteração: ");
                String atualizacaonomepasciente = leia.nextLine();
                
                Pasciente pegarinformacaopasciente2 = usuariopasciente.get(id);
                pegarinformacaopasciente2.setEmail(atualizacaoemailpasciente);
                pegarinformacaopasciente2.setSenha(atualizacaosenhapasciente);
                pegarinformacaopasciente2.setNome(atualizacaonomepasciente);
                System.out.println("\n \n \n");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("====PASCIENTES ATUALIZADO COM SUCESSO====");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("\n \n \n");
                break;
            }
            case "11":{
                System.out.println("\n \n \n");
                System.out.println("====REMOVER UM PASCIENTES====");
                for(int i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente2 = usuariopasciente.get(i);
                    System.out.println("["+i+"]" + pegarinformacaopasciente2.getEmail());
                }
                System.out.println("QUAL NUMERO DE PASCIENTES VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                usuariopasciente.remove(id);
                break;
            }
            }
        //}catch(InputMismatchException e){
          //  System.out.println("Erro de Entrada");
            //leia = new Scanner(System.in);
        //int a =1;
          //  }catch(ArrayIndexOutOfBoundsException e){ //Informa que estourou o limite do vetor
            //System.out.println("Você estourou o limite maximo do vetor");
            //leia = new Scanner(System.in);
        //int b=1;    
        //} 
    }
}
}