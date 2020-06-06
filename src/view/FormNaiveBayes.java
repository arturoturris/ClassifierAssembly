package view;

import javax.swing.SpinnerNumberModel;

public class FormNaiveBayes extends javax.swing.JPanel {

    public FormNaiveBayes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoComprobacion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelTipoDeComprobacion = new javax.swing.JPanel();
        cmbFoldValidation = new javax.swing.JRadioButton();
        cmbPrcValidation = new javax.swing.JRadioButton();
        btnComprobar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbArchivoUitilizar = new javax.swing.JComboBox<>();
        numberFolds = new javax.swing.JSpinner();
        validacionPrc = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMeanDeviation = new javax.swing.JTextArea();
        jPanelMatrizDeConfusion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizDeConfusion = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCorrectlyClassified = new javax.swing.JLabel();
        lblBadlyClassified = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnModificarClasificador = new javax.swing.JButton();
        btnEntrenarClasificador = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN DEL CLASIFICADOR"));

        jLabel2.setText("Naive Bayes");

        jLabel1.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
        );

        jPanelTipoDeComprobacion.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE COMPROBACIÓN"));

        tipoComprobacion.add(cmbFoldValidation);
        cmbFoldValidation.setText("Validación cruzada (fold)");
        cmbFoldValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFoldValidationActionPerformed(evt);
            }
        });

        tipoComprobacion.add(cmbPrcValidation);
        cmbPrcValidation.setText("Validación cruzada (%)");
        cmbPrcValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrcValidationActionPerformed(evt);
            }
        });

        btnComprobar.setText("Comprobar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        jLabel7.setText("Utilizar archivo:");

        numberFolds.setModel(new SpinnerNumberModel(2,2,100,1));

        validacionPrc.setModel(new javax.swing.SpinnerNumberModel(50, 1, 50, 1));

        jLabel8.setText("Semilla:");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jEditorPane1.setAutoscrolls(false);
        jScrollPane3.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanelTipoDeComprobacionLayout = new javax.swing.GroupLayout(jPanelTipoDeComprobacion);
        jPanelTipoDeComprobacion.setLayout(jPanelTipoDeComprobacionLayout);
        jPanelTipoDeComprobacionLayout.setHorizontalGroup(
            jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                        .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFoldValidation)
                            .addComponent(cmbPrcValidation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validacionPrc)
                            .addComponent(numberFolds)))
                    .addComponent(btnComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(cmbArchivoUitilizar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTipoDeComprobacionLayout.setVerticalGroup(
            jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbArchivoUitilizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPrcValidation)
                    .addComponent(validacionPrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFoldValidation)
                    .addComponent(numberFolds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprobar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("TABLA MEDIA Y DESVIACIÓN ESTÁNDAR"));

        tblMeanDeviation.setColumns(20);
        tblMeanDeviation.setRows(5);
        jScrollPane4.setViewportView(tblMeanDeviation);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanelMatrizDeConfusion.setBorder(javax.swing.BorderFactory.createTitledBorder("MATRIZ DE CONFUSION"));

        tblMatrizDeConfusion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizDeConfusion);

        jPanel5.setLayout(new java.awt.GridLayout(2, 2));

        jLabel5.setText("Clasificados correctamente:");
        jPanel5.add(jLabel5);

        jLabel6.setText("Clasificados incorrectamente:");
        jPanel5.add(jLabel6);

        lblCorrectlyClassified.setText("n.n%");
        jPanel5.add(lblCorrectlyClassified);

        lblBadlyClassified.setText("n.n%");
        jPanel5.add(lblBadlyClassified);

        javax.swing.GroupLayout jPanelMatrizDeConfusionLayout = new javax.swing.GroupLayout(jPanelMatrizDeConfusion);
        jPanelMatrizDeConfusion.setLayout(jPanelMatrizDeConfusionLayout);
        jPanelMatrizDeConfusionLayout.setHorizontalGroup(
            jPanelMatrizDeConfusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatrizDeConfusionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMatrizDeConfusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMatrizDeConfusionLayout.setVerticalGroup(
            jPanelMatrizDeConfusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatrizDeConfusionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnModificarClasificador.setText("Modificar clasificador");
        btnModificarClasificador.setEnabled(false);
        btnModificarClasificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClasificadorActionPerformed(evt);
            }
        });

        btnEntrenarClasificador.setText("Entrenar Clasificador");
        btnEntrenarClasificador.setEnabled(false);
        btnEntrenarClasificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarClasificadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntrenarClasificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnModificarClasificador)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrenarClasificador)
                    .addComponent(btnModificarClasificador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMatrizDeConfusion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTipoDeComprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTipoDeComprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMatrizDeConfusion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFoldValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFoldValidationActionPerformed

    }//GEN-LAST:event_cmbFoldValidationActionPerformed

    private void cmbPrcValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrcValidationActionPerformed

    }//GEN-LAST:event_cmbPrcValidationActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed

    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnModificarClasificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClasificadorActionPerformed

    }//GEN-LAST:event_btnModificarClasificadorActionPerformed

    private void btnEntrenarClasificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarClasificadorActionPerformed

    }//GEN-LAST:event_btnEntrenarClasificadorActionPerformed

    public void sectionBlocked(boolean b){
        b = !b;
        jLabel7.setEnabled(b);
        cmbArchivoUitilizar.setEnabled(b);
        cmbPrcValidation.setEnabled(b);
        validacionPrc.setEnabled(b);
        cmbFoldValidation.setEnabled(b);
        numberFolds.setEnabled(b);
        btnComprobar.setEnabled(b);
        tblMatrizDeConfusion.setEnabled(b);
        btnEntrenarClasificador.setEnabled(b);
        jEditorPane1.setEnabled(b);
        jLabel8.setEnabled(b);
        tblMeanDeviation.setEnabled(b);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnComprobar;
    public javax.swing.JButton btnEntrenarClasificador;
    public javax.swing.JButton btnModificarClasificador;
    public javax.swing.JComboBox<String> cmbArchivoUitilizar;
    public javax.swing.JRadioButton cmbFoldValidation;
    public javax.swing.JRadioButton cmbPrcValidation;
    public javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelMatrizDeConfusion;
    private javax.swing.JPanel jPanelTipoDeComprobacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblBadlyClassified;
    public javax.swing.JLabel lblCorrectlyClassified;
    public javax.swing.JSpinner numberFolds;
    public javax.swing.JTable tblMatrizDeConfusion;
    public javax.swing.JTextArea tblMeanDeviation;
    private javax.swing.ButtonGroup tipoComprobacion;
    public javax.swing.JSpinner validacionPrc;
    // End of variables declaration//GEN-END:variables
}
