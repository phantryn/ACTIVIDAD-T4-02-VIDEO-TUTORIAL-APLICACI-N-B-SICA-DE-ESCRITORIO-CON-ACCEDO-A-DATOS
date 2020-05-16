
package app;

// librerias
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// primero agregamos la conexion 
// variable persona que se extiende en un jframe
public class persona extends javax.swing.JFrame {
    
    //Asignando la variables staticas
    //Direccion, puerto y nombre de la Base de Datos
   // nombre de nuestra base de dato en MYSQL  
   
    private static final String NombreBD= "World";
  
   // EL URL DONDE ESTA ALMACENADA los datos de NUESTRA BASE DE DATOS
   private static final String URL   = "jdbc:mysql://127.0.0.1/"+NombreBD+"?useUnicode=true&use"
            +"JDBCCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
            +"serverTimezone=UTC";
   
    private static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    private static final String PASSWORD = "12345"; // contraseña del usuario en MYSQL
    
    // variables para poder preparar nuestras consultas y traer el resultado de las consultas
    PreparedStatement ps;
    ResultSet rs;  

    
    
 public static Connection getConection() {
        
     Connection conn = null;

        try {
// el pueto que utilizaremos 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
           
            // cuando la conexion es exitosa saldra este mensaje
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            // en caso que no sea la conexion exitosa mandara un alaerta
            System.out.println(e);
        }
        return conn;
    }
 
 
 
 
 private void limpiarCajas(){
     
     txtClave.setText(null);
     txtNombre.setText(null);
     txtDomicilio.setText(null);
     txtTelefono.setText(null);
     txtEmail.setText(null);
     txtFecha.setText(null);
     cbxGenero.setSelectedIndex(0);
     
 }
    
    public persona() {
        initComponents();
        txtId.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        btnGuarda = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel1.setText("Clave:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("Domicilio:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel7.setText("Genero:");

        cbxGenero.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));

        btnGuarda.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnGuarda.setText("Guardar");
        btnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaActionPerformed(evt);
            }
        });

        btnModifica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnModifica.setText("Modificar");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnElimina.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnElimina.setText("Eliminar");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuarda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(cbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnModifica)
                                .addGap(18, 18, 18)
                                .addComponent(btnElimina)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtDomicilio))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuarda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
       // aqui se hace la transsacion para que los botones creados en la interfaz guarden el registro en la base de datos
        
       Connection con = null;
        
        try{
            // llamamos el metodo que va a traer la conexion 
            con = getConection();
            
            // consultas realizadas
            ps = con.prepareStatement("INSERT INTO persona (clave, nombre, domicilio, telefono, correo_electronico, fecha_nacimiento, genero) VALUES(?,?,?,?,?,?,?) ");
            
            //elementos que vamos a ingresar en las cajas de textos
            ps.setString(1, txtClave.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtDomicilio.getText());
            ps.setString(4, txtTelefono.getText());
            ps.setString(5, txtEmail.getText());
            ps.setDate(6, Date.valueOf(txtFecha.getText()));
            ps.setString(7, cbxGenero.getSelectedItem().toString());
            
             //EJECUCION DE LA CONSULTA
            int res = ps.executeUpdate();
            
             // Evaluacion 
            if(res > 0){
                // mensaje cuando se guardo el registro
                JOptionPane.showMessageDialog(null, "Persona Guardada");
                limpiarCajas();
            } else {
                // si no saldra error en la consulta al guardar
                 JOptionPane.showMessageDialog(null, "Error al Guardar persona");
                 limpiarCajas();
            }
            // cierre de conexion 
            con.close();
           
            // impresion en consola
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
         Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM persona WHERE clave = ?");
            ps.setString(1, txtClave.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtId.setText(rs.getString("id"));
                txtNombre.setText(rs.getString("nombre"));
                txtDomicilio.setText(rs.getString("domicilio"));
                txtTelefono.setText(rs.getString("telefono"));
                txtEmail.setText(rs.getString("correo_electronico"));
                txtFecha.setText(rs.getString("fecha_nacimiento"));
                cbxGenero.setSelectedItem(rs.getString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
 
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("UPDATE persona SET clave=?, nombre=?, domicilio=?, telefono=?, correo_electronico=?, fecha_nacimiento=?, genero=? WHERE id=?");
            ps.setString(1, txtClave.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtDomicilio.getText());
            ps.setString(4, txtTelefono.getText());
            ps.setString(5, txtEmail.getText());
            ps.setDate(6, Date.valueOf(txtFecha.getText()));
            ps.setString(7, cbxGenero.getSelectedItem().toString());
            ps.setString(8, txtId.getText());
            
            // igualamos la execucion 
            int res = ps.executeUpdate();
            // evaluamos la ejecucion 
            if(res > 0){
                // mensaje cuando se guarde el registro
                JOptionPane.showMessageDialog(null, "Persona Modificada");
                limpiarCajas();
            } else {
                // mensaje de error al guardar persona
                 JOptionPane.showMessageDialog(null, "Error al Modificar persona");
                 limpiarCajas();
            }
            // cerramos la conexion 
            con.close();
            
        //colocomos la exepcion y lo imprimimos en la consola
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
       
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM persona WHERE id=?");
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Eliminada");
                limpiarCajas();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar persona");
                 limpiarCajas();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModifica;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
