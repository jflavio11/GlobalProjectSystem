/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalproject.ui;

import globalproject.domain.Product;
import globalproject.domain.ProductsRepository;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class ProductsUI extends javax.swing.JPanel {

   
    private ProductsRepository repository;
    String ProductosTexto = "";
    
    public void setRepository(ProductsRepository repository) {
        this.repository = repository;
    }
    
    public void fillUi (){
        ArrayList<Product> lista = (ArrayList<Product>) this.repository.getAll();
        
        for (int i = 0; i < lista.size(); i++) {
            
            ProductosTexto+= "Nombre Producto : "+lista.get(i).getProdCode()+lista.get(i).getProdName()+"\n";
        }
    }
    
    
    
    /**
     * Creates new form ProductsUI
     */
    public ProductsUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("j");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
