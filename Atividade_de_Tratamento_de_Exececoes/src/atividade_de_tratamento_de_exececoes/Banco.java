package atividade_de_tratamento_de_exececoes;
class Banco {
    private String nome;
    private int numero;
    private float saldo;

    public Banco() {
    }

    public Banco(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }  
    
}