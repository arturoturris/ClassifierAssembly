package view;

import javax.swing.SpinnerNumberModel;

public class ViewAtributos extends javax.swing.JPanel {

    public ViewAtributos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAtributosReduccion = new javax.swing.ButtonGroup();
        jPanelAtributos = new javax.swing.JPanel();
        jPanelSeleccionArchivo = new javax.swing.JPanel();
        lblAtributosArchivoArchivo = new javax.swing.JLabel();
        cmbAtributosArchivo = new javax.swing.JComboBox<>();
        btnAtributosSeleccionar = new javax.swing.JButton();
        btnAtributosReiniciar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        jPanelFiltros = new javax.swing.JPanel();
        lblAtributosFiltrosAtributo = new javax.swing.JLabel();
        cmbAtributosAtributo = new javax.swing.JComboBox<>();
        lblAtributosFiltrosTipo = new javax.swing.JLabel();
        cmbAtributosTipo = new javax.swing.JComboBox<>();
        chkAtributosNormalizar = new javax.swing.JCheckBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnAtributosAplicarFiltros = new javax.swing.JButton();
        jPanelDimensionalidad = new javax.swing.JPanel();
        lblAtributosReduccionMetodo = new javax.swing.JLabel();
        cmbAtributosMetodoReduccion = new javax.swing.JComboBox<>();
        radioAtributosNumComponentes = new javax.swing.JRadioButton();
        lblAtributosNumMaxComponentes = new javax.swing.JLabel();
        lblAtributosReduccionNumComp = new javax.swing.JLabel();
        spnAtributosReduccionNumComp = new javax.swing.JSpinner();
        radioAtributosPorVariacion = new javax.swing.JRadioButton();
        spnAtributosReduccionPorVar = new javax.swing.JSpinner();
        btnAtributosAplicarReducccion = new javax.swing.JButton();
        jPanelPrevisualizacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtributosPrevisualizacion = new javax.swing.JTable();
        btnAtributosGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNumInstancias = new javax.swing.JLabel();
        lblNoInstanciasN = new javax.swing.JLabel();
        jPanelCreacionArchivos = new javax.swing.JPanel();
        lblSeed = new javax.swing.JLabel();
        lblFold = new javax.swing.JLabel();
        lblFolds = new javax.swing.JLabel();
        spnFold = new javax.swing.JSpinner();
        spnSeed = new javax.swing.JSpinner();
        spnFolds = new javax.swing.JSpinner();
        btnCrearArchivos = new javax.swing.JButton();

        jPanelAtributos.setEnabled(false);

        jPanelSeleccionArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCION DE ARCHIVO"));

        lblAtributosArchivoArchivo.setText("Archivo:");

