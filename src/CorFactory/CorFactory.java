package CorFactory;

import Cor.Cor;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    // Mapa que armazena as cores criadas para reutilização
    private final Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String nome) {

        Cor cor = cores.get(nome);

        if (cor == null) {
            cor = new Cor(nome);
            cores.put(nome, cor);
        }
        return cor;
    }
}
