package view;

public class ViewClasificadores extends javax.swing.JPanel {

    public ViewClasificadores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelClasificadores = new javax.swing.JPanel();
        jPanelInformaciónDeEnsamble = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNumClasificadores = new javax.swing.JLabel();
        lblPrcExactitud = new javax.swing.JLabel();
        jPanelSeleccionClasificadores = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnClasificadoresAgregar = new javax.swing.JButton();
        btnClasificadoresReiniciar = new javax.swing.JButton();
        cmbClasificadoresClasificadores = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelListaClasificadores = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        jPanelInformaciónDeEnsamble.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN DEL ENSAMBLE"));
        jPanelInformaciónDeEnsamble.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Núm. de clasificadores");
        jPanel2.add(jLabel9);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Exactitud del ensamble");
        jPanel2.add(jLabel11);

        lblNumClasificadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumClasificadores.setText("n");
        jPanel2.add(lblNumClasificadores);

        lblPrcExactitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrcExactitud.setText("n");
        jPanel2.add(lblPrcExactitud);

        jPanelInformaciónDeEnsamble.add(jPanel2);

        jPanelSeleccionClasificadores.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCIÓN DE CLASIFICADORES"));

        btnClasificadoresAgregar.setText("Agregar");
        btnClasificadoresAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificadoresAgregarActionPerformed(evt);
            }
        });

        btnClasificadoresReiniciar.setText("Reiniciar");
        btnClasificadoresReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificadoresReiniciarActionPerformed(evt);
            }
        });

        jLabel13.setText("Clasificador:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbClasificadoresClasificadores, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClasificadoresAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnClasificadoresReiniciar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btnClasificadoresAgregar)
                    .addComponent(btnClasificadoresReiniciar)
                    .addComponent(cmbClasificadoresClasificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        jPanelListaClasificadores.setLayout(new javax.swing.BoxLayout(jPanelListaClasificadores, javax.swing.BoxLayout.Y_AXIS));
        jPanel1.add(jPanelListaClasificadores);
        jPanel1.add(filler2);
        jPanel1.add(filler3);

        javax.swing.GroupLayout jPanelSeleccionClasificadoresLayout = new javax.swing.GroupLayout(jPanelSeleccionClasificadores);
        jPanelSeleccionClasificadores.setLayout(jPanelSeleccionClasificadoresLayout);
        jPanelSeleccionClasificadoresLayout.setHorizontalGroup(
            jPanelSeleccionClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionClasificadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSeleccionClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSeleccionClasificadoresLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSeleccionClasificadoresLayout.setVerticalGroup(
            jPanelSeleccionClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionClasificadoresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelClasificadoresLayout = new javax.swing.GroupLayout(jPanelClasificadores);
        jPanelClasificadores.setLayout(jPanelClasificadoresLayout);
        jPanelClasificadoresLayout.setHorizontalGroup(
            jPanelClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClasificadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInformaciónDeEnsamble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSeleccionClasificadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelClasificadoresLayout.setVerticalGroup(
            jPanelClasificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClasificadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInformaciónDeEnsamble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSeleccionClasificadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelClasificadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelClasificadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClasificadoresAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificadoresAgregarActionPerformed

    }//GEN-LAST:event_btnClasificadoresAgregarActionPerformed

    private void btnClasificadoresReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificadoresReiniciarActionPerformed

    }//GEN-LAST:event_btnClasificadoresReiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClasificadoresAgregar;
    public javax.swing.JButton btnClasificadoresReiniciar;
    public javax.swing.JComboBox<String> cmbClasificadoresClasificadores;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelClasificadores;
    private javax.swing.JPanel jPanelInformaciónDeEnsamble;
    public javax.swing.JPanel jPanelListaClasificadores;
    private javax.swing.JPanel jPanelSeleccionClasificadores;
    public javax.swing.JLabel lblNumClasificadores;
    public javax.swing.JLabel lblPrcExactitud;
    // End of variables declaration//GEN-END:variables
}
