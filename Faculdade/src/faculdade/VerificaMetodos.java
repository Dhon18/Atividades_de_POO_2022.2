package faculdade;
public class VerificaMetodos {
    private String NomeEstudante;
    private String NomeDoCursos;
    private int SemestreCursado, media;
    private int p;
    

    public VerificaMetodos() {
        
    }

    public VerificaMetodos(String NomeEstudante, String NomeDoCursos, int SemestreCursado, int media, int p) {
        this.NomeEstudante = NomeEstudante;
        this.NomeDoCursos = NomeDoCursos;
        this.SemestreCursado = SemestreCursado;
        this.media = media;
        this.p = p;
    }

    public String getNomeEstudante() {
        return NomeEstudante;
    }

    public void setNomeEstudante(String NomeEstudante) {
        this.NomeEstudante = NomeEstudante;
    }

    public String getNomeDoCursos() {
        return NomeDoCursos;
    }

    public void setNomeDoCursos(String NomeDoCursos) {
        this.NomeDoCursos = NomeDoCursos;
    }

    public int getSemestreCursado() {
        return SemestreCursado;
    }

    public void setSemestreCursado(int SemestreCursado) {
        this.SemestreCursado = SemestreCursado;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
    
    
}