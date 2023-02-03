/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import BO.EmpleadosBO;
import DAO.EmpleadosDAO;
import clases.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author larguedas
 */
public class MaestroEmpleados extends javax.swing.JFrame {

    private EmpleadosBO empleadosbo;
    private EmpleadosDAO empleadosdao;
    
    public MaestroEmpleados() {
        initComponents();
        empleadosdao = new EmpleadosDAO();
        
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupNacionalidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tituloConsultaEmp = new javax.swing.JLabel();
        jTabbedMaestro = new javax.swing.JTabbedPane();
        jPanelIngreNuev = new javax.swing.JPanel();
        jLabelNombEmp = new javax.swing.JLabel();
        jLabelApellido01 = new javax.swing.JLabel();
        jLabelApellido02 = new javax.swing.JLabel();
        jLabelDepa = new javax.swing.JLabel();
        jLabelFechaIngr = new javax.swing.JLabel();
        jLabeltipóPlani = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jTextNombreEmp = new javax.swing.JTextField();
        jComboDepa = new javax.swing.JComboBox<>();
        jComboPlanilla = new javax.swing.JComboBox<>();
        jDateFechaIng = new com.toedter.calendar.JDateChooser();
        jLabelEmail = new javax.swing.JLabel();
        jTextApellido02 = new javax.swing.JTextField();
        jLabelphone = new javax.swing.JLabel();
        jTextEmail1 = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jTextaddress = new javax.swing.JTextField();
        jLabelfechaNac = new javax.swing.JLabel();
        jDateFechaNacim = new com.toedter.calendar.JDateChooser();
        jTextApellido01 = new javax.swing.JTextField();
        jLabelNacionalidad = new javax.swing.JLabel();
        jCheckNacionalidad = new javax.swing.JCheckBox();
        jLabelNacionalidad1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabelNacionalidad2 = new javax.swing.JLabel();
        jCheckNacionalidad1 = new javax.swing.JCheckBox();
        jLabeladdress = new javax.swing.JLabel();
        jComboEstadocivil = new javax.swing.JComboBox<>();
        jButtonIngEmpl = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jLabelPuesto = new javax.swing.JLabel();
        jTextPuesto = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelConEmp = new javax.swing.JPanel();
        jPanelAccPers = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemMainMenu = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maestro de Empleados");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setAutoscrolls(true);

        tituloConsultaEmp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloConsultaEmp.setForeground(new java.awt.Color(0, 0, 0));
        tituloConsultaEmp.setText("AUTOTRANSPORTES SANTA BARBARA");
        tituloConsultaEmp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTabbedMaestro.setBackground(new java.awt.Color(0, 102, 51));
        jTabbedMaestro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        jTabbedMaestro.setForeground(new java.awt.Color(0, 0, 0));

        jPanelIngreNuev.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelNombEmp.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombEmp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNombEmp.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombEmp.setText("Nombre del Empleado:");

        jLabelApellido01.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellido01.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelApellido01.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellido01.setText("Apellido Paterno:");

        jLabelApellido02.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellido02.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelApellido02.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellido02.setText("Apellido Materno:");

        jLabelDepa.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDepa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDepa.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDepa.setText("Departamento Destino:");

        jLabelFechaIngr.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFechaIngr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelFechaIngr.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaIngr.setText("fecha de Ingreso:");

        jLabeltipóPlani.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltipóPlani.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabeltipóPlani.setForeground(new java.awt.Color(0, 0, 0));
        jLabeltipóPlani.setText("Tipo de Planilla:");

        jTextPhone.setBackground(new java.awt.Color(255, 255, 255));
        jTextPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextPhone.setForeground(new java.awt.Color(0, 0, 153));
        jTextPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextNombreEmp.setBackground(new java.awt.Color(255, 255, 255));
        jTextNombreEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextNombreEmp.setForeground(new java.awt.Color(0, 0, 153));
        jTextNombreEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombreEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboDepa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Administrativo", "Chofer Cobrador", "Mantenimiento", "Limpieza " }));
        jComboDepa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboPlanilla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboPlanilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Semanal", "Quincenal" }));
        jComboPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDateFechaIng.setBackground(new java.awt.Color(255, 255, 255));
        jDateFechaIng.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateFechaIng.setForeground(new java.awt.Color(255, 255, 255));
        jDateFechaIng.setAutoscrolls(true);

        jLabelEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Correo Electronico");

        jTextApellido02.setBackground(new java.awt.Color(255, 255, 255));
        jTextApellido02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextApellido02.setForeground(new java.awt.Color(0, 0, 153));
        jTextApellido02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextApellido02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelphone.setBackground(new java.awt.Color(255, 255, 255));
        jLabelphone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelphone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelphone.setText("Telefono:");
        jLabelphone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextEmail1.setBackground(new java.awt.Color(255, 255, 255));
        jTextEmail1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextEmail1.setForeground(new java.awt.Color(0, 0, 153));
        jTextEmail1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEmail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEstadoCivil.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEstadoCivil.setText("Estado Civil:");

        jTextaddress.setBackground(new java.awt.Color(255, 255, 255));
        jTextaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextaddress.setForeground(new java.awt.Color(0, 0, 153));
        jTextaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextaddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelfechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jLabelfechaNac.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelfechaNac.setForeground(new java.awt.Color(0, 0, 0));
        jLabelfechaNac.setText("Fecha de Nacimiento:");

        jDateFechaNacim.setBackground(new java.awt.Color(255, 255, 255));
        jDateFechaNacim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateFechaNacim.setForeground(new java.awt.Color(255, 255, 255));
        jDateFechaNacim.setAutoscrolls(true);

        jTextApellido01.setBackground(new java.awt.Color(255, 255, 255));
        jTextApellido01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextApellido01.setForeground(new java.awt.Color(0, 0, 153));
        jTextApellido01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextApellido01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNacionalidad.setText("Sexo:");

        buttonGroupNacionalidad.add(jCheckNacionalidad);
        jCheckNacionalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNacionalidad1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidad1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNacionalidad1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNacionalidad1.setText("Costarricense:");

        buttonGroupSexo.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton1.setText("Masculino");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroupSexo.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton2.setText("Femenino");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroupSexo.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton3.setText("Indefinido");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNacionalidad2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidad2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNacionalidad2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNacionalidad2.setText("Extranjero:");

        buttonGroupNacionalidad.add(jCheckNacionalidad1);
        jCheckNacionalidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabeladdress.setBackground(new java.awt.Color(255, 255, 255));
        jLabeladdress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabeladdress.setForeground(new java.awt.Color(0, 0, 0));
        jLabeladdress.setText("Dirección:");
        jLabeladdress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboEstadocivil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboEstadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Soltero", "Casado", "Divociado", "Union libre." }));
        jComboEstadocivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonIngEmpl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonIngEmpl.setText("Ingresar Empleaedo");
        jButtonIngEmpl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngEmplActionPerformed(evt);
            }
        });

        jButtonClean.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonClean.setText("Limpiar Campos");
        jButtonClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelPuesto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPuesto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPuesto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPuesto.setText("Puesto");

        jTextPuesto.setBackground(new java.awt.Color(255, 255, 255));
        jTextPuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextPuesto.setForeground(new java.awt.Color(0, 0, 153));
        jTextPuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCedula.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCedula.setText("Cedula de Identidad");

        jTextCedula.setBackground(new java.awt.Color(255, 255, 255));
        jTextCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCedula.setForeground(new java.awt.Color(0, 0, 153));
        jTextCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jSeparator1.setPreferredSize(new java.awt.Dimension(30, 100));

        javax.swing.GroupLayout jPanelIngreNuevLayout = new javax.swing.GroupLayout(jPanelIngreNuev);
        jPanelIngreNuev.setLayout(jPanelIngreNuevLayout);
        jPanelIngreNuevLayout.setHorizontalGroup(
            jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelApellido02)
                                    .addComponent(jLabelfechaNac)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelNacionalidad)
                                    .addComponent(jLabelNombEmp)
                                    .addComponent(jLabeladdress))
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jTextaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(jTextCedula)
                                            .addComponent(jTextApellido02)
                                            .addComponent(jTextNombreEmp)))))
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addComponent(jLabelCedula)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngreNuevLayout.createSequentialGroup()
                                    .addComponent(jLabelEstadoCivil)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                            .addComponent(jLabelApellido01)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextApellido01, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                            .addComponent(jLabelphone)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                                .addComponent(jLabelNacionalidad2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCheckNacionalidad1))
                                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                                .addComponent(jLabelNacionalidad1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckNacionalidad)))))))
                        .addGap(375, 375, 375))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngreNuevLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabeltipóPlani)
                                    .addComponent(jLabelPuesto)))
                            .addComponent(jLabelFechaIngr, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateFechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonIngEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219))
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabelDepa)
                                .addGap(18, 18, 18)
                                .addComponent(jComboDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelIngreNuevLayout.setVerticalGroup(
            jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngreNuevLayout.createSequentialGroup()
                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFechaIngr))
                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNombEmp)
                                    .addComponent(jTextNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelApellido02)
                                    .addComponent(jTextApellido02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCedula)
                                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabeladdress))
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabelfechaNac))
                                    .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jDateFechaNacim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNacionalidad)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)))
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelApellido01)
                                    .addComponent(jTextApellido01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNacionalidad1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckNacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNacionalidad2))
                                .addGap(28, 28, 28)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelphone))
                                .addGap(36, 36, 36)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEstadoCivil)
                                    .addComponent(jComboEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPuesto)
                            .addComponent(jTextPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDepa)
                            .addComponent(jComboDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeltipóPlani)
                            .addComponent(jComboPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanelIngreNuevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonIngEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelIngreNuevLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jDateFechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(117, 117, 117))
        );

        jTabbedMaestro.addTab("Ingreso Nuevo", jPanelIngreNuev);

        jPanelConEmp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelConEmpLayout = new javax.swing.GroupLayout(jPanelConEmp);
        jPanelConEmp.setLayout(jPanelConEmpLayout);
        jPanelConEmpLayout.setHorizontalGroup(
            jPanelConEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1451, Short.MAX_VALUE)
        );
        jPanelConEmpLayout.setVerticalGroup(
            jPanelConEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        jTabbedMaestro.addTab("Consulta Empleado", jPanelConEmp);

        jPanelAccPers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelAccPersLayout = new javax.swing.GroupLayout(jPanelAccPers);
        jPanelAccPers.setLayout(jPanelAccPersLayout);
        jPanelAccPersLayout.setHorizontalGroup(
            jPanelAccPersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1451, Short.MAX_VALUE)
        );
        jPanelAccPersLayout.setVerticalGroup(
            jPanelAccPersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        jTabbedMaestro.addTab("Acciones de personal", jPanelAccPers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedMaestro)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(tituloConsultaEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloConsultaEmp)
                .addGap(36, 36, 36)
                .addComponent(jTabbedMaestro)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItemMainMenu.setText("Menu Princpal");
        jMenu1.add(jMenuItemMainMenu);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        
        int opc = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación ?");
        if(opc == JOptionPane.OK_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonIngEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngEmplActionPerformed
        
        if(validarDatos()){
            Empleado empleado = new Empleado();
            empleado.setNombre(this.jTextNombreEmp.getText());
            empleado.setApellido01(this.jTextApellido01.getText());
            empleado.setApellido02(this.jTextApellido02.getText());
            empleado.setDepa((Integer) this.jComboDepa.getSelectedItem());
            empleado.setTipoPlanilla((Integer)this.jComboPlanilla.getSelectedItem());
            empleado.setFechaIngreso(this.jDateFechaIng.getDate());
            empleado.setEmail(this.jTextEmail1.getText());
            empleado.setFechaNacimiento(this.jDateFechaNacim.getDate());
            empleado.setNacional(this.buttonGroupNacionalidad.getButtonCount());
            empleado.setSexo(this.buttonGroupSexo.getButtonCount());
            empleado.setEstadoCivil((Integer)this.jComboEstadocivil.getSelectedItem());
            empleado.setPuesto(this.jTextPuesto.getText());
            empleadosbo = new EmpleadosBO();
            int rep = empleadosbo.ingreso(empleado);
            switch (rep){
                case 0:
                    /*todo bien*/
                    MainMenu menu = new MainMenu();
                    menu.setVisible(true);
                    this.setVisible(false);
                    break;
                case 1:
                    /*sql exeption*/
                    JOptionPane.showMessageDialog(null, empleadosdao.getExa());
                    break;
                case 2:
                    /*no se conecto a bd*/
                    JOptionPane.showMessageDialog(null, "No se a podido conectar a la Base de datos");
                    break;
                case 3:
                    /*clave incorrecta*/
                    JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
                    break;
                case 4:
                    /*clave null*/
                    JOptionPane.showMessageDialog(null, "Calve en null");
                    break;
            }
                    
        }
    }//GEN-LAST:event_jButtonIngEmplActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MaestroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaestroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaestroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaestroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MaestroEmpleados().setVisible(true);
        });
    }
    
    public boolean validarDatos(){
        boolean ok = true;
        if(this.jTextNombreEmp.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Nombre Requerido");
            ok=false;
        }
        if(this.jTextApellido01.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Apellido Paterno Requerido");
            ok=false;
        }
        if(this.jTextApellido02.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Apellido Materno Requerido");
            ok=false;
        }
        if(this.jComboDepa.getSelectedItem().equals(0)){
            JOptionPane.showMessageDialog(null, "Departamento Requerido");
            ok=false;
        }
        if(this.jComboPlanilla.getSelectedItem().equals(0)){
            JOptionPane.showMessageDialog(null, "Tipo Planilla Requerido");
            ok=false;
        }
        if(this.jDateFechaIng == null){
            JOptionPane.showMessageDialog(null, "Fecha Ingreso Requerido");
            ok=false;
        }
        if(this.jTextEmail1.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Correo Requerido");
            ok=false;
        }
        if(this.jTextPhone.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Telefono Requerido");
            ok=false;
        }
        if(this.jTextaddress.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Direccion Requerido");
            ok=false;
        }
        if(this.jDateFechaNacim == null){
            JOptionPane.showMessageDialog(null, "Fecha Nacimineto Requerido");
            ok=false;
        }
        if(this.buttonGroupNacionalidad == null){
            JOptionPane.showMessageDialog(null, "Nacionalidad Requerido");
            ok=false;
        }
        if(this.buttonGroupSexo == null){
            JOptionPane.showMessageDialog(null, "Sexo Requerido");
            ok=false;
        }
        if(this.jComboEstadocivil == null){
            JOptionPane.showMessageDialog(null,"Estado civil Requerido");
            ok=false;
        }
        if(this.jTextPuesto.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null,"Puesto Requerido");
            ok=false;
        }
        
        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupNacionalidad;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonIngEmpl;
    private javax.swing.JCheckBox jCheckNacionalidad;
    private javax.swing.JCheckBox jCheckNacionalidad1;
    private javax.swing.JComboBox<String> jComboDepa;
    private javax.swing.JComboBox<String> jComboEstadocivil;
    private javax.swing.JComboBox<String> jComboPlanilla;
    private com.toedter.calendar.JDateChooser jDateFechaIng;
    private com.toedter.calendar.JDateChooser jDateFechaNacim;
    private javax.swing.JLabel jLabelApellido01;
    private javax.swing.JLabel jLabelApellido02;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDepa;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelFechaIngr;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNacionalidad1;
    private javax.swing.JLabel jLabelNacionalidad2;
    private javax.swing.JLabel jLabelNombEmp;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabeladdress;
    private javax.swing.JLabel jLabelfechaNac;
    private javax.swing.JLabel jLabelphone;
    private javax.swing.JLabel jLabeltipóPlani;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMainMenu;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAccPers;
    private javax.swing.JPanel jPanelConEmp;
    private javax.swing.JPanel jPanelIngreNuev;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedMaestro;
    private javax.swing.JTextField jTextApellido01;
    private javax.swing.JTextField jTextApellido02;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextEmail1;
    private javax.swing.JTextField jTextNombreEmp;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextPuesto;
    private javax.swing.JTextField jTextaddress;
    private javax.swing.JLabel tituloConsultaEmp;
    // End of variables declaration//GEN-END:variables
}
