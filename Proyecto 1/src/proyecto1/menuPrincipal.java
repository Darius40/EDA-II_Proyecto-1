package proyecto1;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Polifase = new javax.swing.JButton();
        B_MEquilibrada = new javax.swing.JButton();
        B_Radix = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B_Polifase.setText("Polifase");
        B_Polifase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PolifaseActionPerformed(evt);
            }
        });

        B_MEquilibrada.setText("Mezcla E.");

        B_Radix.setText("Radix");
        B_Radix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RadixActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleciona el algoritmo de ordenamiento que deseas realizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(B_Polifase)
                .addGap(47, 47, 47)
                .addComponent(B_MEquilibrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_Radix)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Polifase)
                    .addComponent(B_MEquilibrada)
                    .addComponent(B_Radix))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_PolifaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PolifaseActionPerformed
        Polifase p = new Polifase();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_PolifaseActionPerformed

    private void B_RadixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RadixActionPerformed
        Radix radix = new Radix();
        radix.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_RadixActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_MEquilibrada;
    private javax.swing.JButton B_Polifase;
    private javax.swing.JButton B_Radix;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
