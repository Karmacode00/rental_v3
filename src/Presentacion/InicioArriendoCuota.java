/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Logica.Arriendo;
import Logica.ArriendoCuota;
import Logica.Cliente;
import Logica.CuotaArriendo;
import Logica.Vehiculo;

import static Presentacion.Inicio.escritorio;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Datos.AdministradorArrays;

/**
 *
 * @author Manuel Cano
 */
public final class InicioArriendoCuota extends javax.swing.JInternalFrame {

    /**
     * Creates new form inicioArriendoCuota
     */
    public static double vValorCuota;
    public static double totalPagar = 0;
    private ArrayList<ArriendoCuota> arriendoCuota;
    AdministradorArrays administradorArray;
    private ArrayList<Arriendo> listaArriendos;

    public InicioArriendoCuota() {
        initComponents();
        Vehiculo.initVehiculos();

        Arriendo.initArriendos();
        listaArriendos = Arriendo.getArriendos();

        administradorArray = new AdministradorArrays();
        administradorArray.llenarCboClientes(InicioArriendoCuota.cboClientes);
        administradorArray.llenarCboVehiculos();

        // //cboClientes.addItem(administradorArray.retornaInformacionCliente());
        this.setSize(new Dimension(850, 450));
        this.setMinimumSize(new Dimension(200, 200));

        // ArriendoCuota ac= new ArriendoCuota(ALLBITS);
    }

