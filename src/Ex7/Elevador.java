package Ex7;

public class Elevador {


    private int andarAtual;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    private int totalDeAndares;

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    private int capacidade;

    public int getCapacidadeDoElevador() {
        return capacidade;
    }

    public void setCapacidade(int capacidadeDoElevador) {
        this.capacidade = capacidadeDoElevador;
    }

    private int pessoasPresentes;

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void inicializa(int totalDeAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou");
            System.out.println("Quantidade de pessoas no elevador: " + pessoasPresentes);
        }
        else
            System.out.println("O elevador está cheio. Não é possível entrar");

    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador");
            System.out.println("Quantidade de pessoas no elevador: " + pessoasPresentes);
        }
        else if (pessoasPresentes == 0)
            System.out.println("O elevador está vazio");

    }

    public void sobe() {
        if(andarAtual < totalDeAndares) {
            andarAtual++;
            System.out.println("Você subiu para o andar: " + andarAtual);
        }
        else
            System.out.println("Você já está no último andar");

    }

    public void desce() {
        if(andarAtual < totalDeAndares) {
            andarAtual--;
            System.out.println("Você desceu de andar: " + andarAtual);
        }
        else if (andarAtual == 0)
            System.out.println("Você está no térreo");

    }


}
