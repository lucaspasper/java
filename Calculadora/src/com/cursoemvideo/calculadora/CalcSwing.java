/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoemvideo.calculadora;

import static java.lang.Math.abs;
import static java.lang.Math.cbrt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author root
 */
public class CalcSwing extends javax.swing.JFrame {

    /**
     * Creates new form CalcSwing
     */
    public CalcSwing() {
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        panCalc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDiv = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaizQ = new javax.swing.JLabel();
        lblRaizC = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel1.setText("Informe um valor");

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/lpaschoal/Downloads/calculator.png")); // NOI18N

        jLabel3.setText("Resto da divisão por 2");

        jLabel4.setText("Elevado ao Cubo");

        jLabel5.setText("Raiz Quadrada");

        jLabel6.setText("Raiz Cubica");

        jLabel7.setText("Valor Absoluto");

        lblDiv.setText("0");

        lblCubo.setText("0");

        lblRaizQ.setText("0");

        lblRaizC.setText("0");

        lblAbs.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaizQ)
                    .addComponent(lblRaizC)
                    .addComponent(lblAbs)
                    .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblDiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCubo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCalcLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDiv))
                .addGap(21, 21, 21)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblCubo)
                        .addGap(21, 21, 21)
                        .addComponent(lblRaizQ)
                        .addGap(21, 21, 21)
                        .addComponent(lblRaizC)
                        .addGap(21, 21, 21)
                        .addComponent(lblAbs))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        panCalc.setVisible(true);
        int numero = Integer.parseInt(txtNum.getValue().toString());
        int restDiv = numero % 2;
        float cubo = (float) Math.pow(numero,3);
        float raizQ = (float) Math.sqrt(numero);
        float raizC = (float) Math.cbrt(numero);
        int absoluto = (int) Math.abs(numero);
        lblDiv.setText(Integer.toString(restDiv));
        lblRaizQ.setText(String.format("%.1f",raizQ));
        lblRaizC.setText(String.format("%.1f",raizC));
        lblCubo.setText(String.format("%.1f",cubo));
        lblAbs.setText(Integer.toString(absoluto));
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(CalcSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblDiv;
    private javax.swing.JLabel lblRaizC;
    private javax.swing.JLabel lblRaizQ;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
