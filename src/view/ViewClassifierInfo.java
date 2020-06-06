package view;

public class ViewClassifierInfo extends javax.swing.JPanel {

    public ViewClassifierInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblExactitud = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setLayout(new java.awt.GridLayout(2, 5, 5, 5));

        jLabel1.setText("ID");
        add(jLabel1);

        jLabel2.setText("Tipo");
        add(jLabel2);

        jLabel3.setText("Exactitud");
        add(jLabel3);

        btnEditar.setText("Editar");
        add(btnEditar);

        btnEliminar.setText("Eliminar");
        add(btnEliminar);
        add(lblId);
        add(lblTipo);
        add(lblExactitud);
        add(filler2);
        add(filler1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel lblExactitud;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
