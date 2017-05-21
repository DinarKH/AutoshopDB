package ViewDB;

import Connection.Connect;

public class ConnectPanel extends javax.swing.JFrame {
    private Connect con;
    
    public ConnectPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneHost = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPanePort = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneLogin = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPanePas = new javax.swing.JTextPane();
        jButtonCon = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPaneNameDB = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPaneHost.setText("localhost");
        jScrollPane1.setViewportView(jTextPaneHost);

        jTextPanePort.setText("5432");
        jScrollPane2.setViewportView(jTextPanePort);

        jTextPaneLogin.setText("Dinar5");
        jScrollPane3.setViewportView(jTextPaneLogin);

        jScrollPane4.setViewportView(jTextPanePas);

        jButtonCon.setText("Connect");
        jButtonCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConActionPerformed(evt);
            }
        });

        jTextPaneNameDB.setText("autoshop");
        jScrollPane5.setViewportView(jTextPaneNameDB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCon)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonCon)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConActionPerformed
        con = new Connect(jTextPaneHost.getText(), jTextPanePort.getText(), jTextPaneNameDB.getText(),
                jTextPaneLogin.getText(), jTextPanePas.getText());
        con = new Connect("localhost", "5432", "autoshop",
                "Dinar5", "");
        MainPanel.MainP.setVisible(true);
        MainPanel.MainP.openConnect();
        this.dispose();
    }//GEN-LAST:event_jButtonConActionPerformed

    public Connect getCon() {
        return con;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPaneHost;
    private javax.swing.JTextPane jTextPaneLogin;
    private javax.swing.JTextPane jTextPaneNameDB;
    private javax.swing.JTextPane jTextPanePas;
    private javax.swing.JTextPane jTextPanePort;
    // End of variables declaration//GEN-END:variables
}
