/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package globalproject.ui;

import globalproject.BaseModuleWindows;
import globalproject.BaseWindows;
import globalproject.data.EmployeesRepositoryImpl;
import globalproject.domain.Employee;
import globalproject.domain.EmployeesRepository;
import globalproject.domain.Product;
import globalproject.domain.ProductsRepository;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author joseflavio
 */
public class EmployeesUi extends BaseModuleWindows {

    private EmployeesRepository repository= new EmployeesRepositoryImpl();
   
    /**
     * Creates new form ProductsUI
     */
    public EmployeesUi() {
        initComponents();
        runBackButton();
        initUI();
    }
    
    @Override
    protected void initUI() {
        
        employeesui_lbl_title.setText(strings.getString("employees_lbl_title"));
        
        ArrayList<Employee> lista = (ArrayList<Employee>) this.repository.getAll();
        
        StringBuilder sb = new StringBuilder();
        
        String empCodeTitle = "Cod Employee";
        String empNameTitle = "Employee Name";
        String empAgeTitle = "Employe Age";
        String empEspecTitle = "Employe specialty";
        sb.append(empCodeTitle+"\t\t" + empNameTitle +"\t" + empEspecTitle +"\t" + empAgeTitle  +"\r\n");
        
        for (int i = 0; i < lista.size(); i++) {
            
            String empCode = lista.get(i).getEmpId();
            String empName = lista.get(i).getEmpNombre();
            String empAge = lista.get(i).getEmpEdad();
            String empEspc = lista.get(i).getEmpEspecialidad();
            
            sb.append(empCode+"\t\t" + empName +"\t\t" + empEspc + "\t\t" + empAge +"\r\n");
            sb.append("\r\n");
        }
        productsui_lbl_list.setText(sb.toString());
        
    }
    
    public void setRepository(EmployeesRepository repository) {
        this.repository = repository;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeesui_lbl_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsui_lbl_list = new javax.swing.JTextArea();
        productsui_btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        employeesui_lbl_title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        employeesui_lbl_title.setText("Employees Module");

        productsui_lbl_list.setColumns(20);
        productsui_lbl_list.setRows(5);
        jScrollPane1.setViewportView(productsui_lbl_list);

        productsui_btn_back.setText(".......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productsui_btn_back)
                        .addGap(211, 211, 211)
                        .addComponent(employeesui_lbl_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(productsui_btn_back)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(employeesui_lbl_title)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeesui_lbl_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton productsui_btn_back;
    private javax.swing.JTextArea productsui_lbl_list;
    // End of variables declaration//GEN-END:variables

    @Override
    public JButton getBackButton() {
        return productsui_btn_back;
    }

}
