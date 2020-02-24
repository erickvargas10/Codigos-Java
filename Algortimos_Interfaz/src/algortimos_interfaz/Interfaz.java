/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algortimos_interfaz;

public class Interfaz extends javax.swing.JFrame {


 int Arreglo2[]={4,1,3,2,5};
 
 public Interfaz() {
        initComponents();
        this.setTitle("PROYECTO ALGORÍTMOS FUNDAMENTALES");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        tpnAlgoritmo = new javax.swing.JTabbedPane();
        fondo1 = new javax.swing.JPanel();
        cmbAlgoritmos = new javax.swing.JComboBox<>();
        btnIr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbAlgoritmos.setForeground(new java.awt.Color(51, 51, 51));
        cmbAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDENAMIENTO BURBUJA", "ORDENAMIENTO SELECCIÓN", "ORDENAMIENTO INSERCIÓN", "BÚSQUEDA BINARIA", "ORDENAMIENTO MERGESORT", "ORDENAMIENTO QUICKSORT", "ORDENAMIENTO SHELL", " " }));

        btnIr.setText("IR");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE EL ALGORITMO QUE DESEA CONOCER");

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo1Layout.createSequentialGroup()
                .addGap(0, 191, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(cmbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cmbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        tpnAlgoritmo.addTab("PRINCIPAL", fondo1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpnAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpnAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        String tipo="";
        tipo=cmbAlgoritmos.getSelectedItem().toString();
        if(null != tipo)switch (tipo) {
            case "ORDENAMIENTO BURBUJA":{
                Burbuja bur = new Burbuja();
                bur.setVisible(true);
                break;
            }
            case "ORDENAMIENTO SELECCIÓN":{
            Seleccion sel = new Seleccion();
            sel.setVisible(true);
            break;
            }
            case "ORDENAMIENTO INSERCIÓN":{
                Insercion ins = new Insercion();
                ins.setVisible(true);
                break;
            }

            case "ORDENAMIENTO MERGESORT":{
            Mergersort mer = new Mergersort();
            mer.setVisible(true);
            break;
            }
            case "ORDENAMIENTO QUICKSORT":{
            Quicksort qui = new Quicksort();
            qui.setVisible(true);
            break;
        }
            case "ORDENAMIENTO SHELL":{
            Shell she = new Shell();
            she.setVisible(true);
         
           break;
    }
            case "BÚSQUEDA BINARIA":{
            BusquedaBinaria bus =  new BusquedaBinaria();
            bus.setVisible(true);
            break;
            }
           
            default:
            break;
        }
    }//GEN-LAST:event_btnIrActionPerformed

 
   
   
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cmbAlgoritmos;
    private javax.swing.JPanel fondo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane tpnAlgoritmo;
    // End of variables declaration//GEN-END:variables
}
