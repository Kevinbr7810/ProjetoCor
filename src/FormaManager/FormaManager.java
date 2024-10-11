package FormaManager;

import java.util.ArrayList;
import java.util.List;
import CorFactory.CorFactory;
import Forma.Forma;
import Cor.Cor;
public class FormaManager {

    private final List<Forma> formas;

    private final CorFactory corFactory;


    public FormaManager() {
        this.formas = new ArrayList<>();
        this.corFactory = new CorFactory();
    }


    public void addForma(String nomeCor, String posicao, int tamanho) {

        Cor cor = corFactory.getCor(nomeCor);

        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }


    public void apresentar() {

        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}

