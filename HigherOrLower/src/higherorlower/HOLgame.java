package higherorlower;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.util.*;

public class HOLgame extends javax.swing.JFrame {

    public String[] cards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    public String[] suits = new String[]{"H.png", "D.png", "S.png", "C.png"};

    public Random random = new Random();
    int cardpick = random.nextInt(12);
    int suitpick = random.nextInt(3);
    public String cardFull = cards[cardpick].concat(suits[suitpick]);
    int cardpicknew;
    int suitpicknew;

    public int score = 0;

    public HOLgame() {
        initComponents();
        startButton.setVisible(true);
        higherButton.setEnabled(false);
        lowerButton.setEnabled(false);

        higherButton.setBackground(Color.WHITE);
        lowerButton.setBackground(Color.WHITE);
        startButton.setBackground(Color.WHITE);

        scoreDisplay.setForeground(Color.WHITE);
        scoreDisplay.setFont(new Font("Serif", Font.PLAIN, 30));

        ImageIcon title = new ImageIcon("title.png");
        jLabel1.setIcon(new ImageIcon(title.getImage().getScaledInstance(325, 80, Image.SCALE_DEFAULT)));

        ImageIcon cardBack = new ImageIcon("BackOfCard.png");
        cardDisplay.setIcon(cardBack);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardDisplay = new javax.swing.JLabel();
        higherButton = new javax.swing.JButton();
        lowerButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        scoreDisplay = new javax.swing.JLabel();
        sansDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        higherButton.setText("Higher");
        higherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higherButtonActionPerformed(evt);
            }
        });

        lowerButton.setText("Lower");
        lowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        scoreDisplay.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(higherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lowerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sansDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(higherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lowerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(scoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sansDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        startButton.setVisible(false);

        ImageIcon cardfull = new ImageIcon(cardFull);
        cardDisplay.setIcon(cardfull);

        lowerButton.setEnabled(true);
        higherButton.setEnabled(true);

    }//GEN-LAST:event_startButtonActionPerformed

    private void higherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higherButtonActionPerformed
        cardpicknew = random.nextInt(12);
        suitpicknew = random.nextInt(3);
        cardFull = cards[cardpicknew].concat(suits[suitpicknew]);

        if (cardpick == cardpicknew) {
        }
        if (cardpick > cardpicknew && score > 0) {
            score = score - 1;
            cardpick = cardpicknew;
        }
        if (cardpick < cardpicknew) {
            score = score + 1;
            cardpick = cardpicknew;
        }

        scoreDisplay.setText("Score: " + score);

        ImageIcon cardfull = new ImageIcon(cardFull);
        cardDisplay.setIcon(cardfull);

        if (score >= 10) {
            ImageIcon sans = new ImageIcon("sans.png");
            sansDisplay.setIcon(new ImageIcon(sans.getImage().getScaledInstance(193, 193, Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_higherButtonActionPerformed

    private void lowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerButtonActionPerformed
        cardpicknew = random.nextInt(12);
        suitpicknew = random.nextInt(3);
        cardFull = cards[cardpicknew].concat(suits[suitpicknew]);

        if (cardpick == cardpicknew) {
        }
        if (cardpick > cardpicknew) {
            score = score + 1;
            cardpick = cardpicknew;
        }
        if (cardpick < cardpicknew && score > 0) {
            score = score - 1;
            cardpick = cardpicknew;
        }

        scoreDisplay.setText("Score: " + score);

        ImageIcon cardfull = new ImageIcon(cardFull);
        cardDisplay.setIcon(cardfull);

        if (score >= 10) {
            ImageIcon sans = new ImageIcon("sans.png");
            sansDisplay.setIcon(new ImageIcon(sans.getImage().getScaledInstance(193, 193, Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_lowerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HOLgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOLgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOLgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOLgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOLgame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardDisplay;
    private javax.swing.JButton higherButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lowerButton;
    private javax.swing.JLabel sansDisplay;
    private javax.swing.JLabel scoreDisplay;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
