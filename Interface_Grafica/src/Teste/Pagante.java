package Teste;
public class Pagante extends Estudante implements Desconto{
    
  private double media, mensalidade;

    public Pagante() {
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }


    public Pagante(double media, double mensalidade, String nome, String nomecurso, String semestre) {
        super(nome, nomecurso, semestre);
        this.media = media;
        this.mensalidade = mensalidade;
    }
    public double Mensalidade(){
        if(media >= 10){
            return 0;
        }if((media < 10) && (media >= 8.0)){
            return mensalidade * 0.2;
        }if((media < 8.0)&&(media >= 7.0)){
            return mensalidade * 0.5;
        }
        return mensalidade;
    }

    @Override
    public String toString() {
        return "Pagante{" + "media=" + media + ", mensalidade=" + Mensalidade() + "nome do Estudante" + this.getNome() + '}';
    }
    
    
    
}