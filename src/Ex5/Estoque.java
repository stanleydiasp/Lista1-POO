package Ex5;

import org.w3c.dom.ls.LSOutput;

public class Estoque {

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {

    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int qtdAtual;

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    private int qtdMinima;

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd) {
        this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        this.qtdAtual -= qtd;

    }

    public String mostra() {
        return "Nome: " + nome + "\n Quantidade mínima: " + qtdMinima + "\n Quantidade Atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima)
            return true;
        else
            return false;
    }


}
