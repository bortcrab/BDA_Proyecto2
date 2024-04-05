/*
 * FrmLicenciaRecibo.java
 */
package presentacion;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import java.text.SimpleDateFormat;
import utilidades.FormatoDinero;

/**
 * Ventana donde se muestran los datos de la licencia generada.
 * @author Diego Valenzuela Parra - 00000247700
 * @author Juventino López García - 00000248547
 */
public class FrmLicenciaRecibo extends javax.swing.JFrame {

    private PersonaDTO persona;
    private LicenciaDTO licencia;
        
    /**
     * Constructor de la ventana.
     * @param persona Persona que solicita la licencia.
     * @param licencia Licencia generada.
     */
    public FrmLicenciaRecibo(PersonaDTO persona, LicenciaDTO licencia) {
        initComponents();
        this.persona = persona;
        this.licencia = licencia;
        mostrarDatos();
    }
    
    /**
     * Método para mostrar los datos de la licencia.
     */
    private void mostrarDatos() {
        // Creamos una instancia para darle formato al dinero.
        FormatoDinero fd = new FormatoDinero();
        
        lblSolicitante.setText(
                  persona.getNombre() + " "
                + persona.getApellidoPaterno() + " "
                + persona.getApellidoMaterno());
        
        lblCosto.setText(fd.formatear(licencia.getCosto()));
        
        // Creamos una instancia para darle formato a la fecha de emisión.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        lblFechaEmision.setText(sdf.format(licencia.getFechaEmision().getTime()));
        
        lblVigencia.setText(licencia.getTarifa().getVigencia());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSolicitante = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblVigencia = new javax.swing.JLabel();
        lblFechaEmision = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenido.setBackground(new java.awt.Color(11, 35, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 149, 92));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trámite completado");

        btnContinuar.setBackground(new java.awt.Color(106, 27, 49));
        btnContinuar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(242, 242, 242));
        btnContinuar.setText("Continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 149, 92));
        jLabel2.setText("Tipo de trámite:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(188, 149, 92));
        jLabel6.setText("Licencia");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(188, 149, 92));
        jLabel8.setText("Solicitante:");

        lblSolicitante.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblSolicitante.setForeground(new java.awt.Color(188, 149, 92));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(188, 149, 92));
        jLabel10.setText("Costo:");

        lblCosto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(188, 149, 92));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(188, 149, 92));
        jLabel12.setText("Fecha de emisión:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(188, 149, 92));
        jLabel13.setText("Vigencia:");

        lblVigencia.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblVigencia.setForeground(new java.awt.Color(188, 149, 92));

        lblFechaEmision.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblFechaEmision.setForeground(new java.awt.Color(188, 149, 92));

        jSeparator1.setBackground(new java.awt.Color(188, 149, 92));
        jSeparator1.setForeground(new java.awt.Color(188, 149, 92));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlContenidoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVigencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlContenidoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSolicitante))
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblCosto))
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblFechaEmision))
                .addGap(18, 18, 18)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblVigencia))
                .addGap(18, 18, 18)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que reacciona al evento de dar clic en el botón para continuar.
     * @param evt Evento del mouse al que se escucha.
     */
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        FrmHome frmHome = new FrmHome();
        frmHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFechaEmision;
    private javax.swing.JLabel lblSolicitante;
    private javax.swing.JLabel lblVigencia;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables

}
