package gui;

/**
 * @author Ana Gomes, Rui Gonçalves, André Freitas
 */
public class Game {

    public static Board gameBoardWindow;
    public static Startup gameStartupWindow;
    
    public static void main(String[] args) {
        gameStartupWindow = new Startup(null);
    }
    
}
