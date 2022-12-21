package universidades.entidades;
public abstract class Estudante {
    private String nomeAluno, curso;
    private int semestre;

    public Estudante() {
    }

    public Estudante(String nomeAluno, String curso, int semestre) {
        this.nomeAluno = nomeAluno;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
      
}