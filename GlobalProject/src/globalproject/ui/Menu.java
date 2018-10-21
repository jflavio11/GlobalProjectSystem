package globalproject.ui;

import globalproject.BaseWindows;
import globalproject.data.ProductsRepositoryImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


/**
 *
 * @author Jose Flavio
 */
public final class Menu extends BaseWindows {
    
    /**
     * Creates new form Interface
     */
    public Menu() {
        initComponents();
        initUI();
    }
    
    @Override
    protected void initUI(){
        
        menu_btn_products.setText(strings.getString("menu_btn_products"));
        menu_btn_services.setText(strings.getString("menu_btn_services"));
        menu_btn_employees.setText(strings.getString("menu_btn_employees"));
        menu_btn_clients.setText(strings.getString("menu_btn_clients"));
        menu_btn_accounting.setText(strings.getString("menu_btn_accounting"));
        menu_btn_requests.setText(strings.getString("menu_btn_requests"));
        menu_btn_language.setText(strings.getString("menu_btn_changeLan"));
        
        // TODO: set text to login info label and btn login
        // TODO: Do all others GUI windows on the package 'ui'
        
        // set login info label visible as false because first user must be logged in system
        menu_lbl_logininfo.setVisible(false);
        
        menu_btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                // when login btn is clicked we verify if user is logged
                // if user is logged we logged out and change btn text: Login!
                // if user is not logged and login is successful, change btn text to: Logout!
                if (globalproject.data.Session.getCurrentSession().isLogged()) {
                    
                }
                
                
            }
        });
        
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
        menu_btn_language = new javax.swing.JButton();
        menu_btn_login = new javax.swing.JButton();
        menu_lbl_logininfo = new javax.swing.JLabel();

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
        menu_btn_accounting.setText("Contabilidad");
        menu_btn_accounting.setFocusable(false);

        menu_btn_requests.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_requests.setText("Peticiones");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Storage Data System");

        menu_btn_clients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_btn_clients.setText("Clientes");

        menu_lbl_description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_lbl_description.setText("Esoge el módulo a consultar");

        menu_btn_language.setText("Escoger idioma");
        menu_btn_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn_languageActionPerformed(evt);
            }
        });

        menu_btn_login.setText("Login");
        menu_btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn_loginActionPerformed(evt);
            }
        });

        menu_lbl_logininfo.setText("Bienvenido: Coca Cola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(menu_lbl_description))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(menu_lbl_logininfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(menu_btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menu_btn_accounting, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(menu_btn_products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(menu_btn_services, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(menu_btn_requests, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(menu_btn_language))
                            .addGap(96, 96, 96)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(menu_btn_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(menu_btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu_btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu_lbl_logininfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(menu_lbl_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_btn_products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_btn_services, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_btn_employees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu_btn_accounting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn_requests, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(menu_btn_language, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn_productsActionPerformed
        ProductsUi productsui = new ProductsUi();
        productsui.setRepository(new ProductsRepositoryImpl());
        dispose();
        productsui.setVisible(true);
        productsui.initUI();
    }//GEN-LAST:event_menu_btn_productsActionPerformed

    private void menu_btn_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn_languageActionPerformed
        Welcome welcome = new Welcome();
        dispose();
        welcome.setVisible(true);
    }//GEN-LAST:event_menu_btn_languageActionPerformed

    private void menu_btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn_loginActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_menu_btn_loginActionPerformed

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
    private javax.swing.JButton menu_btn_language;
    private javax.swing.JButton menu_btn_login;
    private javax.swing.JButton menu_btn_products;
    private javax.swing.JButton menu_btn_requests;
    private javax.swing.JButton menu_btn_services;
    private javax.swing.JLabel menu_lbl_description;
    private javax.swing.JLabel menu_lbl_logininfo;
    // End of variables declaration//GEN-END:variables
}
