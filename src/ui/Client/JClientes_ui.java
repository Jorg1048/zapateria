/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Client;

import datos.Cliente;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import negocios.ClientesBL;
import ui.JAppmain_ui;
import ui.repair.JAddReparClient;
import ui.repair.jListRepairClient;

/**
 *
 * @author REBOOTSYSTEM
 */
public class JClientes_ui extends javax.swing.JInternalFrame {

    public static JDesktopPane dskApp = null;
    private int cliente_id = 0;
    public static JAppmain_ui app = null;

    /**
     * Creates new form JClientes_ui
     *
     * @param app
     */
    public JClientes_ui(JAppmain_ui app) {
        this.app = app;
        initComponents();
        disableButtons();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDelete = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnRefresh = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jPanel3 = new javax.swing.JPanel();
        btnListRepairsClient = new javax.swing.JButton();
        btnNewRepair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user_32.png"))); // NOI18N

        jToolBar1.setRollover(true);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user_add_24.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.setToolTipText("Crea un nuevo cliente");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNew);
        jToolBar1.add(jSeparator1);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user_edit_24.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setToolTipText("Edita un cliente");
        btnEdit.setFocusable(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEdit);
        jToolBar1.add(jSeparator2);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user_delete_24.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setToolTipText("Elimina un cliente");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDelete);
        jToolBar1.add(jSeparator3);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/refresh_24.png"))); // NOI18N
        btnRefresh.setText("Actualizar");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRefresh);
        jToolBar1.add(jSeparator4);

        jPanel3.setName("pReparaciones"); // NOI18N

        btnListRepairsClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/footprint_24.png"))); // NOI18N
        btnListRepairsClient.setText("Lista");
        btnListRepairsClient.setDefaultCapable(false);
        btnListRepairsClient.setFocusable(false);
        btnListRepairsClient.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnListRepairsClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListRepairsClient.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnListRepairsClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListRepairsClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListRepairsClientActionPerformed(evt);
            }
        });

        btnNewRepair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/shoe_add_24.png"))); // NOI18N
        btnNewRepair.setText("Nueva");
        btnNewRepair.setDefaultCapable(false);
        btnNewRepair.setFocusPainted(false);
        btnNewRepair.setFocusable(false);
        btnNewRepair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewRepair.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnNewRepair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRepairActionPerformed(evt);
            }
        });

        jLabel2.setText("Reparaciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnListRepairsClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListRepairsClient)
                    .addComponent(btnNewRepair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jToolBar1.add(jPanel3);

        jPanel2.setName("pBuscar"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(746, 30));

        jLabel1.setText("Buscar:");

        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblClients.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblClients.getTableHeader().setReorderingAllowed(false);
        tblClients.setUpdateSelectionOnSort(false);
        tblClients.setVerifyInputWhenFocusTarget(false);
        tblClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClients);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento para ejecutar el formulario de nuevo cliente pasa un parametro que
     * es la instancia de su formulario padre
     *
     * @param evt
     */
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        JAddClient addClient = new JAddClient(this);
        this.dskApp.add(addClient);
        addClient.show();
    }//GEN-LAST:event_btnNewActionPerformed

    /**
     * Evento para el boton de refrescar, actualiza el listado de los clientes
     *
     * @param evt
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        fillTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * Evento del click en la tabla al seleccionar un cliente verifica si se ha
     * seleccionado una fila y activa los botones correspondientes
     *
     * @param evt
     */
    private void tblClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientsMouseClicked

        int row = this.tblClients.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
            disableButtons();
        } else {
            cliente_id = (int) this.tblClients.getValueAt(row, 0);
            enabledButtons();
        }

    }//GEN-LAST:event_tblClientsMouseClicked

    /**
     * Evento del boton de borrar un cliente.
     *
     * @param evt
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (cliente_id > 0) {
            try {
                int result = JOptionPane.showConfirmDialog(rootPane, "Desea borrar el cliente?", "Borrar Cliente", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (result == 0) {
                    ClientesBL.delete(cliente_id);
                    fillTable();
                    disableButtons();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Evento para actualizar un cliente.
     *
     * @param evt
     */
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (cliente_id > 0) {
            try {
                Cliente cliente = ClientesBL.findById(cliente_id);
                JEditClient editCliente = new JEditClient(this, cliente);
                this.dskApp.add(editCliente);
                editCliente.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    /**
     * Evento del campo para buscar clientes, se ejecuta cada ves que se oprime
     * una tecla en el campo de busqueda.
     *
     * @param evt
     */
    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased

        if (this.txtBuscarCliente.getText().length() > 0) {
            buscarCliente(this.txtBuscarCliente.getText());
        } else {
            fillTable();
        }

    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    /**
     * Evento del boton nueva reparación ejecuta el formulario de reparación y
     * pasa los datos del cliente.
     *
     * @param evt
     */
    private void btnNewRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRepairActionPerformed

        if (cliente_id != 0) {
            try {
                Cliente cliente = ClientesBL.findById(cliente_id);
                JAddReparClient repairClient = new JAddReparClient(this, cliente_id, this.app);
                this.dskApp.add(repairClient);
                repairClient.show();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnNewRepairActionPerformed

    private void btnListRepairsClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListRepairsClientActionPerformed
        try {
            // Si hay un cliente seleccionado
            if (this.cliente_id != 0) {
                Cliente cliente = ClientesBL.findById(this.cliente_id);
                jListRepairClient listRepair = new jListRepairClient(cliente, this.app);
                this.dskApp.add(listRepair);
                listRepair.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListRepairsClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnListRepairsClient;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNewRepair;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblClients;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables

    /**
     * Llena la tabla con los valores de los clientes en la base de datos.
     *
     */
    public void fillTable() {

        try {
            DefaultTableModel modelClients;

            modelClients = ClientesBL.listar();
            this.tblClients.setModel(modelClients);
            TableColumnModel columnModel = tblClients.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(3).setPreferredWidth(250);
            columnModel.getColumn(4).setPreferredWidth(250);
            columnModel.getColumn(5).setPreferredWidth(250);
            disableButtons();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar la lista de clientes " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Desactiva los botones de editar o eliminar clientes.
     */
    private void disableButtons() {
        // Si no esta seleccionado un registro es mejor desactivar los botones. fyg
        this.btnEdit.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnNewRepair.setEnabled(false);
        btnListRepairsClient.setEnabled(false);
    }

    /**
     * Activa los botones de borrar o editar cliente
     */
    private void enabledButtons() {
        this.btnEdit.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnNewRepair.setEnabled(true);
        btnListRepairsClient.setEnabled(true);
    }

    /**
     * Busca un texto en la base de datos de los clientes por identificacion,
     * nombre completo, telefono o dirección.
     *
     * @param text
     */
    private void buscarCliente(String text) {

        try {

            DefaultTableModel modelClients;

            modelClients = ClientesBL.buscarCliente(text);
            this.tblClients.setModel(modelClients);

            // Se configuran el ancho de las columnas
            TableColumnModel columnModel = tblClients.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(150);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(3).setPreferredWidth(250);
            columnModel.getColumn(4).setPreferredWidth(250);
            columnModel.getColumn(5).setPreferredWidth(250);

            // Desactivamos los botones
            disableButtons();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al cargar la lista de clientes " + e.getMessage());
        }

    }

}
