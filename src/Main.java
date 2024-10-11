import FormaManager.FormaManager;


public class Main {
    public static void main(String[] args) {
        // Cria uma instância do gerenciador de formas
        FormaManager formaManager = new FormaManager();

        // Adiciona várias formas com diferentes cores, posições e tamanhos
        formaManager.addForma("Vermelho", "10,10", 5);
        formaManager.addForma("Verde", "20,20", 10);
        formaManager.addForma("Azul", "15,15", 7);
        formaManager.addForma("Vermelho", "30,30", 8); // Reutiliza a cor "Vermelho"
        formaManager.addForma("Verde", "25,25", 12);   // Reutiliza a cor "Verde"

        // Exibe todas as formas e suas propriedades
        formaManager.apresentar();
    }
}
