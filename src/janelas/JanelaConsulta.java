/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package janelas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Banco;
import modelo.Cliente;

/**
 *
 * @author brunn
 */
public class JanelaConsulta extends javax.swing.JDialog {
    
    private Banco banco;
    
    public JanelaConsulta(Banco banco, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.banco = banco;
        this.povoarTabela();
    }

    private void povoarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jtabela.getModel();
        ArrayList<Cliente> lista = this.banco.consulta();
        for(Cliente cliente : lista){
            String[] linha = {
                cliente.getId()+"",
                cliente.getNome(), 
                cliente.getTelefone(), 
                cliente.getEmail()
            };
            modelo.addRow(linha);
        }//Fim do For
    }//Fim do povoarTabela
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "TELEFONE", "E-MAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtabela);
        if (jtabela.getColumnModel().getColumnCount() > 0) {
            jtabela.getColumnModel().getColumn(0).setResizable(false);
            jtabela.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtabela.getColumnModel().getColumn(1).setResizable(false);
            jtabela.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtabela.getColumnModel().getColumn(2).setResizable(false);
            jtabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtabela.getColumnModel().getColumn(3).setResizable(false);
            jtabela.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabela;
    // End of variables declaration//GEN-END:variables
}
