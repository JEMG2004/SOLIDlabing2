
package co.com.hyunseda.market.presentation;


import co.com.hyunseda.market.service.CategoryService;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Laura Sofia
 */
public class GUIAGREGARCATEGORIA extends javax.swing.JFrame {
    
    private CategoryService categoryService;
     private boolean addOption = true;

    /**
     * Creates new form GUIMENUCATEGORIA
     */
    public GUIAGREGARCATEGORIA(CategoryService categoryService) {
        
        initComponents();
        this.categoryService = categoryService;
    
     
    }

    private GUIAGREGARCATEGORIA() {
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
        btnRegresarMenuCategoria = new javax.swing.JButton();
        btnAgregarCategoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdAgregarCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAgregarCategoria = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR CATEGORIA");
        getContentPane().add(jLabel3, java.awt.BorderLayout.PAGE_START);

        btnRegresarMenuCategoria.setText("Regresar al Menu Categoria");
        btnRegresarMenuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarMenuCategoria);

        btnAgregarCategoria.setText("Agregar Categoria");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCategoria);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jLabel4.setText("Id:");
        jPanel2.add(jLabel4);
        jPanel2.add(txtIdAgregarCategoria);

        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5);
        jPanel2.add(txtNombreAgregarCategoria);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuCategoriaActionPerformed
        GUIMENUCATEGORIA abrir = new GUIMENUCATEGORIA(categoryService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnRegresarMenuCategoriaActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
                                                
    String inputText = txtIdAgregarCategoria.getText();
    int id = Integer.parseInt(inputText);
    String nombre = txtIdAgregarCategoria.getText().trim();

    // Validar la entrada
    if (nombre.isEmpty()) {
        Messages.showMessageDialog("Debe ingresar el nombre de la categoria ", "Atención");
        return;
    }

    // Crear un nuevo objeto 


    // Llamar al servicio de productos para guardar el producto
    try {
        boolean categoriaGuardada = categoryService.saveCategory(id,nombre);

        if (categoriaGuardada) {
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
        Logger.getLogger(GUIAGREGARCATEGORIA.class.getName()).log(Level.SEVERE, null, e);
    }


    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAGREGARCATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARCATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARCATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAGREGARCATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAGREGARCATEGORIA().setVisible(true);
            }
        });
    }
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnRegresarMenuCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdAgregarCategoria;
    private javax.swing.JTextField txtNombreAgregarCategoria;
    // End of variables declaration//GEN-END:variables

        private void cleanControls() {
        txtNombreAgregarCategoria.setText("");
        txtIdAgregarCategoria.setText("");
    }
        private void stateInitial() {
        txtNombreAgregarCategoria.setEnabled(false);
        txtIdAgregarCategoria.setEnabled(true);

    }
    

    private void addProduct() {
        
        
        
        int id = Integer.parseInt(txtIdAgregarCategoria.getText());
        String name = txtIdAgregarCategoria.getText().trim();
       
        if (categoryService.saveCategory(id,name)) {
            Messages.showMessageDialog("Se grabó con éxito", "Atención");
            cleanControls();
            //stateInitial();
        } else {
            Messages.showMessageDialog("Error al grabar, lo siento mucho", "Atención");
        }
    }
    


}


