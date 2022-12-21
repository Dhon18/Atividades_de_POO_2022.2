package alunopoo;
public class Produtos {
 private String produtos;
 private float preco;

    public Produtos(String produtos) {
        this.produtos = produtos;
    }

    Produtos() {
        
        }    
    

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Produtos{" + "produtos=" + produtos + '}';
    }
    
    
    
    
    
}