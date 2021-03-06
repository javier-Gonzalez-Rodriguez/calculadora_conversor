/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesSecundarias;

import desafio.Calculadora;

/**
 *
 * @author javier
 */
public class NumsRomanos extends javax.swing.JFrame {

    /**
     * Creates new form NumsRomanos
     */
    private Calculadora calculadora;
    public NumsRomanos() {
        initComponents();
        calculadora = null;
    }
    
    /**
     * constructor por parametros
     * @param v se le pasa la ventana principal
     */
    public NumsRomanos(Calculadora v){
        initComponents();
        calculadora = v;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        Buno = new javax.swing.JButton();
        Bcinco = new javax.swing.JButton();
        Bdiez = new javax.swing.JButton();
        Bcincuenta = new javax.swing.JButton();
        Bcien = new javax.swing.JButton();
        Bquinientos = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("numeros romanos");
        setPreferredSize(new java.awt.Dimension(432, 68));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Buno.setText("I");
        Buno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BunoActionPerformed(evt);
            }
        });
        getContentPane().add(Buno);

        Bcinco.setText("V");
        Bcinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcincoActionPerformed(evt);
            }
        });
        getContentPane().add(Bcinco);

        Bdiez.setText("X");
        Bdiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdiezActionPerformed(evt);
            }
        });
        getContentPane().add(Bdiez);

        Bcincuenta.setText("L");
        Bcincuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcincuentaActionPerformed(evt);
            }
        });
        getContentPane().add(Bcincuenta);

        Bcien.setText("C");
        Bcien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcienActionPerformed(evt);
            }
        });
        getContentPane().add(Bcien);

        Bquinientos.setText("D");
        Bquinientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BquinientosActionPerformed(evt);
            }
        });
        getContentPane().add(Bquinientos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BunoActionPerformed
        calculadora.addNumsEsp("I");
    }//GEN-LAST:event_BunoActionPerformed

    private void BdiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdiezActionPerformed
        calculadora.addNumsEsp("X");
    }//GEN-LAST:event_BdiezActionPerformed

    private void BcincuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcincuentaActionPerformed
        calculadora.addNumsEsp("L");
    }//GEN-LAST:event_BcincuentaActionPerformed

    private void BcienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcienActionPerformed
        calculadora.addNumsEsp("C");
    }//GEN-LAST:event_BcienActionPerformed

    private void BquinientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BquinientosActionPerformed
        calculadora.addNumsEsp("D");
    }//GEN-LAST:event_BquinientosActionPerformed

    private void BcincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcincoActionPerformed
       calculadora.addNumsEsp("V");
    }//GEN-LAST:event_BcincoActionPerformed

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
            java.util.logging.Logger.getLogger(NumsRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumsRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumsRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumsRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumsRomanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcien;
    private javax.swing.JButton Bcinco;
    private javax.swing.JButton Bcincuenta;
    private javax.swing.JButton Bdiez;
    private javax.swing.JButton Bquinientos;
    private javax.swing.JButton Buno;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}
