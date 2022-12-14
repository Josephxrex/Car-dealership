/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph
 */
public class FormAuto extends javax.swing.JFrame {

    /**
     * Creates new form FormAuto
     */
    public FormAuto() {
        initComponents();
        setLocationRelativeTo(null);
        Crear_Modelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Unidades = new javax.swing.JTextField();
        txt_Marca = new javax.swing.JTextField();
        txt_Modelo = new javax.swing.JTextField();
        txt_Costo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Equipamiento = new javax.swing.JTextArea();
        btn_Guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Autos = new javax.swing.JTable();
        btn_Consultar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Equipamiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Costo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NumUnidades:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txt_Unidades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txt_Unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 130, -1));

        txt_Marca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txt_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, -1));

        txt_Modelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txt_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, -1));

        txt_Costo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txt_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, -1));

        txt_Equipamiento.setColumns(20);
        txt_Equipamiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_Equipamiento.setRows(5);
        jScrollPane1.setViewportView(txt_Equipamiento);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 286, 94));

        btn_Guardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 22, -1, -1));

        Tabla_Autos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla_Autos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 74, 560, 370));

        btn_Consultar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 22, -1, -1));

        btn_Actualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 22, -1, -1));

        btn_Eliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 22, -1, -1));

        Salir.setBackground(new java.awt.Color(153, 0, 0));
        Salir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        Regresar.setBackground(new java.awt.Color(153, 0, 0));
        Regresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        ConexionBD Con = new ConexionBD();
        Con.ConectarBD();
        String Marca =txt_Marca.getText();
        String Modelo=txt_Modelo.getText();
        String CostoString=txt_Costo.getText();
        String UnidadesDString=txt_Unidades.getText();
        String Equipamiento=txt_Equipamiento.getText();
        if(!Marca.isEmpty()){
            if(!Modelo.isEmpty()){
               if(!CostoString.isEmpty()){
                   if(!UnidadesDString.isEmpty()){
                      if(!Equipamiento.isEmpty()){
                        try{
                           double costo=Double.valueOf(CostoString);
                           int unidad=Integer.valueOf(UnidadesDString);
                           String SQL ="call InsertarAuto('"+Marca+"','"+Modelo+"','"+Equipamiento+"',"+costo+","+unidad+");";
                           Con.sentencia.execute(SQL);
                           JOptionPane.showMessageDialog(null, "Los Datos fueron Insertados con exito");
                           }catch (SQLException ex) {
                            Logger.getLogger(FormAuto.class.getName()).log(Level.SEVERE, null, ex);
                           }
                      }else {
                            JOptionPane.showMessageDialog(null, "Ingrese el Equipamiento");
                      }
                   }else {
                             JOptionPane.showMessageDialog(null, "Ingrese las unidades");
                         }
               }else{
                             JOptionPane.showMessageDialog(null, "Ingrese el costo del automovil");
                         }
            }else{
                             JOptionPane.showMessageDialog(null, "Ingrese el modelo");
                         }
        
        }else{
                             JOptionPane.showMessageDialog(null, "Ingrese la marca del automovil");
                         }
        Con.DesconectarBD();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        String VIN = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 0).toString();
        String Marca = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 1).toString();
        String Modelo = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 2).toString();
        String Equipamiento = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 3).toString();
        String Costo = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 4).toString();
        String UnidadesD = Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(), 5).toString();
        ActualizarAuto Act = new ActualizarAuto(null, true);
        Act.Atxt_VIN.setText(VIN);
        Act.Atxt_Marca.setText(Marca);
        Act.Atxt_Modelo.setText(Modelo);
        Act.Atxt_Equipamiento.setText(Equipamiento);
        Act.Atxt_Costo.setText(Costo);
        Act.Atxt_Unidades.setText(UnidadesD);
        Act.setVisible(true);
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
       try{
       String VIN=Tabla_Autos.getValueAt(Tabla_Autos.getSelectedRow(),0).toString();
       ConexionBD Con=new ConexionBD();
       Con.ConectarBD();
       String SQL="DELETE FROM autos WHERE VIN='"+VIN+"'";
       Con.sentencia.execute(SQL);
       JOptionPane.showMessageDialog(null,"El registro fue eliminado");
       Con.DesconectarBD();
      }catch(SQLException ex){
        Logger.getLogger(FormAuto.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        MenuADM adm=new MenuADM();
        adm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FormAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAuto().setVisible(true);
            }
        });
    }
     DefaultTableModel modelo;

    private void Crear_Modelo() {
        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                       "VIN", "Marca", "Modelo","Equipamiento","Costo","UnidadesD"}) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class,
                   
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }
            });
            Tabla_Autos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "Error");
        }
    }
    private void Consultar() {
        try {
            int i = 0;
            Object ob[] = null;
            ConexionBD Con = new ConexionBD();
            Con.ConectarBD();
            String SQL = "SELECT * FROM autos";
            Con.resultado = Con.sentencia.executeQuery(SQL);
            while (Con.resultado.next()) {
                modelo.addRow(ob);
                modelo.setValueAt(Con.resultado.getString("VIN"), i, 0);
                modelo.setValueAt(Con.resultado.getString("Marca"), i, 1);
                modelo.setValueAt(Con.resultado.getString("Modelo"), i, 2);
                modelo.setValueAt(Con.resultado.getString("Equipamiento"), i, 3);
                modelo.setValueAt(Con.resultado.getString("Costo"), i, 4);
                modelo.setValueAt(Con.resultado.getString("UnidadesD"), i, 5);
                i++;
            }
            Con.DesconectarBD();

        } catch (SQLException ex) {
            Logger.getLogger(FormAuto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla_Autos;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Costo;
    private javax.swing.JTextArea txt_Equipamiento;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_Unidades;
    // End of variables declaration//GEN-END:variables
}