        btnAtributosSeleccionar.setText("Seleccionar");
        btnAtributosSeleccionar.setEnabled(false);
        btnAtributosSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosSeleccionarActionPerformed(evt);
            }
        });

        btnAtributosReiniciar.setText("Reiniciar");
        btnAtributosReiniciar.setEnabled(false);
        btnAtributosReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosReiniciarActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar");

        javax.swing.GroupLayout jPanelSeleccionArchivoLayout = new javax.swing.GroupLayout(jPanelSeleccionArchivo);
        jPanelSeleccionArchivo.setLayout(jPanelSeleccionArchivoLayout);
        jPanelSeleccionArchivoLayout.setHorizontalGroup(
            jPanelSeleccionArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionArchivoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lblAtributosArchivoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAtributosArchivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtributosSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtributosReiniciar)
                .addContainerGap())
        );
        jPanelSeleccionArchivoLayout.setVerticalGroup(
            jPanelSeleccionArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAtributosArchivoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelSeleccionArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cmbAtributosArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAtributosSeleccionar)
                .addComponent(btnAtributosReiniciar)
                .addComponent(btnRecargar))
        );

        jPanelFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder("FILTROS"));

        lblAtributosFiltrosAtributo.setText("Atributo");

        lblAtributosFiltrosTipo.setText("Tipo");

        cmbAtributosTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtributosTipoActionPerformed(evt);
            }
        });

        chkAtributosNormalizar.setText("Normalizar");

        btnAtributosAplicarFiltros.setText("Aplicar filtros");
        btnAtributosAplicarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosAplicarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addComponent(lblAtributosFiltrosAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cmbAtributosAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkAtributosNormalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addComponent(lblAtributosFiltrosTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cmbAtributosTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtributosAplicarFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtributosFiltrosAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAtributosAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtributosFiltrosTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAtributosTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAtributosNormalizar)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnAtributosAplicarFiltros))
        );

        jPanelDimensionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("REDUCCION DE DIMENSIONALIDAD"));

        lblAtributosReduccionMetodo.setText("Método:");

        btnGroupAtributosReduccion.add(radioAtributosNumComponentes);
        radioAtributosNumComponentes.setSelected(true);
        radioAtributosNumComponentes.setText("No. componentes");
        radioAtributosNumComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAtributosNumComponentesActionPerformed(evt);
            }
        });

        lblAtributosNumMaxComponentes.setText("1");

        lblAtributosReduccionNumComp.setText("Núm. máx. componentes:");

        spnAtributosReduccionNumComp.setModel(new SpinnerNumberModel(1,1,Integer.parseInt(lblAtributosNumMaxComponentes.getText()),1));

        btnGroupAtributosReduccion.add(radioAtributosPorVariacion);
        radioAtributosPorVariacion.setText("% de variación:");
        radioAtributosPorVariacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAtributosPorVariacionActionPerformed(evt);
            }
        });

        spnAtributosReduccionPorVar.setModel(new SpinnerNumberModel(0.00,0.00,1.00,0.001));
        spnAtributosReduccionPorVar.setEnabled(false);

        btnAtributosAplicarReducccion.setText("Aplicar");
        btnAtributosAplicarReducccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosAplicarReducccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDimensionalidadLayout = new javax.swing.GroupLayout(jPanelDimensionalidad);
        jPanelDimensionalidad.setLayout(jPanelDimensionalidadLayout);
        jPanelDimensionalidadLayout.setHorizontalGroup(
            jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDimensionalidadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDimensionalidadLayout.createSequentialGroup()
                        .addComponent(lblAtributosReduccionMetodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAtributosMetodoReduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAtributosReduccionNumComp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAtributosNumMaxComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDimensionalidadLayout.createSequentialGroup()
                        .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioAtributosNumComponentes)
                            .addComponent(radioAtributosPorVariacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spnAtributosReduccionPorVar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(spnAtributosReduccionNumComp)))
                    .addComponent(btnAtributosAplicarReducccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanelDimensionalidadLayout.setVerticalGroup(
            jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDimensionalidadLayout.createSequentialGroup()
                .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtributosReduccionMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAtributosMetodoReduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtributosReduccionNumComp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtributosNumMaxComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAtributosNumComponentes)
                    .addComponent(spnAtributosReduccionNumComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDimensionalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAtributosPorVariacion)
                    .addComponent(spnAtributosReduccionPorVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtributosAplicarReducccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrevisualizacion.setBorder(javax.swing.BorderFactory.createTitledBorder("PREVISUALIZACION"));

        tblAtributosPrevisualizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAtributosPrevisualizacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAtributosPrevisualizacion.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tblAtributosPrevisualizacion);

        btnAtributosGuardar.setText("Guardar nuevo conjunto de datos");
        btnAtributosGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosGuardarActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        lblNumInstancias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumInstancias.setText("No. Instancias:");
        jPanel1.add(lblNumInstancias);

        lblNoInstanciasN.setText("n");
        jPanel1.add(lblNoInstanciasN);

        javax.swing.GroupLayout jPanelPrevisualizacionLayout = new javax.swing.GroupLayout(jPanelPrevisualizacion);
        jPanelPrevisualizacion.setLayout(jPanelPrevisualizacionLayout);
        jPanelPrevisualizacionLayout.setHorizontalGroup(
            jPanelPrevisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrevisualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrevisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelPrevisualizacionLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtributosGuardar)))
                .addContainerGap())
        );
        jPanelPrevisualizacionLayout.setVerticalGroup(
            jPanelPrevisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrevisualizacionLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrevisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrevisualizacionLayout.createSequentialGroup()
                        .addComponent(btnAtributosGuardar)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrevisualizacionLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanelCreacionArchivos.setBorder(javax.swing.BorderFactory.createTitledBorder("CREACION DE ARCHIVOS"));

        lblSeed.setText("Seed:");

        lblFold.setText("Fold:");

        lblFolds.setText("Folds:");

        btnCrearArchivos.setText("Crear archivos");

        javax.swing.GroupLayout jPanelCreacionArchivosLayout = new javax.swing.GroupLayout(jPanelCreacionArchivos);
        jPanelCreacionArchivos.setLayout(jPanelCreacionArchivosLayout);
        jPanelCreacionArchivosLayout.setHorizontalGroup(
            jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCreacionArchivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCreacionArchivosLayout.createSequentialGroup()
                        .addComponent(lblFold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnFold))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCreacionArchivosLayout.createSequentialGroup()
                        .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFolds)
                            .addComponent(lblSeed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnFolds)
                            .addComponent(spnSeed))))
                .addContainerGap())
        );
        jPanelCreacionArchivosLayout.setVerticalGroup(
            jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreacionArchivosLayout.createSequentialGroup()
                .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFold)
                    .addComponent(spnFold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFolds)
                    .addComponent(spnFolds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCreacionArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeed)
                    .addComponent(spnSeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrearArchivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAtributosLayout = new javax.swing.GroupLayout(jPanelAtributos);
        jPanelAtributos.setLayout(jPanelAtributosLayout);
        jPanelAtributosLayout.setHorizontalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrevisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAtributosLayout.createSequentialGroup()
                        .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCreacionArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelDimensionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 264, Short.MAX_VALUE))
                    .addComponent(jPanelSeleccionArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAtributosLayout.setVerticalGroup(
            jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSeleccionArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDimensionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCreacionArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrevisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1017, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAtributos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtributosGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosGuardarActionPerformed

    }//GEN-LAST:event_btnAtributosGuardarActionPerformed

    private void btnAtributosAplicarReducccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosAplicarReducccionActionPerformed

    }//GEN-LAST:event_btnAtributosAplicarReducccionActionPerformed

    private void radioAtributosPorVariacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAtributosPorVariacionActionPerformed

    }//GEN-LAST:event_radioAtributosPorVariacionActionPerformed

    private void radioAtributosNumComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAtributosNumComponentesActionPerformed

    }//GEN-LAST:event_radioAtributosNumComponentesActionPerformed

    private void btnAtributosAplicarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosAplicarFiltrosActionPerformed

    }//GEN-LAST:event_btnAtributosAplicarFiltrosActionPerformed

    private void cmbAtributosTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtributosTipoActionPerformed

    }//GEN-LAST:event_cmbAtributosTipoActionPerformed

    private void btnAtributosReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosReiniciarActionPerformed

    }//GEN-LAST:event_btnAtributosReiniciarActionPerformed

    private void btnAtributosSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosSeleccionarActionPerformed

    }//GEN-LAST:event_btnAtributosSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAtributosAplicarFiltros;
    public javax.swing.JButton btnAtributosAplicarReducccion;
    public javax.swing.JButton btnAtributosGuardar;
    public javax.swing.JButton btnAtributosReiniciar;
    public javax.swing.JButton btnAtributosSeleccionar;
    public javax.swing.JButton btnCrearArchivos;
    private javax.swing.ButtonGroup btnGroupAtributosReduccion;
    public javax.swing.JButton btnRecargar;
    public javax.swing.JCheckBox chkAtributosNormalizar;
    public javax.swing.JComboBox<String> cmbAtributosArchivo;
    public javax.swing.JComboBox<String> cmbAtributosAtributo;
    public javax.swing.JComboBox<String> cmbAtributosMetodoReduccion;
    public javax.swing.JComboBox<String> cmbAtributosTipo;
    public javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelAtributos;
    public javax.swing.JPanel jPanelCreacionArchivos;
    public javax.swing.JPanel jPanelDimensionalidad;
    public javax.swing.JPanel jPanelFiltros;
    public javax.swing.JPanel jPanelPrevisualizacion;
    public javax.swing.JPanel jPanelSeleccionArchivo;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblAtributosArchivoArchivo;
    public javax.swing.JLabel lblAtributosFiltrosAtributo;
    public javax.swing.JLabel lblAtributosFiltrosTipo;
    public javax.swing.JLabel lblAtributosNumMaxComponentes;
    public javax.swing.JLabel lblAtributosReduccionMetodo;
    public javax.swing.JLabel lblAtributosReduccionNumComp;
    public javax.swing.JLabel lblFold;
    public javax.swing.JLabel lblFolds;
    public javax.swing.JLabel lblNoInstanciasN;
    public javax.swing.JLabel lblNumInstancias;
    public javax.swing.JLabel lblSeed;
    public javax.swing.JRadioButton radioAtributosNumComponentes;
    public javax.swing.JRadioButton radioAtributosPorVariacion;
    public javax.swing.JSpinner spnAtributosReduccionNumComp;
    public javax.swing.JSpinner spnAtributosReduccionPorVar;
    public javax.swing.JSpinner spnFold;
    public javax.swing.JSpinner spnFolds;
    public javax.swing.JSpinner spnSeed;
    public javax.swing.JTable tblAtributosPrevisualizacion;
    // End of variables declaration//GEN-END:variables
}
