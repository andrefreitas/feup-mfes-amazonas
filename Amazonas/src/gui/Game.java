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
    public static Piece selectedPiece = null;
    public static Piece movedPiece = null;

    //----------------------------------------------
    //----------------PRIVATE STUFF-----------------
    //----------------------------------------------    
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

    private static void startGame() throws CGException {
        gameStartupWindow = new Startup(null);
        board = new Board();
    }

    private static void gameOver() throws CGException {
        String winner = board.getTurn().toString();
        System.out.println("O jogador " + winner + " ganhou o jogo!");
    }

    private static void selectionStateMachine(Piece p, int board_x, int board_y) throws CGException {
        if (selectedPiece != null) {
            if (p != null) {
                if (!p.equals(selectedPiece)) {
                    selectPiece(p);
                }
            } else if (movedPiece == null) {
                try {
                    if (board.move(selectedPiece.GetX(), selectedPiece.GetY(), board_x, board_y)) {
                        movedPiece = selectedPiece;
                    }
                } catch (VDMRunTimeException ex) {
                    if (debug) {
                        System.out.println("Movimento Invalido! - " + ex.getMessage());
                    }
                    movedPiece = null;
                } finally {
                    gameBoardWindow.repaint();
                }
            } else if (movedPiece != null) {
                try {
                    if (board.setArrow(movedPiece.GetX(), movedPiece.GetY(), board_x, board_y)) {
                        movedPiece = null;
                        changeTurn();
                    }
                } catch (VDMRunTimeException ex) {
                    if (debug) {
                        System.out.println("Disparo Invalido! - " + ex.getMessage());
                    }
                } finally {
                    gameBoardWindow.repaint();
                }
            }
        } else {
            selectPiece(p);
            gameBoardWindow.repaint();
        }

    }

    private static void selectPiece(Piece p) throws CGException {
        if ((p instanceof Amazon) && checkPieceColorToTurn(p)) {
            selectedPiece = p;
        }
    }

    private static boolean checkPieceColorToTurn(Piece p) throws CGException {
        return ((Amazon) p).GetColor().toString().equals(board.getTurn().toString());
    }

    private static void changeTurn() throws CGException {
        if (board.gameOver()) {
            gameOver();
        } else {
            movedPiece = null;
            selectedPiece = null;
        }

    }

    //----------------------------------------------
    //---------------PUBLIC STUFF-------------------
    //----------------------------------------------
    public static void main(String[] args) {

        try {
            startGame();
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

}
