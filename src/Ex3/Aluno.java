package Ex3;

public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    private double nota1;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    private double nota2;

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private double notaTrabalho;

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double calculaMedia() {

        return (nota1 + nota2 + notaTrabalho) / 3;

    }

    public double calculaNotaExameFinal() {
        double media = calculaMedia();

        if (media >= 6.0) {
            return 0;
        }

        return (5 * 2) - media;

    }


}
