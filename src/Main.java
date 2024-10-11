import FormaManager.FormaManager;


public class Main {
    public static void main(String[] args) {
      
        FormaManager formaManager = new FormaManager();

        
        formaManager.addForma("Vermelho", "10,10", 5);
        formaManager.addForma("Verde", "20,20", 10);
        formaManager.addForma("Azul", "15,15", 7);
        formaManager.addForma("Vermelho", "30,30", 8); 
        formaManager.addForma("Verde", "25,25", 12);   

      
        formaManager.apresentar();
    }
}
