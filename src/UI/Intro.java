package UI;

import AppPackage.AnimationClass;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Chamith
 */
public class Intro extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    AnimationClass AC = new AnimationClass();
    //private Label copyrightL = new Label("\u00a9");

    public Intro() throws UnsupportedLookAndFeelException, ParseException{
        //UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        initComponents();
        CustomCursor();
        SlideShow();
        //author.setText("CSSoft(Pvt)Ltd");
        //author.setLabelFor(copyrightL);
        
    }

    public void SlideShow() {

        new Thread() {

            int count = 0;

            @Override
            public void run() {

                try {

                    while (true) {

                        switch (count) {

                            case 0:

                                ImageIcon II = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic1.jpg"));
                                image1.setIcon(II);

                                Thread.sleep(6500);

                                AC.jLabelXLeft(0, -840, 20, 7, image1);
                                AC.jLabelXLeft(840, 0, 20, 7, image2);

                                count = 1;
                                break;

                            case 1:

                                ImageIcon II2 = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic2.jpg"));
                                image2.setIcon(II2);

                                Thread.sleep(6000);

                                AC.jLabelXRight(-840, 0, 20, 7, image1);
                                AC.jLabelXRight(0, 840, 20, 7, image2);

                                count = 2;
                                break;

                            case 2:

                                ImageIcon II3 = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic3.jpg"));
                                image1.setIcon(II3);

                                Thread.sleep(6000);

                                AC.jLabelXLeft(0, -840, 20, 7, image1);
                                AC.jLabelXLeft(840, 0, 20, 7, image2);

                                count = 3;
                                break;

                            case 3:

                                ImageIcon II4 = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic4.jpg"));
                                image2.setIcon(II4);

                                Thread.sleep(6000);

                                AC.jLabelXRight(-840, 0, 20, 7, image1);
                                AC.jLabelXRight(0, 840, 20, 7, image2);

                                count = 4;
                                break;

                            case 4:

                                ImageIcon II5 = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic5.jpg"));
                                image1.setIcon(II5);

                                Thread.sleep(6000);

                                AC.jLabelXLeft(0, -840, 20, 7, image1);
                                AC.jLabelXLeft(840, 0, 20, 7, image2);

                                count = 5;
                                break;

                            case 5:

                                ImageIcon II6 = new ImageIcon(getClass().getResource("/SlidePicsIntro/pic6.jpg"));
                                image2.setIcon(II6);

                                Thread.sleep(6000);

                                AC.jLabelXRight(-840, 0, 20, 7, image1);
                                AC.jLabelXRight(0, 840, 20, 7, image2);

                                count = 0;
                                break;
                                
                        }

                    }

                } catch (Exception e) {

                }

            }

        }.start();

    }

    public void CustomCursor() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("/Icons/cursor3.png"));
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "cursor");

        setCursor(cursor);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iconlabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        enclbl = new javax.swing.JLabel();
        declbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 474));
        jPanel1.setLayout(null);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close1.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(800, 10, 30, 20);

        framedrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                framedragMouseDragged(evt);
            }
        });
        framedrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                framedragMousePressed(evt);
            }
        });
        jPanel1.add(framedrag);
        framedrag.setBounds(0, 0, 840, 470);

        image1.setPreferredSize(new java.awt.Dimension(840, 472));
        jPanel1.add(image1);
        image1.setBounds(0, 0, 840, 472);

        image2.setPreferredSize(new java.awt.Dimension(840, 472));
        jPanel1.add(image2);
        image2.setBounds(840, 0, 840, 472);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        iconlabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iconlabel.setForeground(new java.awt.Color(204, 204, 204));
        iconlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconlabel.setText("Advance Encryption Solution");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        enclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enc.png"))); // NOI18N
        enclbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enclblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enclblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enclblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enclblMouseReleased(evt);
            }
        });

        declbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dec.png"))); // NOI18N
        declbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                declblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                declblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                declblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                declblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(enclbl)
                .addGap(165, 165, 165)
                .addComponent(declbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(declbl)
                    .addComponent(enclbl))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconlabel)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 840, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void framedragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_framedragMousePressed

    private void framedragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_framedragMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close2.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close1.png")));
    }//GEN-LAST:event_closeMouseExited

    private void enclblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enclblMouseEntered
        enclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enc1.png")));
        iconlabel.setText("Encrypt a file using a password");
    }//GEN-LAST:event_enclblMouseEntered

    private void enclblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enclblMouseExited
        enclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enc.png")));
        iconlabel.setText("Advance File Encryptor");
    }//GEN-LAST:event_enclblMouseExited

    private void enclblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enclblMousePressed
         enclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enc2.png")));
    }//GEN-LAST:event_enclblMousePressed

    private void enclblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enclblMouseReleased
        enclbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enc1.png")));
        FileChooser fileChooser = new FileChooser("ENCRYPT");
        fileChooser.setVisible(true);
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_enclblMouseReleased

    private void declblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declblMouseEntered
         declbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dec1.png")));
         iconlabel.setText("Decrypt an encrypted file");
    }//GEN-LAST:event_declblMouseEntered

    private void declblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declblMouseExited
         declbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dec.png")));
         iconlabel.setText("Advance File Encryptor");
    }//GEN-LAST:event_declblMouseExited

    private void declblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declblMousePressed
         declbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dec2.png")));
    }//GEN-LAST:event_declblMousePressed

    private void declblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declblMouseReleased
         declbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dec1.png")));
         FileChooser fileChooser = new FileChooser("DECRYPT");
         fileChooser.setVisible(true);
         //setVisible(false);
         //dispose();
    }//GEN-LAST:event_declblMouseReleased

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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                try {
                    new Intro().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel declbl;
    private javax.swing.JLabel enclbl;
    private javax.swing.JLabel framedrag;
    private javax.swing.JLabel iconlabel;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
