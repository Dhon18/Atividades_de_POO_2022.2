package implementaçãodecodigo;
public class Marcar_consulta {
    String data_consulta, profissional, data_retorno, nome_pasciente;

    public Marcar_consulta() {
    }

    public Marcar_consulta(String data_consulta, String profissional, String data_retorno, String nome_pasciente) {
        this.data_consulta = data_consulta;
        this.profissional = profissional;
        this.data_retorno = data_retorno;
        this.nome_pasciente = nome_pasciente;
    }

    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(String data_retorno) {
        this.data_retorno = data_retorno;
    }

    public String getNome_pasciente() {
        return nome_pasciente;
    }

    public void setNome_pasciente(String nome_pasciente) {
        this.nome_pasciente = nome_pasciente;
    }

    
    
    
    
}