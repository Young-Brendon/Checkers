/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.checkers.frames;

import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.controls.GameMenuControl;
import byui.cit260.checkers.models.Game;

/**
 *
 * @author BDawg
 */
public class GameFrame extends javax.swing.JFrame {
    
    private String currentMarker = null;
    private Game game = null;
    private GameMenuControl gameCommands = null;

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {        
        
        this.initComponents();
        setLocationRelativeTo(null);
    }
    
    public GameFrame(Game game) {
        this();
        this.game = game;
        this.gameCommands = new GameMenuControl(game);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jNewGame = new javax.swing.JButton();
        jHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jChekersTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMessageArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checkers");

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel1.setText("Checkers");
        jLabel1.setName("jpTitle"); // NOI18N

        jNewGame.setText("New Game");
        jNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewGameActionPerformed(evt);
            }
        });

        jHelp.setText("Help");
        jHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHelpActionPerformed(evt);
            }
        });

        jbQuit.setText("Quit");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNewGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jHelp)
                .addGap(18, 18, 18)
                .addComponent(jbQuit)
                .addContainerGap())
        );

        jChekersTable.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jChekersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ));
        jChekersTable.setAutoscrolls(false);
        jChekersTable.setFocusable(false);
        jChekersTable.setGridColor(new java.awt.Color(0, 0, 0));
        jChekersTable.setRowHeight(30);
        jScrollPane1.setViewportView(jChekersTable);
        if (jChekersTable.getColumnModel().getColumnCount() > 0) {
            jChekersTable.getColumnModel().getColumn(0).setResizable(false);
            jChekersTable.getColumnModel().getColumn(0).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(1).setResizable(false);
            jChekersTable.getColumnModel().getColumn(1).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(2).setResizable(false);
            jChekersTable.getColumnModel().getColumn(2).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(3).setResizable(false);
            jChekersTable.getColumnModel().getColumn(3).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(4).setResizable(false);
            jChekersTable.getColumnModel().getColumn(4).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(5).setResizable(false);
            jChekersTable.getColumnModel().getColumn(5).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(6).setResizable(false);
            jChekersTable.getColumnModel().getColumn(6).setHeaderValue("");
            jChekersTable.getColumnModel().getColumn(7).setResizable(false);
            jChekersTable.getColumnModel().getColumn(7).setHeaderValue("");
        }

        jtMessageArea.setColumns(20);
        jtMessageArea.setRows(5);
        jScrollPane2.setViewportView(jtMessageArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        // TODO add your handling code here:
        Checkers.mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed

    private void jHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHelpActionPerformed
        // TODO add your handling code here:
        //HelpFrame helpFrame = new HelpFrame();
        //helpFrame.setVisible(true);
    }//GEN-LAST:event_jHelpActionPerformed

    private void jNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewGameActionPerformed
        // TODO add your handling code here:
        this.gameCommands.startNewGame(this.game);
        String nextPlayersMessage = this.game.getCurrentPlayer().getName()
        + " it is your turn.";
        this.jtMessageArea.setText(nextPlayersMessage);
    }//GEN-LAST:event_jNewGameActionPerformed
  
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jChekersTable;
    private javax.swing.JButton jHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jNewGame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbQuit;
    private javax.swing.JTextArea jtMessageArea;
    // End of variables declaration//GEN-END:variables
}
