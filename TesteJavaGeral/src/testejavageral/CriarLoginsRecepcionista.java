package testejavageral;
public class CriarLoginsRecepcionista {
    private String nome, senha, nome1, senha2;

    public CriarLoginsRecepcionista() {
    }

    public CriarLoginsRecepcionista(String nome, String senha, String nome1, String senha2) {
        this.nome = nome;
        this.senha = senha;
        this.nome1 = nome1;
        this.senha2 = senha2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    //Login getNome(String nome) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
    
    
}