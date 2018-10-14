/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalproject;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author alumno
 */
public class Menu extends javax.swing.JFrame {
    
    private ResourceBundle strings;
    
    /**
     * Creates new form Interface
     */
    public Menu() {
        initComponents();
        cambiarIdioma("es");
        initUI();
    }
    
    private void initUI(){
        
        menu_btn_products.setText(strings.getString("menu_btn_products"));
        menu_btn_services.setText(strings.getString("menu_btn_services"));
        menu_btn_employees.setText(strings.getString("menu_btn_employees"));
        menu_btn_clients.setText(strings.getString("menu_btn_clients"));
        
    }
    
    private void cambiarIdioma(String idioma){

        Locale locale = new Locale("en");
        strings = ResourceBundle.getBundle("globalproject.strings",locale);

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_btn_products = new javax.swing.JButton();
        menu_btn_services = new javax.swing.JButton();
        menu_btn_employees = new javax.swing.JButton();
        menu_btn_accounting = new javax.swing.JButton();
        menu_btn_requests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menu_btn_clients = new javax.swing.JButton();
        menu_lbl_description = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_btn_products.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_products.setText("Products");
        menu_btn_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn_productsActionPerformed(evt);
            }
        });

        menu_btn_services.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_services.setText("Servicios");

        menu_btn_employees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_employees.setText("Empleados");

        menu_btn_accounting.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("globalproject/strings"); // NOI18N
        menu_btn_accounting.setText(bundle.getString("menu_btn_accounting")); // NOI18N

        menu_btn_requests.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_requests.setText("Peticiones");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Storage Data System");

        menu_btn_clients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_clients.setText("Clientes");

        menu_lbl_description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_lbl_description.setText("Esoge el módulo a consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu_btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu_btn_accounting))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu_btn_services, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu_btn_requests, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu_btn_employees)
                            .addComponent(menu_btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(menu_lbl_description)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(menu_lbl_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_btn_products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_btn_services, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_btn_employees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu_btn_accounting, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn_requests, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn_productsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_btn_productsActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu_btn_accounting;
    private javax.swing.JButton menu_btn_clients;
    private javax.swing.JButton menu_btn_employees;
    private javax.swing.JButton menu_btn_products;
    private javax.swing.JButton menu_btn_requests;
    private javax.swing.JButton menu_btn_services;
    private javax.swing.JLabel menu_lbl_description;
    // End of variables declaration//GEN-END:variables
}