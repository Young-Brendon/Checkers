/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.checkers.frames;

import byui.cit260.checkers.enums.HelpType;
import byui.cit260.checkers.exceptions.CheckersException;
import byui.cit260.checkers.controls.HelpMenuControl;
/**
 *
 * @author Cody
 */
public class HelpFrame extends javax.swing.JPanel {
  HelpMenuControl helpCommands = new HelpMenuControl();
    
    /**
     * Creates new form MainFrame
     */
    public HelpFrame() {
        initComponents();
        //setLocationRelativeTo(null);
    }

    public HelpMenuControl getHelpCommands() {
        return helpCommands;
    }


    
    private void displayHelpText(HelpType command) {
        try {
            String helpText = this.helpCommands.getHelpText(command);
            this.helpTextView.setText(helpText);
        } catch (CheckersException ex) {
            this.helpTextView.setText(ex.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        theBoardButton = new javax.swing.JButton();
        checkerGameButton = new javax.swing.JButton();
        aLocationButton = new javax.swing.JButton();
        aMarkerButton = new javax.swing.JButton();
        aRegularPlayerButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        helpTextView = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        theBoardButton.setText("The Board");
        theBoardButton.setToolTipText("");
        theBoardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theBoardButtonMouseClicked(evt);
            }
        });
        theBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theBoardButtonActionPerformed(evt);
            }
        });

        checkerGameButton.setText("The Checkers Game");
        checkerGameButton.setToolTipText("");
        checkerGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkerGameButtonActionPerformed(evt);
            }
        });

        aLocationButton.setText("A Location");
        aLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLocationButtonActionPerformed(evt);
            }
        });

        aMarkerButton.setText("A Marker");
        aMarkerButton.setToolTipText("");
        aMarkerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMarkerButtonActionPerformed(evt);
            }
        });

        aRegularPlayerButton.setText("A Regular Player ");
        aRegularPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aRegularPlayerButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit Help");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        helpTextView.setColumns(20);
        helpTextView.setRows(5);
        jScrollPane1.setViewportView(helpTextView);
        helpTextView.getAccessibleContext().setAccessibleName("helpText");
        helpTextView.getAccessibleContext().setAccessibleParent(helpTextView);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("HELP");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(quitButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkerGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aMarkerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aLocationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(theBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aRegularPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(theBoardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkerGameButton)
                        .addGap(18, 18, 18)
                        .addComponent(aLocationButton)
                        .addGap(18, 18, 18)
                        .addComponent(aMarkerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aRegularPlayerButton)
                        .addGap(67, 67, 67)))
                .addComponent(quitButton)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void theBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theBoardButtonActionPerformed
     
       this.helpTextView.setText("\"\\tThe game board for Checkers. It consist of a grid of \"\n" +
"                + \"\\n\\tlocations. Players move their markers diagonally across \"\n" +
"                + \"\\n\\tthe board in an effort to win the game. The default board is \"\n" +
"                + \"\\n\\t8 rows by 8 columns.");
      
    }//GEN-LAST:event_theBoardButtonActionPerformed

    private void checkerGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkerGameButtonActionPerformed
        this.helpTextView.setText("\tThe objective of the game is to be the first player to move all of "
                + "\n\ttheir markers diagonally across the board. Each player takes "
                + "\n\tturns moving their marker one square, or jumping diagonally over "
                + "\n\tanother player's marker. The opponents markers that are jumped "
                + "\n\tover are removed from the board. The first player to get all of "
                + "\n\ttheir markers (or all their remaining markers) to the other side "
                + "\n\tof the board is the winner.");
    }//GEN-LAST:event_checkerGameButtonActionPerformed

    private void aRegularPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRegularPlayerButtonActionPerformed
        this.helpTextView.setText("\tA player takes their turn by moving a marker diagonally one space "
                + "\n\ton the board. A player may jump over the opposing player's "
                + "\n\tmarkers as many times as possible as long as they continue to "
                + "\n\tjump forward in a diagonal direction without skipping a square.");
    }//GEN-LAST:event_aRegularPlayerButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
      //this.dispose;
    }//GEN-LAST:event_quitButtonActionPerformed

    private void theBoardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theBoardButtonMouseClicked
        this.helpTextView.setText("\"\\tThe game board for Checkers. It consist of a grid of \"\n" +
"                + \"\\n\\tlocations. Players move their markers diagonally across \"\n" +
"                + \"\\n\\tthe board in an effort to win the game. The default board is \"\n" +
"                + \"\\n\\t8 rows by 8 columns."); 
    }//GEN-LAST:event_theBoardButtonMouseClicked

    private void aLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLocationButtonActionPerformed
       this.helpTextView.setText("\tA location on the board where a player can place their marker"); 
    }//GEN-LAST:event_aLocationButtonActionPerformed

    private void aMarkerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMarkerButtonActionPerformed
        this.helpTextView.setText("\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"R\" and \"B\" which stands for Red and Black"
                + "\n\trespectively.");
    }//GEN-LAST:event_aMarkerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aLocationButton;
    private javax.swing.JButton aMarkerButton;
    private javax.swing.JButton aRegularPlayerButton;
    private javax.swing.JButton checkerGameButton;
    private javax.swing.JTextArea helpTextView;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton theBoardButton;
    // End of variables declaration//GEN-END:variables

}
