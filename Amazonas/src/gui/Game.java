package gui;

import model.*;
import java.awt.Graphics;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.vdmtools.VDM.CGException;
import jp.vdmtools.VDM.VDMRunTimeException;

/**
 * @author Ana Gomes, Rui Gonçalves, André Freitas
 */
public class Game {

    public static BoardFrame gameBoardWindow;
    public static Startup gameStartupWindow;
    public static boolean debug = true;
    public static Board board;
    public static Piece selectedPiece;
    public static Piece lastMovedPiece;
    public static boolean arrowShot = true;

    public static void main(String[] args) {
        gameStartupWindow = new Startup(null);
        try {
        board = new Board();
        } catch (CGException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public static void drawPieces(Graphics g) {
        try {
            //Aqui é aonde vao ser desenhadas as peças
        Map m = board.getPositions();
        Piece p;
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                p = (Piece) m.get(new Piece.Position(x, y));
                if (p != null && x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                    int panelX = (40 * x) + 20;
                    int panelY = (40 * (9 - y));
                    drawPiece(p, g, panelX, panelY);
                    if (p.equals(selectedPiece)) {
                        BoardPanel.drawAura(g, panelX, panelY);
                    }
                }

            }

        }
        } catch (CGException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void drawPiece(Piece p, Graphics g, int panelX, int panelY) throws CGException {
        //diferenciar tipo de peça
        if (p instanceof Amazon) {
            String color = ((Amazon) p).GetColor().toString();
            switch (color) {
                case "<White>":
                    BoardPanel.drawWhitePiece(g, panelX, panelY);
                    break;
                case "<Black>":
                    BoardPanel.drawBlackPiece(g, panelX, panelY);
                    break;
            }
        }
        if (p instanceof Arrow) {
            BoardPanel.drawArrowPiece(g, panelX, panelY);
        }
    }
    
    public static void startGame() {
        try {
        board = new Board();
        } catch (CGException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public static void gameOver() {

    }

    public static void mouseClickedAt(int board_x, int board_y) {
        try {
        Map m = board.getPositions();
        Piece p = (Piece) m.get(new Piece.Position(board_x, board_y));
        selectionStateMachine(p, board_x, board_y);
        gameBoardWindow.repaint();
        } catch (CGException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private static void selectionStateMachine(Piece p, int board_x, int board_y) throws CGException {
        if (selectedPiece != null) {
            if (p == null) { //Se tivermos uma peca selecionada e clicarmos um espaco livre
                Object ret;
                if (arrowShot) {
                    try {
                    ret = board.move(selectedPiece.GetX(), selectedPiece.GetY(), board_x, board_y);
                    System.out.println("Moved... next turn: " + ret);
                    arrowShot = false;
                        
                    } catch (VDMRunTimeException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    try {
                    boolean shot = board.setArrow(selectedPiece.GetX(), selectedPiece.GetY(), board_x, board_y);
                    if (shot) {
                        System.out.println("Shot Arrow...");
                        arrowShot = true;
                    }
                    } catch (VDMRunTimeException ex) {
                        System.out.println(ex.getMessage());
                }
                }
            } else {                
                selectPiece(p);
            }
        } else if (p != null) {
            selectPiece(p);
        }
    }

    private static void selectPiece(Piece p) {        
        if (p instanceof Amazon) {
            selectedPiece = p;
        }
    }
}
