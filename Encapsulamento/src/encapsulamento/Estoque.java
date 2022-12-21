package encapsulamento;
public class Estoque {
 private String nome;
    private double preco , valTotal;
    private int quantidade;
    
    public Estoque(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    
    }
      public Estoque(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
       
    
    }
      Estoque(){
          
      }
      public void setNome(String nome){
          this.nome=nome;
      }
      public String getNome(){
          return nome;
      }
      public void setPreco(double preco){
          this.preco = preco;
      }
      public void setQuantidade(double quantidade){
          this.preco = preco;
      }
      public void getQuantidade(double quantidade){
          this.preco = preco;
      }
      
    public double getPreco(){
        return preco;
    }
    public void setValTotal(double valTotal ){
        this.valTotal = valTotal;
        
    }
    public double getValTotal(){
        return valTotal;
    }
    public double setQuantidade(){
        return quantidade;
    }
    public double getQuantidade(){
        return quantidade;
    }
    public double totalVendasEstoque(){
     return preco * quantidade;
    }
    
    
    public void addProduto(int quantidade){
        this.quantidade += quantidade;
   
    }
    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;

    }
    @Override
    public String toString(){
     return nome + " , R$ " + preco + ", quantidade " + quantidade + " unidade , total: " + totalVendasEstoque();
    }   
}
