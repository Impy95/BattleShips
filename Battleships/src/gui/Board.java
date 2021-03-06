/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import battleships.BattleField;
import battleships.Ships;
import battleships.database;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vaughn
 */
public class Board extends javax.swing.JFrame {

    Ships battleShip;
    private String playerName;
    /**
     * Creates new form Board
     */
    public Board() {
        setResizable(false);
        addBGImage();
        battleShip = new Ships();
        initComponents();
        createShipField();
    }
    
     public void addBGImage() {
        // elsewhere
        BufferedImage myImage;
        try {
            myImage = ImageIO.read(new File("src\\images\\oceanbgpic.jpg"));
            setContentPane(new ImagePanel(myImage));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
    class ImagePanel extends JComponent {

        private Image image;

        public ImagePanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelWinner = new javax.swing.JLabel();
        jbuttonMainMenu = new javax.swing.JButton();
        jbuttonNewGame = new javax.swing.JButton();
        jLabelP2Board = new javax.swing.JLabel();
        jLabelP1Board = new javax.swing.JLabel();
        jLabelTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(320, 320));
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 320));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 320));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(new java.awt.Dimension(320, 320));
        jPanel2.setMinimumSize(new java.awt.Dimension(320, 320));
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 320));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWinner.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jbuttonMainMenu.setText("Main Menu");
        jbuttonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonMainMenuActionPerformed(evt);
            }
        });

        jbuttonNewGame.setText("New Game");
        jbuttonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonNewGameActionPerformed(evt);
            }
        });

        jLabelP2Board.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelP2Board.setText("Player 2's Board");

        jLabelP1Board.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelP1Board.setText("Player 1's Board");

        jLabelTurn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurn.setText("It's Player 1's Turn!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuttonNewGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbuttonMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelP2Board)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelP1Board)
                .addGap(141, 141, 141))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(114, Short.MAX_VALUE)
                    .addComponent(jLabelTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelP2Board)
                    .addComponent(jLabelP1Board))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonMainMenu)
                    .addComponent(jbuttonNewGame))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(430, Short.MAX_VALUE)
                    .addComponent(jLabelTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(137, 137, 137)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonMainMenuActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbuttonMainMenuActionPerformed

    private void jbuttonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonNewGameActionPerformed
        battleShip.resetShips();
        for (int x=0;x<BattleField.getX();x++) {
            for (int y=0;y<BattleField.getY();y++) {
                player1buttons[x][y].setIcon(null);
                player2buttons[x][y].setIcon(null);
                player1buttons[x][y].setEnabled(true);
                player2buttons[x][y].setEnabled(true);
            }
        }
        jLabelTurn.setText("It's Player 1's Turn!");
        jLabelWinner.setText("");
    }//GEN-LAST:event_jbuttonNewGameActionPerformed

    private JButton[][] player1buttons = new JButton[BattleField.getX()][BattleField.getY()];
    private JButton[][] player2buttons = new JButton[BattleField.getX()][BattleField.getY()];
    
    private void createShipField() {
        for (int x=0;x<BattleField.getX();x++) {
            for (int y=0;y<BattleField.getY();y++){
            player1buttons[x][y] = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            player1buttons[x][y].setBackground(new java.awt.Color(31, 36, 38));
            player1buttons[x][y].setForeground(new java.awt.Color(4, 4, 145));
            player1buttons[x][y].setToolTipText("");
            player1buttons[x][y].setMaximumSize(new java.awt.Dimension(40, 40));
            player1buttons[x][y].setMinimumSize(new java.awt.Dimension(40, 40));
            player1buttons[x][y].setPreferredSize(new java.awt.Dimension(40,40));
            player1buttons[x][y].setMargin(new java.awt.Insets(2,2,2,2));
            player1buttons[x][y].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonActionPerformed(evt);
                }
            });
            jPanel1.add(player1buttons[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(x*40, y*40, -1, -1));
            
            player2buttons[x][y] = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            player2buttons[x][y].setBackground(new java.awt.Color(31, 36, 38));
            player2buttons[x][y].setForeground(new java.awt.Color(4, 4, 145));
            player2buttons[x][y].setToolTipText("");
            player2buttons[x][y].setMaximumSize(new java.awt.Dimension(40, 40));
            player2buttons[x][y].setMinimumSize(new java.awt.Dimension(40, 40));
            player2buttons[x][y].setPreferredSize(new java.awt.Dimension(40,40));
            player2buttons[x][y].setMargin(new java.awt.Insets(2,2,2,2));
            player2buttons[x][y].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonActionPerformed(evt);
                }
            });
            jPanel2.add(player2buttons[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(x*40, y*40, -1, -1));
            }
        }
    }
    
    private void jButtonActionPerformed(ActionEvent evt) {
        int[] position = getButtonClicked(evt);
        // check if the correct boards buttons was clicked
        if (position[0] > -1 && position[1] > -1) {    
            // check if the button hasn't been clicked before, reutrn and do nothing if so
            if (battleShip.isClicked(position[0],position[1])) {
                return;
            }
            // if the position is a hit, take health off the hit ship
            if (battleShip.getValueOfSpot(position[0],position[1]) > 0) {
                battleShip.shipHit(battleShip.getPlayer());
            }            
            // set the button to clicked
            battleShip.setClicked(position[0], position[1]);
            // increase the number of moves that player has taken
            battleShip.moveTaken(battleShip.getPlayer());
            drawPanels();
            // move to next player
            battleShip.nextPlayer();
        }
//        System.out.println(position[0] + " " + position[1]);        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelP1Board;
    private javax.swing.JLabel jLabelP2Board;
    private javax.swing.JLabel jLabelTurn;
    private javax.swing.JLabel jLabelWinner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbuttonMainMenu;
    private javax.swing.JButton jbuttonNewGame;
    // End of variables declaration//GEN-END:variables

    private int[] getButtonClicked(ActionEvent evt) {
        int[] tmp = new int[2];
        // initilaize tmp values to -1 for data validation
        tmp[0] = -1;
        tmp[1] = -1;
        
        switch(battleShip.getPlayer()) {
            case 1:
                for (int x=0;x<player1buttons.length;x++) {
                    for (int y=0;y<player1buttons[0].length;y++) {
                        // if the buttons is part of player1buttons, 
                        // set tmp values to that position
                        if(evt.getSource().equals(player1buttons[x][y])) {
                            tmp[0] = x;
                            tmp[1] = y;
                            break;
                        }
                    }
                    // break out of the for loop if the position has been inserted
                    if (tmp[0] > -1 && tmp[1] > -1) {
                        break;
                    }
                }
                break;
            case 2:
                // same process as player1buttons
                for (int x=0;x<player2buttons.length;x++) {
                    for (int y=0;y<player2buttons[0].length;y++) {
                        if(evt.getSource().equals(player2buttons[x][y])) {
                            tmp[0] = x;
                            tmp[1] = y;
                            break;
                        }
                    }
                    if (tmp[0] > -1 && tmp[1] > -1) {
                        break;
                    }
                }
                break;                
        }
        return tmp;
    }

    private void drawPanels() {
        switch(battleShip.getPlayer()) {
            case 1:
                for (int x=0;x<player1buttons.length;x++) {
                    for (int y=0;y<player1buttons[0].length;y++) {
                        // if button is clicked
                        // set icon to a hit ship, or the ocean
                        // depending on the value of the button
                        if (battleShip.isClicked(x, y)) {
                            if (battleShip.getValueOfSpot(x, y) != 0) {
                                player1buttons[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player1hit.png")));
                            } else {
                                player1buttons[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ocean.jpg")));
                            }                               
                        }
                    }
                }
                // if health of the player equals 0
                // say that player has won
                // disable all buttons
                if (battleShip.getHealth(battleShip.getPlayer()) == 0) {
                    jLabelWinner.setText("Player 1 Wins in " + battleShip.getPlayerMoves(battleShip.getPlayer()) + " moves!");
                    jLabelTurn.setText("");
                    for (int x=0;x<battleShip.getX();x++) {
                        for (int y=0;y<battleShip.getY();y++) {
                            player1buttons[x][y].setEnabled(false);
                            player2buttons[x][y].setEnabled(false);
                        }
                    }                  
                    playerName = JOptionPane.showInputDialog("Enter your name");
                    database dconn = new database(); 
                    dconn.insertNewScore(playerName, battleShip.getPlayerMoves(battleShip.getPlayer()));
                    return;
                }
                jLabelTurn.setText("It's Player 2's Turn!");
                break;
            case 2:
                for (int x=0;x<player2buttons.length;x++) {
                    for (int y=0;y<player2buttons[0].length;y++) {
                        if (battleShip.isClicked(x, y)) {
                            if (battleShip.getValueOfSpot(x, y) != 0) {
                                player2buttons[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player1hit.png")));
                            } else {
                                player2buttons[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ocean.jpg")));
                            }                               
                        }
                    }
                }
                if (battleShip.getHealth(battleShip.getPlayer()) == 0) {
                    jLabelWinner.setText("Player 2 Wins in " + battleShip.getPlayerMoves(battleShip.getPlayer()) + " moves!");
                    jLabelTurn.setText("");
                    for (int x=0;x<battleShip.getX();x++) {
                        for (int y=0;y<battleShip.getY();y++) {
                            player1buttons[x][y].setEnabled(false);
                            player2buttons[x][y].setEnabled(false);
                        }
                    }  
                    playerName = JOptionPane.showInputDialog("Enter your name");
                    database dconn = new database(); 
                    dconn.insertNewScore(playerName, battleShip.getPlayerMoves(battleShip.getPlayer()));                    
                    return;
                }                
                jLabelTurn.setText("It's Player 1's Turn!");
                break;
        }
             
    }
}
