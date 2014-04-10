
package byui.cit260.checkers.frames;

import byui.cit260.checkers.enums.HelpType;
import byui.cit260.checkers.exceptions.CheckersException;
import byui.cit260.checkers.controls.HelpMenuControl;
/**
 *
 * @author Cody
 */
public class HelpFrame extends javax.swing.JFrame {
    HelpMenuControl helpCommands = new HelpMenuControl();
    
    /**
     * Creates new form MainFrame
     */
   public HelpFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public HelpMenuControl getHelpCommands() {
        return helpCommands;
    }


    
    private void displayHelpText(HelpType command) {
        try {
            String helpText = this.helpCommands.getHelpText(command);
            this.jtHelpText.setText(helpText);
        } catch (CheckersException ex) {
            this.jtHelpText.setText(ex.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHelpText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbInstructions = new javax.swing.JButton();
        theBoardButton = new javax.swing.JButton();
        checkerGameButton = new javax.swing.JButton();
        aLocationButton = new javax.swing.JButton();
        aMarkerButton = new javax.swing.JButton();
        aRegularPlayerButton = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checkers Help");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jtHelpText.setEditable(false);
        jtHelpText.setColumns(20);
        jtHelpText.setLineWrap(true);
        jtHelpText.setRows(5);
        jtHelpText.setWrapStyleWord(true);
        jtHelpText.setFocusable(false);
        jtHelpText.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtHelpText);
        jtHelpText.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("HELP");
        jLabel1.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbInstructions.setText("Instructions");
        jbInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInstructionsActionPerformed(evt);
            }
        });

        theBoardButton.setText("The Board");
        theBoardButton.setToolTipText("");
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

        jbExit.setText("Return");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aRegularPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aMarkerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aLocationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkerGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(theBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jbExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theBoardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkerGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aLocationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aMarkerButton)
                .addGap(13, 13, 13)
                .addComponent(aRegularPlayerButton)
                .addGap(18, 18, 18)
                .addComponent(jbExit)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void theBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theBoardButtonActionPerformed
        displayHelpText(HelpType.BOARD);  
    }//GEN-LAST:event_theBoardButtonActionPerformed

    private void checkerGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkerGameButtonActionPerformed
        displayHelpText(HelpType.GAME);
    }//GEN-LAST:event_checkerGameButtonActionPerformed

    private void aRegularPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRegularPlayerButtonActionPerformed
        displayHelpText(HelpType.REAL_PLAYER);
    }//GEN-LAST:event_aRegularPlayerButtonActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void aLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLocationButtonActionPerformed
       displayHelpText(HelpType.LOCATION);
    }//GEN-LAST:event_aLocationButtonActionPerformed

    private void aMarkerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMarkerButtonActionPerformed
       displayHelpText(HelpType.MARKER);
    }//GEN-LAST:event_aMarkerButtonActionPerformed

    private void jbInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInstructionsActionPerformed
        displayHelpText(HelpType.INSTRUCTIONS);
    }//GEN-LAST:event_jbInstructionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aLocationButton;
    private javax.swing.JButton aMarkerButton;
    private javax.swing.JButton aRegularPlayerButton;
    private javax.swing.JButton checkerGameButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbInstructions;
    private javax.swing.JTextArea jtHelpText;
    private javax.swing.JButton theBoardButton;
    // End of variables declaration//GEN-END:variables

}
