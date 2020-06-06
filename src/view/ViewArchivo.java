package view;

public class ViewArchivo extends javax.swing.JPanel {

    public ViewArchivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelArchivo = new javax.swing.JPanel();
        jPanelConjuntoDeEntrenamiento = new javax.swing.JPanel();
        btnArchivoReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputArchivoRuta = new javax.swing.JTextField();
        btnArchivoFile = new javax.swing.JButton();
        btnArchivoCargar = new javax.swing.JButton();
        jPanelInformacionDelArchivo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblArchivoNombre = new javax.swing.JLabel();
        lblArchivoFormato = new javax.swing.JLabel();
        lblArchivoRegistros = new javax.swing.JLabel();
        lblArchivoClases = new javax.swing.JLabel();
        lblArchivoAtributos = new javax.swing.JLabel();
        lblArchivoNumericos = new javax.swing.JLabel();
        lblArchivoNominales = new javax.swing.JLabel();
        jPanelDatosDelConjuntoDeEntrenamiento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArchivoConjuntoEntrenamiento = new javax.swing.JTable();

        jPanelConjuntoDeEntrenamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("CONJUNTO DE ENTRENAMIENTO"));

        btnArchivoReiniciar.setText("Reiniciar");
        btnArchivoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Archivo:");

        inputArchivoRuta.setEnabled(false);

        btnArchivoFile.setText("...");
        btnArchivoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoFileActionPerformed(evt);
            }
        });

        btnArchivoCargar.setText("Cargar");
        btnArchivoCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConjuntoDeEntrenamientoLayout = new javax.swing.GroupLayout(jPanelConjuntoDeEntrenamiento);
        jPanelConjuntoDeEntrenamiento.setLayout(jPanelConjuntoDeEntrenamientoLayout);
        jPanelConjuntoDeEntrenamientoLayout.setHorizontalGroup(
            jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(inputArchivoRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivoFile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArchivoCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivoReiniciar)
                .addContainerGap())
        );
        jPanelConjuntoDeEntrenamientoLayout.setVerticalGroup(
            jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(inputArchivoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnArchivoFile)
                .addComponent(btnArchivoCargar)
                .addComponent(btnArchivoReiniciar))
        );

        jPanelInformacionDelArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del archivo"));
        jPanelInformacionDelArchivo.setLayout(new java.awt.GridLayout(2, 7, 0, 10));

        jLabel2.setText("Nombre");
        jPanelInformacionDelArchivo.add(jLabel2);

        jLabel3.setText("Formato");
        jPanelInformacionDelArchivo.add(jLabel3);

        jLabel4.setText("Registros");
        jPanelInformacionDelArchivo.add(jLabel4);

        jLabel5.setText("Número de clases");
        jPanelInformacionDelArchivo.add(jLabel5);

        jLabel6.setText("Número de atributos");
        jPanelInformacionDelArchivo.add(jLabel6);

        jLabel7.setText("Atributos numericos");
        jPanelInformacionDelArchivo.add(jLabel7);

        jLabel8.setText("Atributos nominales");
        jPanelInformacionDelArchivo.add(jLabel8);

        lblArchivoNombre.setText("Name");
        jPanelInformacionDelArchivo.add(lblArchivoNombre);

        lblArchivoFormato.setText("format");
        jPanelInformacionDelArchivo.add(lblArchivoFormato);

        lblArchivoRegistros.setText("n");
        jPanelInformacionDelArchivo.add(lblArchivoRegistros);

        lblArchivoClases.setText("n");
        jPanelInformacionDelArchivo.add(lblArchivoClases);

        lblArchivoAtributos.setText("n");
        jPanelInformacionDelArchivo.add(lblArchivoAtributos);

        lblArchivoNumericos.setText("n");
        jPanelInformacionDelArchivo.add(lblArchivoNumericos);

        lblArchivoNominales.setText("n");
        jPanelInformacionDelArchivo.add(lblArchivoNominales);

        jPanelDatosDelConjuntoDeEntrenamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL CONJUNTO DE ENTRENAMIENTO"));

        tblArchivoConjuntoEntrenamiento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblArchivoConjuntoEntrenamiento.setCellSelectionEnabled(true);
        tblArchivoConjuntoEntrenamiento.setShowGrid(true);
        tblArchivoConjuntoEntrenamiento.setShowHorizontalLines(false);
        tblArchivoConjuntoEntrenamiento.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblArchivoConjuntoEntrenamiento);

        javax.swing.GroupLayout jPanelDatosDelConjuntoDeEntrenamientoLayout = new javax.swing.GroupLayout(jPanelDatosDelConjuntoDeEntrenamiento);
        jPanelDatosDelConjuntoDeEntrenamiento.setLayout(jPanelDatosDelConjuntoDeEntrenamientoLayout);
        jPanelDatosDelConjuntoDeEntrenamientoLayout.setHorizontalGroup(
            jPanelDatosDelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosDelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelDatosDelConjuntoDeEntrenamientoLayout.setVerticalGroup(
            jPanelDatosDelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosDelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelArchivoLayout = new javax.swing.GroupLayout(jPanelArchivo);
        jPanelArchivo.setLayout(jPanelArchivoLayout);
        jPanelArchivoLayout.setHorizontalGroup(
            jPanelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConjuntoDeEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformacionDelArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addComponent(jPanelDatosDelConjuntoDeEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelArchivoLayout.setVerticalGroup(
            jPanelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConjuntoDeEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInformacionDelArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDatosDelConjuntoDeEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoReiniciarActionPerformed

    }//GEN-LAST:event_btnArchivoReiniciarActionPerformed

    private void btnArchivoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoFileActionPerformed

    }//GEN-LAST:event_btnArchivoFileActionPerformed

    private void btnArchivoCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoCargarActionPerformed

    }//GEN-LAST:event_btnArchivoCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnArchivoCargar;
    public javax.swing.JButton btnArchivoFile;
    public javax.swing.JButton btnArchivoReiniciar;
    public javax.swing.JTextField inputArchivoRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelArchivo;
    private javax.swing.JPanel jPanelConjuntoDeEntrenamiento;
    private javax.swing.JPanel jPanelDatosDelConjuntoDeEntrenamiento;
    private javax.swing.JPanel jPanelInformacionDelArchivo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblArchivoAtributos;
    public javax.swing.JLabel lblArchivoClases;
    public javax.swing.JLabel lblArchivoFormato;
    public javax.swing.JLabel lblArchivoNombre;
    public javax.swing.JLabel lblArchivoNominales;
    public javax.swing.JLabel lblArchivoNumericos;
    public javax.swing.JLabel lblArchivoRegistros;
    public javax.swing.JTable tblArchivoConjuntoEntrenamiento;
    // End of variables declaration//GEN-END:variables
}
