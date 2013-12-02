/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Component;
import java.awt.event.ActionListener;

/**
 *
 * @author Ana Gomes
 */
public class Startup extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Startup
     * @param parent
     */
    public Startup(Component parent) {
        initComponents();
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amazonas");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(449, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled-2.png"))); // NOI18N
        getContentPane().add(title);
        title.setBounds(130, 20, 200, 78);

        play.setText("Jogar");
        play.addActionListener(this);
        getContentPane().add(play);
        play.setBounds(130, 130, 200, 30);

        exit.setText("Sair");
        exit.addActionListener(this);
        getContentPane().add(exit);
        exit.setBounds(130, 190, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_start.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 449, 300);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == play) {
            Startup.this.playActionPerformed(evt);
        }
        else if (evt.getSource() == exit) {
            Startup.this.exitActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        Game.gameBoardWindow = new BoardFrame(exit);
        Game.gameBoardWindow.setLocationRelativeTo(this);
        Game.gameBoardWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton play;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