    public void calcularCuota() {
        int cantDia = 0;// diferencia entre total venta y total pagar
        int nroCuotas = 0;// SUB TOTAL
        double valorDia = 0;
        double valorCuota = 0;

        DecimalFormat formato = new DecimalFormat("$ #,###"); // $#,###
        nroCuotas = Integer.parseInt(txtNroCuotas.getText());
        String txtCantDiasStr = txtCantDias.getText();
        String txtPrecioDiaStr = txtPrecioDia.getText();
        cantDia = (txtCantDiasStr.isEmpty()) ? 0 : Integer.parseInt(txtCantDiasStr);
        valorDia = (txtPrecioDiaStr.isEmpty()) ? 0 : Double.parseDouble(txtPrecioDiaStr);

        totalPagar = valorDia * cantDia;

        valorCuota = totalPagar / nroCuotas;

        txtMontoPagar.setText(formato.format(totalPagar));// Lo que se muestra en la Interfaz grafica
        vValorCuota = valorCuota;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboClientes = new javax.swing.JComboBox<>();
        cboSeleccionAutomovil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMontoPagar = new javax.swing.JTextField();
        txtPrecioDia = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtCantDias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaArriendo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNroCuotas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaListado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Seleccione Cliente" }));
        getContentPane().add(cboClientes);
        cboClientes.setBounds(130, 60, 218, 35);

        cboSeleccionAutomovil.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Seleccione Auotmovil" }));
        getContentPane().add(cboSeleccionAutomovil);
        cboSeleccionAutomovil.setBounds(430, 60, 290, 35);

        jLabel1.setText("Monto Pagado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 330, 120, 30);

        jButton1.setText("Pagar Primera Cuota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 370, 200, 35);

        txtMontoPagar.setEditable(false);
        getContentPane().add(txtMontoPagar);
        txtMontoPagar.setBounds(160, 330, 80, 30);

        txtPrecioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioDiaActionPerformed(evt);
            }
        });
        txtPrecioDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioDiaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecioDia);
        txtPrecioDia.setBounds(160, 290, 80, 30);

        jTextField3.setText("20-03-2023");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 200, 110, 30);

        txtCantDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantDiasKeyReleased(evt);
            }
        });
        getContentPane().add(txtCantDias);
        txtCantDias.setBounds(160, 250, 80, 30);

        jLabel2.setText("Cant Dias:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 250, 120, 30);

        txtFechaArriendo.setText("Fecha Arriendo:");
        getContentPane().add(txtFechaArriendo);
        txtFechaArriendo.setBounds(50, 200, 140, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CUOTAS A PAGAR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 150, 260, 30);

        jButton2.setText("Ingresar Nuevo Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 110, 210, 30);

        jLabel5.setText("Pagada?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(720, 180, 70, 30);

        txtNroCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNroCuotasKeyReleased(evt);
            }
        });
        getContentPane().add(txtNroCuotas);
        txtNroCuotas.setBounds(420, 200, 70, 35);

        jtaListado.setColumns(20);
        jtaListado.setRows(5);
        jtaListado.setEditable(false);
        jScrollPane1.setViewportView(jtaListado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 210, 300, 150);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad de Cuotas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 200, 130, 30);

        jLabel7.setText("Numero");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 180, 90, 30);

        jLabel8.setText("Valor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 180, 80, 30);

        jLabel9.setText("Precio por dia:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 290, 120, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ARRIENDOS CON CUOTAS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 15, 260, 30);

        btnGuardar.setText("Guardar Arriendo ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(290, 250, 200, 35);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(730, 370, 90, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PagarCuota form = new PagarCuota();
        escritorio.add(form);
        try {
            form.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        IngresoCliente form = new IngresoCliente();
        escritorio.add(form);
        try {
            form.setMaximum(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void txtPrecioDiaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPrecioDiaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPrecioDiaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String clienteSeleccionado = cboClientes.getSelectedItem().toString();
        String vehiculoSeleccionado = cboSeleccionAutomovil.getSelectedItem().toString();

        Cliente clienteEncontrado = Cliente.getCliente(clienteSeleccionado);
        Vehiculo vehiculoEncontrado = Vehiculo.getVehiculo(vehiculoSeleccionado);

        Boolean valido = Arriendo.validarArriendo(clienteEncontrado, vehiculoEncontrado);
        if (valido) {
            vehiculoEncontrado.setCondicion('A');
            Vehiculo vehiculoArrendado = Vehiculo.getVehiculo(vehiculoSeleccionado);

            String fecha = txtFechaArriendo.getText();
            int diasArriendo = Integer.parseInt(txtCantDias.getText());
            double montoTotal = totalPagar;
            int nroCuotas = Integer.parseInt(txtNroCuotas.getText());
            int numNuevoArriendo = listaArriendos.size();
            double montoCuota = Math.round(vValorCuota);

            ArrayList<CuotaArriendo> cuotasArriendo = new ArrayList<CuotaArriendo>();

            for (int i = 0; i < nroCuotas; i++) {
                int nroCuota = i + 1;
                CuotaArriendo nuevaCuota = new CuotaArriendo(nroCuota, montoCuota, false);
                cuotasArriendo.add(nuevaCuota);
                jtaListado.append("  " + nroCuota + "\t" + montoCuota
                        + "\t  " + "false" + "\n");
            }
            Arriendo nuevoArriendo = new Arriendo(numNuevoArriendo, fecha, diasArriendo, clienteEncontrado,
                    vehiculoArrendado, montoTotal,
                    nroCuotas, cuotasArriendo);
            listaArriendos.add(nuevoArriendo);

        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_btnSalirActionPerformed

    private void txtCantDiasKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtCantDiasKeyReleased
        // TODO add your handling code here:
        if (txtPrecioDia.getText().equals("")) {

        } else {
            calcularCuota();
        }
    }// GEN-LAST:event_txtCantDiasKeyReleased

    private void txtPrecioDiaKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPrecioDiaKeyReleased
        // TODO add your handling code here:
        if (txtCantDias.getText().equals("")) {
        } else {
            calcularCuota();
        }
    }// GEN-LAST:event_txtPrecioDiaKeyReleased

    private void txtNroCuotasKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNroCuotasKeyReleased
        // TODO add your handling code here:
        if (txtNroCuotas.getText().equals("")) {

        } else {
            calcularCuota();
        }
    }// GEN-LAST:event_txtNroCuotasKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioArriendoCuota.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioArriendoCuota.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioArriendoCuota.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioArriendoCuota.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioArriendoCuota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox<String> cboClientes;
    public static javax.swing.JComboBox<String> cboSeleccionAutomovil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtFechaArriendo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea jtaListado;
    private javax.swing.JTextField txtCantDias;
    private javax.swing.JTextField txtMontoPagar;
    private javax.swing.JTextField txtNroCuotas;
    private javax.swing.JTextField txtPrecioDia;
    // End of variables declaration//GEN-END:variables
}