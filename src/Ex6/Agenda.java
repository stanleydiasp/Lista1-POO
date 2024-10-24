package Ex6;

public class Agenda {

    private Pessoa[] pessoa = new Pessoa[10];
    private int contadorPessoas = 0;

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (contadorPessoas < 10) {
            pessoa[contadorPessoas] = new Pessoa(nome, idade, altura);
            contadorPessoas++;
        } else {
            System.out.println("Não é possível realizar esta ação. A agenda já está cheia!");
        }
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (pessoa[i].getNome().equals(nome)) {
                for (int j = i; j < contadorPessoas - 1; j++) {
                    pessoa[j] = pessoa[j + 1];
                }
                pessoa[contadorPessoas - 1] = null;
                contadorPessoas--;
                break;
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < contadorPessoas; i++) {
            if (pessoa[i].getNome().equals(nome)) {
                return i;
            }
        }
        System.out.println("Essa pessoa não está na agenda!");
        return -1;
    }

    public void imprimePessoaDaAgenda(int index) {
        if (index >= 0 && index < contadorPessoas) {
            if (pessoa[index] != null) {
                pessoa[index].imprimePessoa();
            }
            else {
                System.out.println("Nenhuma pessoa encontrada nessa posição.");
            }
        }
        else {
            System.out.println("Erro! O índice deve ser entre 0 e " + (contadorPessoas - 1));
        }
    }

    public void imprimeAgenda() {
        if (contadorPessoas == 0) {
            System.out.println("Agenda vazia.");
        }
        else {
            for (int i = 0; i < contadorPessoas; i++) {
                pessoa[i].imprimePessoa();
                System.out.println("-----------------------------------------");

            }
        }
    }
}
