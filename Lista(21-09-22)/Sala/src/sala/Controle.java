package sala;
public class Controle {

    private Tv televisao;

    Controle(Tv tv){
        this.televisao = tv;
    }
    
    String Info(){
        return televisao.toString();
    }
    
    void setCanal(int c){
        televisao.setCanalAtual(c);
    }
    
    void setCanal(char cha){
        
        if(cha == 'c' || cha == 'C'){
            televisao.sobeCanal();
        }
        else if(cha == 'b' || cha == 'B'){
            televisao.desceCanal();
        }
        else{
            System.out.println("Operação descohecida ou não suportada");
        }
    }
    
    void setVolune(char cha){
        
        if(cha == 's' || cha == 'S'){
            televisao.aumentaVolume();
        }
        else if(cha == 'd' || cha == 'D'){
            televisao.abaixaVolume();
        }
        else{
            System.out.println("Operação descohecida ou não suportada");
        }
    }
    void setVolume(int v){
        televisao.setVolume(v);
    }
    
}
