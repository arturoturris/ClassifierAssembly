package view;

import java.awt.CardLayout;

public class ViewPrueba extends javax.swing.JPanel {

    public ViewPrueba() {
        initComponents();
        CardLayout card = (CardLayout)jPanelOpcionArchivo.getLayout();
        card.show(jPanelOpcionArchivo, "card3");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelIndividual = new javax.swing.JPanel();
        jPanelEvaluacion = new javax.swing.JPanel();
        jPanelEvaluacionIndividual = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIndividualEvaluation = new javax.swing.JTable();
        jPanelResultadosEvaluacion = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblClassPredicted = new javax.swing.JLabel();
        jPanelInstancia = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPaneInstancia = new javax.swing.JTextPane();
        btnPruebaEvaluar = new javax.swing.JButton();
        btnPruebaReiniciar = new javax.swing.JButton();
        jPanelConjunto = new javax.swing.JPanel();
        jPanelConjuntoDeEntrenamiento = new javax.swing.JPanel();
        btnArchivoReiniciar = new javax.swing.JButton();
        lblArchivo = new javax.swing.JLabel();
        btnArchivoCargar = new javax.swing.JButton();
        jPanelOpcionArchivo = new javax.swing.JPanel();
        panelSeleccionarArchivo = new javax.swing.JPanel();
        cmbArchivos = new javax.swing.JComboBox<>();
        btnRecargar = new javax.swing.JButton();
        panelSubirArchivo = new javax.swing.JPanel();
        inputArchivoRuta = new javax.swing.JTextField();
        btnArchivoFile = new javax.swing.JButton();
        chkSubir = new javax.swing.JCheckBox();
        jPanelEvaluacionConjunto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrediccionesConjunto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnVisualizarConjunto = new javax.swing.JButton();
        btnEvaluarConjunto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        numInstancias = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumInstancias = new javax.swing.JLabel();
        clasificadasCorrectamente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtClasificadasCorrectamente = new javax.swing.JLabel();
        clasificadasIncorrectamente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtClasificadasIncorrectamente = new javax.swing.JLabel();

        jPanelEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("EVALUACIÓN"));

        jPanelEvaluacionIndividual.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación individual"));

