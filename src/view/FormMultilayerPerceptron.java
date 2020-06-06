package view;

import java.awt.Component;
import javax.swing.SpinnerNumberModel;

public class FormMultilayerPerceptron extends javax.swing.JPanel {

    public FormMultilayerPerceptron() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoComprobacion = new javax.swing.ButtonGroup();
        jPanelConfiguracion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spnLearningRate = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnMomentum = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spnNumEpochs = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtNodes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        spnSeed = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanelTipoDeComprobacion = new javax.swing.JPanel();
        cmbFoldValidation = new javax.swing.JRadioButton();
        cmbPrcValidation = new javax.swing.JRadioButton();
        btnComprobar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbArchivoUitilizar = new javax.swing.JComboBox<>();
        numberFolds = new javax.swing.JSpinner();
        validacionPrc = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelMatrizDeConfusion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizDeConfusion = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCorrectlyClassified = new javax.swing.JLabel();
        lblBadlyClassified = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnModificarClasificador = new javax.swing.JButton();
        btnEntrenarClasificador = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(388, 540));

        jPanelConfiguracion.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIGURACION"));
        jPanelConfiguracion.setLayout(new java.awt.GridLayout(6, 2, 0, 5));

        jLabel3.setText("Tasa de aprendizaje:");
        jPanelConfiguracion.add(jLabel3);

        spnLearningRate.setModel(new SpinnerNumberModel(0.3,0.0,1.0,0.01));
        jPanelConfiguracion.add(spnLearningRate);

        jLabel4.setText("Momentum:");
        jPanelConfiguracion.add(jLabel4);

        spnMomentum.setModel(new SpinnerNumberModel(0.2,0.0,1.0,0.01));
        jPanelConfiguracion.add(spnMomentum);

        jLabel9.setText("Núm. epocas:");
        jPanelConfiguracion.add(jLabel9);

        spnNumEpochs.setModel(new SpinnerNumberModel(500,1,50000,1));
        jPanelConfiguracion.add(spnNumEpochs);

        jLabel10.setText("Nodos por capa:");
        jPanelConfiguracion.add(jLabel10);

        txtNodes.setText("a");
        txtNodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNodesActionPerformed(evt);
            }
        });
        jPanelConfiguracion.add(txtNodes);

        jLabel11.setText("Semilla:");
        jPanelConfiguracion.add(jLabel11);

        spnSeed.setModel(new SpinnerNumberModel(0,0,999999999,1));
        jPanelConfiguracion.add(spnSeed);
        jPanelConfiguracion.add(filler1);

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

        jEditorPane1.setAutoscrolls(false);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validacionPrc)
                            .addComponent(numberFolds)))
                    .addComponent(btnComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTipoDeComprobacionLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(cmbArchivoUitilizar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoDeComprobacionLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEditorPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTipoDeComprobacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditorPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprobar))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN DEL CLASIFICADOR"));

        jLabel1.setText("Tipo:");

        jLabel2.setText("Multilayer Perceptron");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
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
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMatrizDeConfusionLayout.setVerticalGroup(
            jPanelMatrizDeConfusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatrizDeConfusionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        btnEntrenarClasificador.setText("Entrenar clasificador");
        btnEntrenarClasificador.setEnabled(false);
        btnEntrenarClasificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarClasificadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntrenarClasificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarClasificador)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMatrizDeConfusion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelTipoDeComprobacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTipoDeComprobacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMatrizDeConfusion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrenarClasificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarClasificadorActionPerformed

    }//GEN-LAST:event_btnEntrenarClasificadorActionPerformed

    private void cmbPrcValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrcValidationActionPerformed

    }//GEN-LAST:event_cmbPrcValidationActionPerformed

    private void cmbFoldValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFoldValidationActionPerformed

    }//GEN-LAST:event_cmbFoldValidationActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed

    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnModificarClasificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClasificadorActionPerformed

    }//GEN-LAST:event_btnModificarClasificadorActionPerformed

    private void txtNodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNodesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNodesActionPerformed

    public void sectionBlocked(boolean b){
        b = !b;
        
        //DISABLING CONFIGURATION PANE
        for(Component c : jPanelConfiguracion.getComponents()){
            c.setEnabled(b);
        }
        
        //DISABLING TIPO DE COMPROBACION PANE
        for(Component c : jPanelTipoDeComprobacion.getComponents()){
            c.setEnabled(b);
        }
        
        //DISABLING MATRIZ DE CONFUSION PANE
        for(Component c : jPanelMatrizDeConfusion.getComponents()){
            c.setEnabled(b);
        }
        
        btnEntrenarClasificador.setEnabled(b);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnComprobar;
    public javax.swing.JButton btnEntrenarClasificador;
    public javax.swing.JButton btnModificarClasificador;
    public javax.swing.JComboBox<String> cmbArchivoUitilizar;
    public javax.swing.JRadioButton cmbFoldValidation;
    public javax.swing.JRadioButton cmbPrcValidation;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanelConfiguracion;
    public javax.swing.JPanel jPanelMatrizDeConfusion;
    public javax.swing.JPanel jPanelTipoDeComprobacion;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblBadlyClassified;
    public javax.swing.JLabel lblCorrectlyClassified;
    public javax.swing.JSpinner numberFolds;
    public javax.swing.JSpinner spnLearningRate;
    public javax.swing.JSpinner spnMomentum;
    public javax.swing.JSpinner spnNumEpochs;
    public javax.swing.JSpinner spnSeed;
    public javax.swing.JTable tblMatrizDeConfusion;
    private javax.swing.ButtonGroup tipoComprobacion;
    public javax.swing.JTextField txtNodes;
    public javax.swing.JSpinner validacionPrc;
    // End of variables declaration//GEN-END:variables
}
