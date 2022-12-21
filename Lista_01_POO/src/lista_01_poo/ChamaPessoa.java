package lista_01_poo;
public class ChamaPessoa {
    private String nome;
    private int datanas, cal;
    private float altura;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatanas() {
        return datanas;
    }

    public void setDatanas(int datanas) {
        this.datanas = datanas;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void calcularidade(){
        cal =  2022 - datanas;
    }
    
    public void chamaresul(){
        System.out.println("\n\nIdade: " + cal);
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
    }   
}