package universidades.entidades;

import universidades.serviços.Pagamento;

public class Pagante extends Estudante implements Pagamento{
    private double valor, media;

    public Pagante() {
    }

    public Pagante(double valor, double media) {
        this.valor = valor;
        this.media = media;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    //@Override
    //public mensalidade(){
        
    //}

    @Override
    public double mensalidade() {
      return valor;  
    }
    
    
    
}