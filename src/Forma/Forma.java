package Forma;
import Cor.Cor;
public class Forma {

    private final Cor cor;
    private final String posicao;
    private final int tamanho;

    public Forma(Cor cor, String posicao, int tamanho) {
        this.cor = cor;
        this.posicao = posicao;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Forma [Cor: " + cor.getNome() + ", Posição: " + posicao + ", Tamanho: " + tamanho + "]";
    }
}