        tblIndividualEvaluation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblIndividualEvaluation);

        javax.swing.GroupLayout jPanelEvaluacionIndividualLayout = new javax.swing.GroupLayout(jPanelEvaluacionIndividual);
        jPanelEvaluacionIndividual.setLayout(jPanelEvaluacionIndividualLayout);
        jPanelEvaluacionIndividualLayout.setHorizontalGroup(
            jPanelEvaluacionIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelEvaluacionIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );
        jPanelEvaluacionIndividualLayout.setVerticalGroup(
            jPanelEvaluacionIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelEvaluacionIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );

        jPanelResultadosEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Clase elegida");

        lblClassPredicted.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblClassPredicted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClassPredicted.setText("class");

        javax.swing.GroupLayout jPanelResultadosEvaluacionLayout = new javax.swing.GroupLayout(jPanelResultadosEvaluacion);
        jPanelResultadosEvaluacion.setLayout(jPanelResultadosEvaluacionLayout);
        jPanelResultadosEvaluacionLayout.setHorizontalGroup(
            jPanelResultadosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadosEvaluacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblClassPredicted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelResultadosEvaluacionLayout.setVerticalGroup(
            jPanelResultadosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosEvaluacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClassPredicted)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEvaluacionLayout = new javax.swing.GroupLayout(jPanelEvaluacion);
        jPanelEvaluacion.setLayout(jPanelEvaluacionLayout);
        jPanelEvaluacionLayout.setHorizontalGroup(
            jPanelEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEvaluacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEvaluacionIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelResultadosEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEvaluacionLayout.setVerticalGroup(
            jPanelEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvaluacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEvaluacionIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelResultadosEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelInstancia.setBorder(javax.swing.BorderFactory.createTitledBorder("INSTANCIA"));

        jLabel10.setText("Ejemplo a evaluar:");

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setViewportView(jTextPaneInstancia);

        btnPruebaEvaluar.setText("Evaluar");

        btnPruebaReiniciar.setText("Reiniciar");

        javax.swing.GroupLayout jPanelInstanciaLayout = new javax.swing.GroupLayout(jPanelInstancia);
        jPanelInstancia.setLayout(jPanelInstanciaLayout);
        jPanelInstanciaLayout.setHorizontalGroup(
            jPanelInstanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstanciaLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPruebaEvaluar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPruebaReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInstanciaLayout.setVerticalGroup(
            jPanelInstanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstanciaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelInstanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnPruebaEvaluar)
                .addComponent(btnPruebaReiniciar))
        );

        javax.swing.GroupLayout jPanelIndividualLayout = new javax.swing.GroupLayout(jPanelIndividual);
        jPanelIndividual.setLayout(jPanelIndividualLayout);
        jPanelIndividualLayout.setHorizontalGroup(
            jPanelIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInstancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelIndividualLayout.setVerticalGroup(
            jPanelIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("INDIVIDUAL", jPanelIndividual);

        jPanelConjuntoDeEntrenamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("CONJUNTO DE PRUEBA"));

        btnArchivoReiniciar.setText("Reiniciar");
        btnArchivoReiniciar.setEnabled(false);
        btnArchivoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoReiniciarActionPerformed(evt);
            }
        });

        lblArchivo.setText("Archivo:");

        btnArchivoCargar.setText("Cargar");
        btnArchivoCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoCargarActionPerformed(evt);
            }
        });

        jPanelOpcionArchivo.setLayout(new java.awt.CardLayout());

        panelSeleccionarArchivo.setLayout(new javax.swing.BoxLayout(panelSeleccionarArchivo, javax.swing.BoxLayout.LINE_AXIS));

        panelSeleccionarArchivo.add(cmbArchivos);

        btnRecargar.setText("Recargar");
        panelSeleccionarArchivo.add(btnRecargar);

        jPanelOpcionArchivo.add(panelSeleccionarArchivo, "card3");

        panelSubirArchivo.setLayout(new javax.swing.BoxLayout(panelSubirArchivo, javax.swing.BoxLayout.LINE_AXIS));

        inputArchivoRuta.setEnabled(false);
        panelSubirArchivo.add(inputArchivoRuta);

        btnArchivoFile.setText("...");
        btnArchivoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoFileActionPerformed(evt);
            }
        });
        panelSubirArchivo.add(btnArchivoFile);

        jPanelOpcionArchivo.add(panelSubirArchivo, "card2");

        chkSubir.setText("Subir");
        chkSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSubirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConjuntoDeEntrenamientoLayout = new javax.swing.GroupLayout(jPanelConjuntoDeEntrenamiento);
        jPanelConjuntoDeEntrenamiento.setLayout(jPanelConjuntoDeEntrenamientoLayout);
        jPanelConjuntoDeEntrenamientoLayout.setHorizontalGroup(
            jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkSubir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                .addComponent(btnArchivoCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivoReiniciar)
                .addContainerGap())
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jPanelOpcionArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGap(165, 165, 165)))
        );
        jPanelConjuntoDeEntrenamientoLayout.setVerticalGroup(
            jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblArchivo)
                .addComponent(btnArchivoCargar)
                .addComponent(btnArchivoReiniciar)
                .addComponent(chkSubir))
            .addGroup(jPanelConjuntoDeEntrenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConjuntoDeEntrenamientoLayout.createSequentialGroup()
                    .addComponent(jPanelOpcionArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelEvaluacionConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder("EVALUACION"));

        tblPrediccionesConjunto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instancia", "Clase real", "Clase predicha"
            }
        ));
        jScrollPane1.setViewportView(tblPrediccionesConjunto);

        btnVisualizarConjunto.setText("Visualizar");
        btnVisualizarConjunto.setEnabled(false);

        btnEvaluarConjunto.setText("Evaluar");
        btnEvaluarConjunto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEvaluarConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEvaluarConjunto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarConjunto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("RESUMEN"));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        numInstancias.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Núm. instancias");
        numInstancias.add(jLabel2);

        txtNumInstancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumInstancias.setText("n");
        numInstancias.add(txtNumInstancias);

        jPanel2.add(numInstancias);

        clasificadasCorrectamente.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clasificado correctamente (%)");
        clasificadasCorrectamente.add(jLabel3);

        txtClasificadasCorrectamente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClasificadasCorrectamente.setText("nn.nn%");
        clasificadasCorrectamente.add(txtClasificadasCorrectamente);

        jPanel2.add(clasificadasCorrectamente);

        clasificadasIncorrectamente.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clasificado incorrectamente (%)");
        clasificadasIncorrectamente.add(jLabel4);

        txtClasificadasIncorrectamente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClasificadasIncorrectamente.setText("nn.nn%");
        clasificadasIncorrectamente.add(txtClasificadasIncorrectamente);

        jPanel2.add(clasificadasIncorrectamente);

        javax.swing.GroupLayout jPanelEvaluacionConjuntoLayout = new javax.swing.GroupLayout(jPanelEvaluacionConjunto);
        jPanelEvaluacionConjunto.setLayout(jPanelEvaluacionConjuntoLayout);
        jPanelEvaluacionConjuntoLayout.setHorizontalGroup(
            jPanelEvaluacionConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvaluacionConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEvaluacionConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEvaluacionConjuntoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelEvaluacionConjuntoLayout.setVerticalGroup(
            jPanelEvaluacionConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvaluacionConjuntoLayout.createSequentialGroup()
                .addGroup(jPanelEvaluacionConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelConjuntoLayout = new javax.swing.GroupLayout(jPanelConjunto);
        jPanelConjunto.setLayout(jPanelConjuntoLayout);
        jPanelConjuntoLayout.setHorizontalGroup(
            jPanelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEvaluacionConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConjuntoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelConjuntoDeEntrenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelConjuntoLayout.setVerticalGroup(
            jPanelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConjuntoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanelEvaluacionConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConjuntoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelConjuntoDeEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("CONJUNTO", jPanelConjunto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoReiniciarActionPerformed

    }//GEN-LAST:event_btnArchivoReiniciarActionPerformed

    private void btnArchivoCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoCargarActionPerformed

    }//GEN-LAST:event_btnArchivoCargarActionPerformed

    private void btnArchivoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoFileActionPerformed

    }//GEN-LAST:event_btnArchivoFileActionPerformed

    private void chkSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSubirActionPerformed
        //SI SE SELECCIONA SUBIR UN ARCHIVO -> MOSTRAR card2
        CardLayout card = (CardLayout)jPanelOpcionArchivo.getLayout();
        if(chkSubir.isSelected()){
            card.show(jPanelOpcionArchivo, "card2");
        }
        else{
            card.show(jPanelOpcionArchivo, "card3");
        }
    }//GEN-LAST:event_chkSubirActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnArchivoCargar;
    public javax.swing.JButton btnArchivoFile;
    public javax.swing.JButton btnArchivoReiniciar;
    public javax.swing.JButton btnEvaluarConjunto;
    public javax.swing.JButton btnPruebaEvaluar;
    public javax.swing.JButton btnPruebaReiniciar;
    public javax.swing.JButton btnRecargar;
    public javax.swing.JButton btnVisualizarConjunto;
    public javax.swing.JCheckBox chkSubir;
    public javax.swing.JPanel clasificadasCorrectamente;
    public javax.swing.JPanel clasificadasIncorrectamente;
    public javax.swing.JComboBox<String> cmbArchivos;
    public javax.swing.JTextField inputArchivoRuta;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanelConjunto;
    public javax.swing.JPanel jPanelConjuntoDeEntrenamiento;
    public javax.swing.JPanel jPanelEvaluacion;
    public javax.swing.JPanel jPanelEvaluacionConjunto;
    public javax.swing.JPanel jPanelEvaluacionIndividual;
    public javax.swing.JPanel jPanelIndividual;
    public javax.swing.JPanel jPanelInstancia;
    public javax.swing.JPanel jPanelOpcionArchivo;
    public javax.swing.JPanel jPanelResultadosEvaluacion;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextPane jTextPaneInstancia;
    public javax.swing.JLabel lblArchivo;
    public javax.swing.JLabel lblClassPredicted;
    public javax.swing.JPanel numInstancias;
    public javax.swing.JPanel panelSeleccionarArchivo;
    public javax.swing.JPanel panelSubirArchivo;
    public javax.swing.JTable tblIndividualEvaluation;
    public javax.swing.JTable tblPrediccionesConjunto;
    public javax.swing.JLabel txtClasificadasCorrectamente;
    public javax.swing.JLabel txtClasificadasIncorrectamente;
    public javax.swing.JLabel txtNumInstancias;
    // End of variables declaration//GEN-END:variables
}
