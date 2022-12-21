package Teste;
public abstract class Estudante {
    private String nome, nomecurso, semestre;

    public Estudante() {
    }

    public Estudante(String nome, String nomecurso, String semestre) {
        this.nome = nome;
        this.nomecurso = nomecurso;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", nomecurso=" + nomecurso + ", semestre=" + semestre + '}';
    }
    
    
    
}
