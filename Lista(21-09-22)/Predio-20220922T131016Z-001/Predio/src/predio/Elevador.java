package predio;
public class Elevador {

    private int andarAtual,totalAndares,capacidade,quantPessoasEntram;
    
    Elevador(){
        this.andarAtual = 0;
        this.capacidade = 0;
    }
    Elevador(int capacidade){
        this.capacidade = capacidade;
    }
    
    int getAndarAtual(){
        return this.andarAtual;
    }
    int getTotalAndares(){
        return this.totalAndares;
    }
    int getCapacidade(){
        return this.capacidade;
    }
    int getQuantPessoasEntram(){
        return this.quantPessoasEntram;
    }
    
    void setAndarAtual(int q){
        this.andarAtual = q;
    }
    void setTotalAndares(int q){
        this.totalAndares = q;
    }
    void setCapacidade(int q){
        this.capacidade = q;
    }
    void setQuantPessoasEntram(int q){
        this.quantPessoasEntram = q;
    }
    public String toString(){
        return "Andar atual: "+this.andarAtual+"\nTotal de Andares: "+this.totalAndares+"\nCapacidade do elevador: "+this.capacidade+"\nQuantidade de pessoas no elevador: "+this.quantPessoasEntram;
    }
    
    void acrescenta(int q){
        if(q > this.capacidade || q > (this.capacidade - this.quantPessoasEntram)){
            System.out.println("Capacidade maxíma atingida");
        }
        else{
            this.quantPessoasEntram += q;
        }
    }
    void sai(int q){
        if(q > 0 && q <= this.quantPessoasEntram){
            this.quantPessoasEntram -= q;
        }
        else{
            System.out.println("Impossivel fazer a operação");
        }
    }
    void sobe(){
        if(this.andarAtual == this.totalAndares){
            System.out.println("Andar maxímo atingido");
        }
        else{
            this.andarAtual += 1;
        }
    }
    void desce(){
        if(this.andarAtual == 0){
            System.out.println("Impossivel descer");
        }
        else{
            this.andarAtual -= 1;
        }
    }
    
}
