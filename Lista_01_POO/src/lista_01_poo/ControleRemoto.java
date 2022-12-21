package lista_01_poo;
public class ControleRemoto {
    private int aum = 0, dim = 0, mudaum, muddim, volume = 0;
    
    public void aumnetar(){
        
        
       if(volume<=10){
           volume = volume + aum;
           System.out.println("volume:"+volume);
       }
    }
    public void diminuir(){
        volume = volume - dim;
        if(volume<=10){
           System.out.println("volume:"+volume);
       }
       
    }
    
    private int mudaum(){
        aum += 1;
        return 0;
    }
    
    private int muddim(){
        aum -= 1;
        return 0;
    }

    public int getAum() {
        return aum;
    }

    public void setAum(int aum) {
        this.aum = aum;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getMudaum() {
        return mudaum;
    }

    public void setMudaum(int mudaum) {
        this.mudaum = mudaum;
    }

    public int getMuddim() {
        return muddim;
    }

    public void setMuddim(int muddim) {
        this.muddim = muddim;
    }
    
    
    
    
}