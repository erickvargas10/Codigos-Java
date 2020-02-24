
package matricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {
    
    
    String materia [][];
    DefaultTableModel tablaMaterias;
    boolean repetido = true;
    boolean repetido2 = true;
    boolean repetido3 = true;
    boolean repetido4 = true;

    
    String estudiante [][];//tabla de estudiantes
    DefaultTableModel tablaEstudiantes;
    
    String items [][];//tabla items 
    DefaultTableModel tablaItems;
    
    String profesor [][];//tabla profesores
    DefaultTableModel tablaProfesores;
    
    ArrayList <Profesores> listaP = new ArrayList <Profesores>();//cmb profesores
    
    ArrayList <Items> list = new ArrayList <Items> ();//cmb itmes
    
        List<Materias> listaMaterias = new ArrayList<Materias>();//cmb materias
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>();//cmb estudiantes
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    
    public Ventana() {
        initComponents();
        
        String TituloMaterias []= new String []{"Materias"};//inicializacion de la tabla materias
        
        tablaMaterias = new DefaultTableModel (materia,TituloMaterias);
        tblMaterias.setModel(tablaMaterias);
        
        String TituloEstudiantes [] = new String []{"Nombre","Apellido","Edad"};
        
        tablaEstudiantes = new DefaultTableModel (estudiante,TituloEstudiantes);
        tblEstudiantes.setModel(tablaEstudiantes);
        
        String TituloItems [] = new String []{"Nombre","Materia"};
        
        tablaItems = new DefaultTableModel (items,TituloItems);
        tblMatricula.setModel(tablaItems);
        
        String TituloProfesores []= new String []{"Nombre", "Apellido", "Facultad", "Materia"};
        
        tablaProfesores = new DefaultTableModel (profesor,TituloProfesores);
        tblProfesores.setModel(tablaProfesores);        
        
        boxEstudiantes.setModel(listaEstudiantesModel);
        boxMaterias.setModel(listaMateriasModel);
        boxPMaterias.setModel(listaMateriasModel);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIngresarMateria = new javax.swing.JTextField();
        btnIngresarMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        Fondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresarNombre = new javax.swing.JTextField();
        btnIngresarEstudiante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtIngresarApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIngresarEdad = new javax.swing.JTextField();
        Fondo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        boxEstudiantes = new javax.swing.JComboBox<>();
        boxMaterias = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();
        btnMatricular = new javax.swing.JButton();
        Fondo3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        boxPMaterias = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPNombre = new javax.swing.JTextField();
        txtPApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPFacultad = new javax.swing.JTextField();
        btnPIngresar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProfesores = new javax.swing.JTable();
        Fondo4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Materia:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(txtIngresarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, -1));

        btnIngresarMateria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresarMateria.setText("Ingresar");
        btnIngresarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 630, 280));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fr.jpg"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 706, 394));

        jTabbedPane1.addTab("Materias", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        jPanel2.add(txtIngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, -1));

        btnIngresarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblEstudiantes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 630, 260));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        txtIngresarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txtIngresarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 250, -1));

        jLabel4.setText("Edad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        jPanel2.add(txtIngresarEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddr.jpg"))); // NOI18N
        jPanel2.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 708, 393));

        jTabbedPane1.addTab("Estudiantes", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(boxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel3.add(boxMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tblMatricula);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 60, 390, 310));

        btnMatricular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel3.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddfr.jpg"))); // NOI18N
        jPanel3.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 706, 395));

        jTabbedPane1.addTab("Matriculas", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxPMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(boxPMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jLabel5.setText("Nombre");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel6.setText("Apellido");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        txtPNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNombreActionPerformed(evt);
            }
        });
        jPanel4.add(txtPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, -1));
        jPanel4.add(txtPApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, -1));

        jLabel7.setText("Facultad");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
        jPanel4.add(txtPFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, -1));

        btnPIngresar.setText("Ingresar");
        btnPIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIngresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnPIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        tblProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblProfesores);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 120, 630, 250));

        Fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddr.jpg"))); // NOI18N
        jPanel4.add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 400));

        jTabbedPane1.addTab("Profesores", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 710, 420));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f11.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarApellidoActionPerformed
        
    }//GEN-LAST:event_txtIngresarApellidoActionPerformed

    private void btnIngresarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarMateriaActionPerformed
   
        if (!txtIngresarMateria.getText().equals("")){//sea diferente de ingresar
        repetido =true;
        Materias newMaterias = new Materias (txtIngresarMateria.getText());//me pide directo la materia en el txt
        listaMaterias.add(newMaterias);//añade la amteria
        

        
        for (int i = 0; i < listaMaterias.size()-1; i++) {    //bucle que compara las materias ingresadas
            if (listaMaterias.get(i).equals(listaMaterias.get(listaMaterias.size()-1))){
                repetido = false;
                listaMaterias.remove(listaMaterias.size()-1);            
                break;
            }
        }
        
        txtIngresarMateria.setText("");
        
        if (repetido == true){
            tablaMaterias.addRow(new String []{newMaterias.getMaterias()});
            listaMateriasModel.addElement(newMaterias);  
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Repetido");
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese una materia");
        }
    }//GEN-LAST:event_btnIngresarMateriaActionPerformed

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        
        if (!txtIngresarNombre.getText().equals("")&&!txtIngresarApellido.getText().equals("")&&!txtIngresarEdad.getText().equals("")){
        String nombre = txtIngresarNombre.getText();
        String apellido = txtIngresarApellido.getText();
        int edad = Integer.parseInt(txtIngresarEdad.getText());
        
        
        Estudiantes newEstudiante = new Estudiantes (nombre,apellido,edad);//añade al constructor
        tablaEstudiantes.addRow(new String []{nombre,apellido,""+edad});
        listaEstudiantesModel.addElement(newEstudiante);  
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese los valores");
        }
        
        txtIngresarNombre.setText("");
        txtIngresarApellido.setText("");
        txtIngresarEdad.setText("");
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed

        
        String mat = ""+boxMaterias.getSelectedItem();
        String estu = ""+boxEstudiantes.getSelectedItem();
        repetido2 = true;
        repetido3 = true;
    
        for (int i = 0; i < listaP.size(); i++) {
                    
        if (listaP.get(i).getMateriaP().equals(mat)){
            repetido3 = false;
            
            break;
        }
        
        }
        
        if (repetido3 == true){
            
            JOptionPane.showMessageDialog(rootPane, "Sin Profesor");
            
        }
        
        if (repetido3 == false){
        
        Items newItem = new Items (estu,mat);
        list.add(newItem);
        
        for (int j = 0; j < list.size()-1; j++) {
            
            if (list.get(j).equals(list.get(list.size()-1))){
                
                repetido2 = false;
                list.remove(list.size()-1);
                break;
            }
            
        }
        
        if (repetido2 == true){
            tablaItems.addRow(new String [] {estu,mat});
        }else{
            JOptionPane.showMessageDialog(rootPane, "Repetido");
        }
        
        }
        
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void txtPNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNombreActionPerformed

    private void btnPIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIngresarActionPerformed
        
        repetido4 = true;
        
        
        String nombreP = txtPNombre.getText();
        String apellidoP = txtPApellido.getText();
        String facultadP = txtPFacultad.getText();
        String materiaP = ""+boxPMaterias.getSelectedItem();
        
        if (!nombreP.equals("")&&!apellidoP.equals("")&&!facultadP.equals("")&& !materiaP.equals("")){
        
        Profesores newProfesor = new Profesores (nombreP, apellidoP, facultadP, materiaP);     
        
        listaP.add(newProfesor);
        
        
                for (int j = 0; j < listaP.size()-1; j++) {
            
            if (listaP.get(j).getMateriaP().equals(listaP.get(listaP.size()-1).getMateriaP())){
                
                repetido4 = false;
                listaP.remove(listaP.size()-1);
                break;
            }
            
        }
        
        if (repetido4 == true){
            tablaProfesores.addRow(new String []{nombreP,apellidoP,facultadP,materiaP});
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Materia Repetida");
        }
                
        txtPNombre.setText("");
        txtPApellido.setText("");
        txtPFacultad.setText("");
        
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese los valores ");
        }
        
        
    }//GEN-LAST:event_btnPIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JComboBox<String> boxEstudiantes;
    private javax.swing.JComboBox<String> boxMaterias;
    private javax.swing.JComboBox<String> boxPMaterias;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JButton btnIngresarMateria;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnPIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTable tblProfesores;
    private javax.swing.JTextField txtIngresarApellido;
    private javax.swing.JTextField txtIngresarEdad;
    private javax.swing.JTextField txtIngresarMateria;
    private javax.swing.JTextField txtIngresarNombre;
    private javax.swing.JTextField txtPApellido;
    private javax.swing.JTextField txtPFacultad;
    private javax.swing.JTextField txtPNombre;
    // End of variables declaration//GEN-END:variables
}
