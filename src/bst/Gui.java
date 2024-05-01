
package bst;


import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;


public class Gui extends javax.swing.JFrame {

    private Simulare simulator = new Simulare();

    public Gui() {
        initComponents();
        this.initializare(false);


    }

    private void initializare(boolean enable) {
       this.InOrder.setEnabled(enable);
       this.PostOrder.setEnabled(enable);
       this.PreOrder.setEnabled(enable);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        valoare = new javax.swing.JTextField();
        butoninserare = new javax.swing.JButton();
        InOrder = new javax.swing.JButton();
        PostOrder = new javax.swing.JButton();
        PreOrder = new javax.swing.JButton();
        butonstergere = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel2.setOpaque(false);

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(-10, 0, 600, 310);

        jLabel1.setText("Introduceti valoarea:");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(0, 310, 130, 16);

        butoninserare.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butoninserare.setText("Insereaza");
        butoninserare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoninserareActionPerformed(evt);
            }
        });

        InOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        InOrder.setText("InOrder");
        InOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrderActionPerformed(evt);
            }
        });

        PostOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PostOrder.setText("PostOrder");
        PostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrderActionPerformed(evt);
            }
        });

        PreOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PreOrder.setText("PreOrder");
        PreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrderActionPerformed(evt);
            }
        });

        butonstergere.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butonstergere.setText("Sterge");
        butonstergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonstergereActionPerformed(evt);
            }
        });

        impresion.setColumns(20);
        impresion.setRows(5);
        jScrollPane2.setViewportView(impresion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(InOrder)
                                .addGap(18, 18, 18)
                                .addComponent(PostOrder)
                                .addGap(18, 18, 18)
                                .addComponent(PreOrder))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(valoare, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butoninserare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butonstergere, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(valoare, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(butoninserare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butonstergere))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InOrder)
                            .addComponent(PostOrder)
                            .addComponent(PreOrder)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonstergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonstergereActionPerformed
        try {
        int data = Integer.parseInt(valoare.getText());
        if (this.simulator.stergere(data)) {
            this.initializare(true);
            this.suplimente();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Nu s-a putut efectua stergerea", "incearca din nou...", 0);
    }
    }//GEN-LAST:event_butonstergereActionPerformed

    private void PreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrderActionPerformed
        // TODO add your handling code here:
        String traseu = this.simulator.preOrder();
        this.impresion.setText("");
        this.impresion.setText(traseu);
    }//GEN-LAST:event_PreOrderActionPerformed

    private void PostOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrderActionPerformed
        // TODO add your handling code here:
        String traseu = this.simulator.postOrder();
        this.impresion.setText("");
        this.impresion.setText(traseu);
    }//GEN-LAST:event_PostOrderActionPerformed

    private void InOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrderActionPerformed
        // TODO add your handling code here:
        String traseu = this.simulator.inOrder();
        this.impresion.setText("");
        this.impresion.setText(traseu);
    }//GEN-LAST:event_InOrderActionPerformed

    private void butoninserareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoninserareActionPerformed
        try {
            int data = Integer.parseInt(valoare.getText());
            if (this.simulator.inserare(data)) {
                ///JOptionPane.showMessageDialog(null, "Data a fost introdusa corect", " ...", 1);
                this.initializare(true);
                suplimente();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nu s a putut introduce data", "incearca din nou...", 0);
        }
    }//GEN-LAST:event_butoninserareActionPerformed

    public void suplimente(){
        this.reprintare();
    }
    public  void reprintare() {
        this.jDesktopPane1.removeAll();
        Rectangle dimensiune = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Reprezentare grafica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(dimensiune);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulator.getDesen(), BorderLayout.CENTER);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InOrder;
    private javax.swing.JButton PostOrder;
    private javax.swing.JButton PreOrder;
    private javax.swing.JButton butoninserare;
    private javax.swing.JButton butonstergere;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField valoare;
    // End of variables declaration//GEN-END:variables
}
