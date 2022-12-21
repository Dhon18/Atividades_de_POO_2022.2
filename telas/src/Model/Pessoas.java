package Model;
import java.util.Date;
public class Pessoas {
    private String pes_id;
    private String pes_nome;
    private String pes_rs;
    private String pes_cpf;
    private String pes_obs;
    private String pes_tel;
    private Date pes_dtcadastro;

    public Pessoas() {
    }

    public Pessoas(String pes_id, String pes_nome, String pes_rs, String pes_cpf, String pes_obs, String pes_tel, Date pes_dtcadastro) {
        this.pes_id = pes_id;
        this.pes_nome = pes_nome;
        this.pes_rs = pes_rs;
        this.pes_cpf = pes_cpf;
        this.pes_obs = pes_obs;
        this.pes_tel = pes_tel;
        this.pes_dtcadastro = pes_dtcadastro;
    }

    public String getPes_id() {
        return pes_id;
    }

    public void setPes_id(String pes_id) {
        this.pes_id = pes_id;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public String getPes_rs() {
        return pes_rs;
    }

    public void setPes_rs(String pes_rs) {
        this.pes_rs = pes_rs;
    }

    public String getPes_cpf() {
        return pes_cpf;
    }

    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public String getPes_obs() {
        return pes_obs;
    }

    public void setPes_obs(String pes_obs) {
        this.pes_obs = pes_obs;
    }

    public String getPes_tel() {
        return pes_tel;
    }

    public void setPes_tel(String pes_tel) {
        this.pes_tel = pes_tel;
    }

    public Date getPes_dtcadastro() {
        return pes_dtcadastro;
    }

    public void setPes_dtcadastro(Date pes_dtcadastro) {
        this.pes_dtcadastro = pes_dtcadastro;
    }
    
    
    
    
    
}