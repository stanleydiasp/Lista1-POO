package Ex7;

public class Elevador {

    private int andarAtual;
    private int totalDeAndares;
    private int capacidade;
    private int pessoasPresentes;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void inicializa(int totalDeAndares, int capacidade) {
        setAndarAtual(0);
        setTotalDeAndares(totalDeAndares);
        setCapacidade(capacidade);
        setPessoasPresentes(0);
    }

    public void entra() {
        if (getPessoasPresentes() < getCapacidade()) {
            setPessoasPresentes(getPessoasPresentes() + 1);
            System.out.println("Uma pessoa entrou");
            System.out.println("Quantidade de pessoas no elevador: " + getPessoasPresentes());
        } 
        else {
            System.out.println("O elevador está cheio. Não é possível entrar");
        }
    }

    public void sai() {
        if (getPessoasPresentes() > 0) {
            setPessoasPresentes(getPessoasPresentes() - 1);
            System.out.println("Uma pessoa saiu do elevador");
            System.out.println("Quantidade de pessoas no elevador: " + getPessoasPresentes());
        } 
        else if (getPessoasPresentes() == 0) {
            System.out.println("O elevador está vazio");
        }
    }

    public void sobe() {
        if (getAndarAtual() < getTotalDeAndares()) {
            setAndarAtual(getAndarAtual() + 1);
            System.out.println("Você subiu para o andar: " + getAndarAtual());
        } 
        else {
            System.out.println("Você já está no último andar");
        }
    }

    public void desce() {
        if (getAndarAtual() > 0) {
            setAndarAtual(getAndarAtual() - 1);
            System.out.println("Você desceu para o andar: " + getAndarAtual());
        } 
        else {
            System.out.println("Você está no térreo");
        }
    }
}
