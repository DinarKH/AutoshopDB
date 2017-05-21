package ViewDB;

import static java.awt.Frame.MAXIMIZED_BOTH;
import Connection.Connect;
import Connection.ManageConnect;
import ManageDB.ClientDB;
import ManageDB.ContractDB;
import FigureDB.Client;
import FigureDB.Contract;
import Querie.QueryPanel;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainPanel extends javax.swing.JFrame {

    private ConnectPanel cntp = new ConnectPanel();
    private Connect con;
    public static MainPanel MainP;
    ManageConnect mcon;
    private DefaultTableModel tableModel = new DefaultTableModel();
    ContractDB contractDB;
    List<Contract> contracts;
    List<Client> clients;

    public MainPanel() {
        initComponents();
        openConnectPanel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelConnect = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonIUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonQuery = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 6, 375, 112);

        jLabelConnect.setText("jLabel1");
        getContentPane().add(jLabelConnect);
        jLabelConnect.setBounds(398, 275, 60, 14);

        jTextField1.setText("2017");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(320, 160, 65, 20);

        jTextField2.setText("1");
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(245, 159, 68, 20);

        jTextField3.setText("1");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(163, 159, 64, 20);

        jTextField4.setText("2016");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(319, 206, 65, 20);

        jTextField5.setText("1");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(241, 206, 68, 20);

        jTextField6.setText("1");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(163, 206, 64, 20);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd);
        jButtonAdd.setBounds(10, 158, 67, 23);

        jButtonIUpdate.setText("Update");
        jButtonIUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIUpdate);
        jButtonIUpdate.setBounds(10, 205, 67, 23);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(10, 246, 67, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(405, 247, 56, 20);

        jLabel1.setText("День");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(181, 136, 26, 14);

        jLabel2.setText("День");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(163, 187, 26, 14);

        jLabel3.setText("Месяц");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(245, 138, 31, 14);

        jLabel4.setText("Месяц");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(241, 187, 31, 14);

        jLabel5.setText("Год");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(319, 136, 30, 14);

        jLabel6.setText("Год");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(319, 187, 19, 14);

        jButtonQuery.setText("Query");
        jButtonQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQueryActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuery);
        jButtonQuery.setBounds(174, 246, 63, 23);

        jLabel7.setText("Клиент");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(327, 250, 60, 14);

        jLabel8.setText("Добавление");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(83, 162, 70, 14);

        jLabel9.setText("Завершение");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(81, 209, 80, 14);

        jMenu1.setText("Меню");

        jMenuItem8.setText("Соединиться");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Отключиться");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Выход");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Справочник");

        jMenuItem1.setText("Клиент");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Машина");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Рабочий");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Услуги");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Рабочий-Контракт");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Список услуг");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Контракты");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClientPanel cpanel = new ClientPanel(mcon);
        cpanel.setVisible(true);
        cpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CarPanel cpanel = new CarPanel(mcon);
        cpanel.setVisible(true);
        cpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        WorkerPanel wpanel = new WorkerPanel(mcon);
        wpanel.setVisible(true);
        wpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ServicePanel spanel = new ServicePanel(mcon);
        spanel.setVisible(true);
        spanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        WorkerContractPanel wcpanel = new WorkerContractPanel(mcon);
        wcpanel.setVisible(true);
        wcpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ListServicesPanel lspanel = new ListServicesPanel(mcon);
        lspanel.setVisible(true);
        lspanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ContractPanel cpanel = new ContractPanel(mcon);
        cpanel.setVisible(true);
        cpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
                try {
            Contract contract = new Contract();
            contract.setClientId(clients.get(jComboBox1.getSelectedIndex()).getClientId());
            contract.setDateIn(new Date(
                Integer.parseInt(jTextField1.getText())-1900,
                Integer.parseInt(jTextField2.getText())-1,
                Integer.parseInt(jTextField3.getText())                        
            ));
            contract.setDateOut(new Date(
                Integer.parseInt(jTextField4.getText())-1900,
                Integer.parseInt(jTextField5.getText())-1,
                Integer.parseInt(jTextField6.getText())                        
            ));
            contractDB.add(contract);
            MainPanel.MainP.ShowTable();
            ShowTable();
             JOptionPane.showMessageDialog(null, "Контракт добавлен", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Не делайте так", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Что-то пошло не так", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonIUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIUpdateActionPerformed
        try {
            Contract contract = contracts.get(jTable1.getSelectedRow());
            contract.setClientId(clients.get(jComboBox1.getSelectedIndex()).getClientId());
            contract.setDateIn(new Date(
                Integer.parseInt(jTextField1.getText())-1900,
                Integer.parseInt(jTextField2.getText())-1,
                Integer.parseInt(jTextField3.getText())                        
            ));
            contract.setDateOut(new Date(
                Integer.parseInt(jTextField4.getText())-1900,
                Integer.parseInt(jTextField5.getText())-1,
                Integer.parseInt(jTextField6.getText())                        
            ));
            contractDB.update(contract);
            MainPanel.MainP.ShowTable();
            ShowTable();
             JOptionPane.showMessageDialog(null, "Контракт обновлён", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "выберите элемент", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Не делайте так", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Что-то пошло не так", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            contractDB.delete(contracts.get(jTable1.getSelectedRow()));
            MainPanel.MainP.ShowTable();
            ShowTable();
             JOptionPane.showMessageDialog(null, "Контракт удалён", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "выберите элемент", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Что-то пошло не так", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Contract contract = contracts.get(jTable1.getSelectedRow());
        for (Client c : clients) {
                if (c.getClientId()== contract.getClientId()) {
                    jComboBox1.setSelectedItem(c.toString());
                    break;
                }
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        MainPanel.MainP.setVisible(false);
        cntp.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (mcon.closeConnection()) {
            jLabelConnect.setText("Connection closed");
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButtonQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQueryActionPerformed
        QueryPanel qpanel = new QueryPanel(mcon);
        qpanel.setVisible(true);
        qpanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonQueryActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainP = new MainPanel();
                MainP.setVisible(false);
                MainP.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }
    
    private void openConnectPanel() {
        cntp = new ConnectPanel();
        cntp.setVisible(true);
    }
    
    public void openConnect() {
        con = cntp.getCon();
        mcon = new ManageConnect(con);
        if (mcon.openConnect()) {
            jLabelConnect.setText("connect");
        } else {
            jLabelConnect.setText("fail connection");
        }

        jTable1.setModel(tableModel);
        try {
            ShowTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ShowTable() throws SQLException {
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("contract_id");
        tableModel.addColumn("client_id");
        tableModel.addColumn("date_in");
        tableModel.addColumn("date_out");
        contractDB = new ContractDB(mcon);
        ClientDB cdb = new ClientDB(mcon);
        Client c;
        contracts = contractDB.all();
        for (Contract e : contracts) {
                c= cdb.one(e.getClientId());
                tableModel.addRow(new String[]{
                e.getContractId()+ "",
                c.getSecondName()+" "+c.getFirstName()+"",
                e.getDateIn()+"",
                e.getDateOut()+""
            });
        }
        try {
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "нет соединения", "ERROR", JOptionPane.ERROR_MESSAGE);
        }        
        jComboBox1.removeAllItems();
            clients = cdb.all();
            for (Client e : clients) {
                jComboBox1.addItem(e.toString());
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonIUpdate;
    private javax.swing.JButton jButtonQuery;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConnect;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
