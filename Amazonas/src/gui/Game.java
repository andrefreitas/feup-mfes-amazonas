package gui;

import Model.*;
import java.awt.Graphics;

/**
 * @author Ana Gomes, Rui Gonçalves, André Freitas
 */
public class Game {

    public static BoardFrame gameBoardWindow;
    public static Startup gameStartupWindow;
    public static Board board;
    public static void main(String[] args) {
        gameStartupWindow = new Startup(null);
    }
    
    public static void drawPieces(Graphics g){
        //Aqui é aonde vao ser desenhadas as peças
        g.drawImage(BoardPanel.blackPiece, 20, 0, gameBoardWindow);
    }
    
}
