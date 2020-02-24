
package matricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
 
public class Matricula extends javax.swing.JFrame {
    //creacion de tablas para la impresion de cada clase  (materias estudiantes matricula)
    //default para que sincronize con la tabla
    String [][] materias;
    DefaultTableModel tblModelMaterias;

    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
    
    String [][] matriculas;
    DefaultTableModel tblModelMatriculas;
  
    //creacion de los arrays para el combo box
    List<Materia> listaMaterias = new ArrayList<Materia>();
    DefaultComboBoxModel listaMateriasModel =  new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel =  new DefaultComboBoxModel(listaEstudiantes.toArray());

   
    public Matricula() {
        initComponents();
        
        //arreglos para la impresion en las tablas de materias 
        
          String titulosColumnasMaterias[] = new String [] {
            "Materia"
        };
        
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
        
         //arreglos para la impresion en las tablas de estudiantes
           String titulosColumnasEstudiantes[] = new String [] {
            "Nombre", "Apellido", "Edad"
        };
        
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiantes.setModel(tblModelEstudiantes);
        
           //arreglos para la impresion en las tablas de matriculas
        String titulosColumnasMatriculas[] = new String [] {
            "Estudiante" , "Materia"
        };
        
        tblModelMatriculas = new DefaultTableModel(matriculas, titulosColumnasMatriculas);
        tblMatriculas.setModel(tblModelMatriculas);
        
        
        //Inicializo combo de materias y estudiantes
        cmbListaEstudiantes.setModel(listaEstudiantesModel); 
        cmbListaMaterias.setModel(listaMateriasModel);
        
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlMaterias = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistroEstudiante = new javax.swing.JButton();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreMateria = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        lblMatriculaEstudiante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        btnMatriculaEstudiante = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatriculas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(24, 14, 37, 14);

        jLabel2.setText("Apellido");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(24, 45, 37, 14);

        jLabel3.setText("Edad");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(24, 76, 24, 14);

        btnRegistroEstudiante.setText("Registrar estudiante");
        btnRegistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEstudianteActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistroEstudiante);
        btnRegistroEstudiante.setBounds(89, 111, 131, 23);
        jPanel2.add(txtNombreEstudiante);
        txtNombreEstudiante.setBounds(79, 11, 69, 20);
        jPanel2.add(txtApellidoEstudiante);
        txtApellidoEstudiante.setBounds(79, 42, 69, 20);
        jPanel2.add(txtEdad);
        txtEdad.setBounds(79, 73, 34, 20);

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Estudiantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEstudiantes);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 140, 452, 402);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricula/pelea.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 490, 310);

        pnlMaterias.addTab("Estudiantes", jPanel2);

        lblNombreMateria.setText("Nombre");

        btnAgregarMateria.setText("Agregar Materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Materia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblNombreMateria)
                                .addGap(39, 39, 39)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnAgregarMateria)))
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMaterias.addTab("Materias", jPanel1);

        cmbListaEstudiantes.setDoubleBuffered(true);
        cmbListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaEstudiantesActionPerformed(evt);
            }
        });

        lblMatriculaEstudiante.setText("Estudiante");

        jLabel4.setText("Matricula");

        btnMatriculaEstudiante.setText("Matricula");
        btnMatriculaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaEstudianteActionPerformed(evt);
            }
        });

        tblMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                " Matriculas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMatriculas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatriculaEstudiante)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbListaMaterias, 0, 121, Short.MAX_VALUE)
                            .addComponent(cmbListaEstudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnMatriculaEstudiante))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatriculaEstudiante))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnMatriculaEstudiante)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pnlMaterias.addTab("Matriculas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(pnlMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(pnlMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaEstudiantesActionPerformed
      
    }//GEN-LAST:event_cmbListaEstudiantesActionPerformed

    private void btnRegistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEstudianteActionPerformed
       
        String nombre = txtNombreEstudiante.getText();
        String apellido = txtApellidoEstudiante.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        
        Estudiante estudiante = new Estudiante(nombre, apellido, edad);
        tblModelEstudiantes.addRow(new String[]{estudiante.getNombre(), estudiante.getApellido(), ""+estudiante.getEdad()});      
        listaEstudiantesModel.addElement(estudiante);
        
        txtNombreEstudiante.setText("");
        txtApellidoEstudiante.setText("");
        txtEdad.setText("");
        
    }//GEN-LAST:event_btnRegistroEstudianteActionPerformed

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        Materia materia = new Materia(txtNombreMateria.getText());
        boolean materiaExistente = false;
        //condicion que me muestra las materias ya ingresadas
        for(Materia m : listaMaterias) {
            if(m.getNombre().equals(materia.getNombre())) {
                materiaExistente = true;
                break;
            }
        }
        
        if(!materiaExistente) {
            listaMaterias.add(materia);
            tblModelMaterias.addRow(new String[]{materia.getNombre()});
            listaMateriasModel.addElement( materia);    
            txtNombreMateria.setText("");
      
        } else {
            JOptionPane.showMessageDialog(rootPane, "La materia ya existe");
        }
    
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnMatriculaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaEstudianteActionPerformed
       //arreglos para los combox seleccionados
       Estudiante estudianteSel = (Estudiante)cmbListaEstudiantes.getSelectedItem();
       Materia materiaSel = (Materia)cmbListaMaterias.getSelectedItem();
        
        boolean materiaExiste = false;
        //array de comprobacion en cuantas materias esta registrado el estudiante
        ArrayList<Materia> materiasElegidas = estudianteSel.getMaterias();
        //condicion que me muestra que materia cogio el estudiante
        if(materiasElegidas .size() > 0){
            for(Materia m : materiasElegidas ) {
                if(materiaSel.equals(m)){
                    materiaExiste = true;
                    break;
                }
            }
        }
        
        if(!materiaExiste) {
            tblModelMatriculas.addRow(new String[]{estudianteSel.getNombre(),materiaSel.getNombre()});
            materiasElegidas.add(materiaSel);
        } else {
            JOptionPane.showMessageDialog(rootPane, "El estudiante ya se encuentra matriculado en esta materia.");
        }
    }//GEN-LAST:event_btnMatriculaEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnMatriculaEstudiante;
    private javax.swing.JButton btnRegistroEstudiante;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMatriculaEstudiante;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JTabbedPane pnlMaterias;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatriculas;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
