
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.service.ProductService;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Laura Sofia
 */
public class GUIAGREGARPRODUCT extends javax.swing.JFrame {
    
    private ProductService productService;
     private boolean addOption = true;

    /**
     * Creates new form GUIMENUCATEGORIA
     */
    public GUIAGREGARPRODUCT(ProductService productService) {
        
        initComponents();
       
        this.productService = productService;
        /*txtIdAgregarProduct.setEnabled(false);
        txtIdAgregarProduct.setEnabled(false);*/
    }
    private GUIAGREGARPRODUCT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegresarMenuProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdAgregarProduct = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAgregarProduct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescripAgregarProduct = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR PRODUCTO");
        getContentPane().add(jLabel3, java.awt.BorderLayout.PAGE_START);

        btnRegresarMenuProducto.setText("Regresar al Menu Producto");
        btnRegresarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarMenuProducto);

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        jLabel4.setText("Id:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtIdAgregarProduct);

        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5);
        jPanel2.add(txtNombreAgregarProduct);

        jLabel6.setText("Descripción:");
        jPanel2.add(jLabel6);
        jPanel2.add(txtDescripAgregarProduct);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuProductoActionPerformed
        GUIMENUPRODUCTO abrir = new GUIMENUPRODUCTO(productService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnRegresarMenuProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
                                                
       
        txtNombreAgregarProduct.requestFocus();
        addOption = true;
        if (txtNombreAgregarProduct.getText().trim().equals("")) {
            Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
            txtNombreAgregarProduct.requestFocus();
            return;
        }
        if(addOption) {
            //Agregar
            addProduct();
            Messages.showMessageDialog("Producto Ingresado","ok");
        } 
     
    /*String nombre = txtNombreAgregarProduct.getText().trim();
    String descripción = txtDescripAgregarProduct.getText().trim();

    // Validar la entrada
    if (nombre.isEmpty()) {
        Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
        return;
    }

    // Crear un nuevo objeto Producto
    Product nuevoProducto = new Product();
    nuevoProducto.setProductName(nombre);
    nuevoProducto.setProductDescripcion(descripción);

    // Llamar al servicio de productos para guardar el producto
    try {
        boolean productoGuardado = productService.saveProduct(nombre, descripción);

        if (productoGuardado) {
            // Limpiar los campos del formulario
            cleanControls();

            // Notificar al usuario del éxito
            Messages.showMessageDialog("Producto Ingresado", "OK");
        } else {
            // Manejar el error al guardar el producto
            Messages.showMessageDialog("Error al guardar el producto", "Error");
        }
    } catch (Exception e) {
        // Manejar errores inesperados
        Messages.showMessageDialog("Error inesperado al guardar el producto", "Error");
        Logger.getLogger(GUIAGREGARPRODUCT.class.getName()).log(Level.SEVERE, null, e);
    }*/


    }//GEN-LAST:event_btnAgregarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAGREGARPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAGREGARPRODUCT().setVisible(true);
            }
        });
    }
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRegresarMenuProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDescripAgregarProduct;
    private javax.swing.JTextField txtIdAgregarProduct;
    private javax.swing.JTextField txtNombreAgregarProduct;
    // End of variables declaration//GEN-END:variables

        private void cleanControls() {
        txtIdAgregarProduct.setText("");
        txtNombreAgregarProduct.setText("");
        txtDescripAgregarProduct.setText("");
    }
        private void stateInitial() {
        txtIdAgregarProduct.setEnabled(true);
        txtNombreAgregarProduct.setEnabled(true);
        txtDescripAgregarProduct.setEnabled(true);

    }
    

    private void addProduct() {
       
        int id = Integer.parseInt(txtIdAgregarProduct.getText());
        String name = txtNombreAgregarProduct.getText().trim();
        String description = txtDescripAgregarProduct.getText().trim();
       // productService.saveProduct(id,name,description);
        if (productService.saveProduct(id,name, description)) {
            Messages.showMessageDialog("Se grabó con éxito", "Atención");
            cleanControls();
        } else {
            Messages.showMessageDialog("Error al grabar, lo siento mucho", "Atención");
        }
    }
    


}


