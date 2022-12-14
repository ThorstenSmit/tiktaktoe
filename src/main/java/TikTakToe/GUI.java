package TikTakToe;

//Vermerk
public class GUI extends javax.swing.JFrame {

    //Dies ist ein Vermerk
    //
    private SpielCtr spielCtr;
    private javax.swing.JButton[][] jSpielButtonMatrix;

    public GUI() {
        this.spielCtr = new SpielCtr(this);
        initComponents();
        this.buildButtonMatrix();
    }

    public void buildButtonMatrix() {
        javax.swing.JButton[][] buttonMatrixTemp = {
            {
                this.jSpielButton1,
                this.jSpielButton2,
                this.jSpielButton3
            },
            {
                this.jSpielButton4,
                this.jSpielButton5,
                this.jSpielButton6
            },
            {
                this.jSpielButton7,
                this.jSpielButton8,
                this.jSpielButton9
            }
        };
        this.jSpielButtonMatrix = buttonMatrixTemp;
    }

    public void resetGUI() {
        this.initComponents();
    }

    public void refreshButtonMatrix(Kaestchen[][] kaestchenMatrix) {
        for (int idxSpalte = 0; idxSpalte < 3; idxSpalte++) {
            for (int idxReihe = 0; idxReihe < 3; idxReihe++) {
                if (kaestchenMatrix[idxSpalte][idxReihe] != null) {
                    System.out.println(this.jSpielButtonMatrix[idxSpalte][idxReihe]);
                    this.jSpielButtonMatrix[idxSpalte][idxReihe].setIcon(kaestchenMatrix[idxSpalte][idxReihe].getIcon());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpielButton2 = new javax.swing.JButton();
        jSpielButton1 = new javax.swing.JButton();
        jSpielButton3 = new javax.swing.JButton();
        jSpielButton4 = new javax.swing.JButton();
        jSpielButton5 = new javax.swing.JButton();
        jSpielButton6 = new javax.swing.JButton();
        jSpielButton7 = new javax.swing.JButton();
        jSpielButton8 = new javax.swing.JButton();
        jSpielButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TikTakToe");

        jButton1.setText("neues Spiel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpielButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton2ActionPerformed(evt);
            }
        });

        jSpielButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton1ActionPerformed(evt);
            }
        });

        jSpielButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton3ActionPerformed(evt);
            }
        });

        jSpielButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton4ActionPerformed(evt);
            }
        });

        jSpielButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton5ActionPerformed(evt);
            }
        });

        jSpielButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton6ActionPerformed(evt);
            }
        });

        jSpielButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton7ActionPerformed(evt);
            }
        });

        jSpielButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton8ActionPerformed(evt);
            }
        });

        jSpielButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpielButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jSpielButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpielButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpielButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpielButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpielButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpielButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpielButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpielButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jSpielButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpielButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpielButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpielButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSpielButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpielButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton2ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(0, 1);
    }//GEN-LAST:event_jSpielButton2ActionPerformed

    private void jSpielButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton3ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(0, 2);
    }//GEN-LAST:event_jSpielButton3ActionPerformed

    private void jSpielButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton5ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(1, 1);
    }//GEN-LAST:event_jSpielButton5ActionPerformed

    private void jSpielButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton6ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(1, 2);
    }//GEN-LAST:event_jSpielButton6ActionPerformed

    private void jSpielButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton8ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(2, 1);
    }//GEN-LAST:event_jSpielButton8ActionPerformed

    private void jSpielButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton9ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(2, 2);
    }//GEN-LAST:event_jSpielButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.spielCtr.neuesSpielfeld();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpielButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton1ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(0, 0);
    }//GEN-LAST:event_jSpielButton1ActionPerformed

    private void jSpielButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton4ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(1, 0);
    }//GEN-LAST:event_jSpielButton4ActionPerformed

    private void jSpielButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpielButton7ActionPerformed
        this.spielCtr.spielFeldButtonGedrueckt(2, 0);
    }//GEN-LAST:event_jSpielButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jSpielButton1;
    private javax.swing.JButton jSpielButton2;
    private javax.swing.JButton jSpielButton3;
    private javax.swing.JButton jSpielButton4;
    private javax.swing.JButton jSpielButton5;
    private javax.swing.JButton jSpielButton6;
    private javax.swing.JButton jSpielButton7;
    private javax.swing.JButton jSpielButton8;
    private javax.swing.JButton jSpielButton9;
    // End of variables declaration//GEN-END:variables
}
