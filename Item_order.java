/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocks;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Item_order extends javax.swing.JFrame {

    /**
     * Creates new form Item_order
     */
    public Item_order() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        itemord_p1 = new javax.swing.JPanel();
        itemord_lbl_title = new javax.swing.JLabel();
        itemord_btn_dashbd = new javax.swing.JButton();
        itemord_p2 = new javax.swing.JPanel();
        itemord_lbl_splyname = new javax.swing.JLabel();
        itemord_lbl_name = new javax.swing.JLabel();
        itemord_lbl_splyemail = new javax.swing.JLabel();
        itemord_lbl_Qnt = new javax.swing.JLabel();
        itemord_lbl_category = new javax.swing.JLabel();
        itemord_lbl_supplier = new javax.swing.JLabel();
        itemord_lbl_description = new javax.swing.JLabel();
        itemord_txt_splyname = new javax.swing.JTextField();
        itemord_txt_name = new javax.swing.JTextField();
        itemord_txt_price = new javax.swing.JTextField();
        itemord_spinner_qnt = new javax.swing.JSpinner();
        itemord_txt_supplierID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemord_txta_Desc = new javax.swing.JTextArea();
        itemord_dropdown_category = new javax.swing.JComboBox<>();
        itemord_btn_add = new javax.swing.JButton();
        itemord_btn_edit = new javax.swing.JButton();
        itemord_btn_delete = new javax.swing.JButton();
        itemord_btn_reset = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item Order");
        setBackground(new java.awt.Color(255, 255, 51));
        setName("item_frame"); // NOI18N
        setResizable(false);

        itemord_p1.setBackground(new java.awt.Color(255, 255, 153));
        itemord_p1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        itemord_p1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemord_p1.setName("itemord_p1"); // NOI18N

        itemord_lbl_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        itemord_lbl_title.setText("Item Order");
        itemord_lbl_title.setName("itemord_lbl_title"); // NOI18N

        itemord_btn_dashbd.setBackground(new java.awt.Color(255, 204, 102));
        itemord_btn_dashbd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_btn_dashbd.setText("dashboard");
        itemord_btn_dashbd.setName("itemord_btn_dashbd"); // NOI18N
        itemord_btn_dashbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemord_btn_dashbdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemord_p1Layout = new javax.swing.GroupLayout(itemord_p1);
        itemord_p1.setLayout(itemord_p1Layout);
        itemord_p1Layout.setHorizontalGroup(
            itemord_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemord_p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemord_lbl_title)
                .addGap(222, 222, 222)
                .addComponent(itemord_btn_dashbd)
                .addContainerGap())
        );
        itemord_p1Layout.setVerticalGroup(
            itemord_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemord_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemord_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemord_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemord_btn_dashbd))
                .addContainerGap())
        );

        itemord_lbl_title.getAccessibleContext().setAccessibleName("item_lbl_title");

        itemord_p2.setBackground(new java.awt.Color(255, 255, 204));
        itemord_p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemord_p2.setName("item_p3"); // NOI18N

        itemord_lbl_splyname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_splyname.setText("Supplier Name");
        itemord_lbl_splyname.setName("itemord_lbl_splyname"); // NOI18N

        itemord_lbl_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_name.setText("Item Name");
        itemord_lbl_name.setName("itemord_lbl_name"); // NOI18N

        itemord_lbl_splyemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_splyemail.setText("Supplier's Email");
        itemord_lbl_splyemail.setName("itemord_lbl_splyemail"); // NOI18N

        itemord_lbl_Qnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_Qnt.setText("Quantity");
        itemord_lbl_Qnt.setName("itemord_lbl_Qnt"); // NOI18N

        itemord_lbl_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_category.setText("Category");
        itemord_lbl_category.setName("itemord_lbl_category"); // NOI18N

        itemord_lbl_supplier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_supplier.setText("Supplier ID");
        itemord_lbl_supplier.setName("itemord_lbl_supplier"); // NOI18N

        itemord_lbl_description.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_lbl_description.setText("Description");
        itemord_lbl_description.setName("itemord_lbl_description"); // NOI18N

        itemord_txt_splyname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_txt_splyname.setName("itemord_txt_splyname"); // NOI18N

        itemord_txt_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_txt_name.setName("itemord_txt_name"); // NOI18N

        itemord_txt_price.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_txt_price.setName("itemord_txt_price"); // NOI18N

        itemord_spinner_qnt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        itemord_spinner_qnt.setName("itemord_spinner_qnt"); // NOI18N

        itemord_txt_supplierID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_txt_supplierID.setName("itemord_txt_supplierID"); // NOI18N

        itemord_txta_Desc.setColumns(20);
        itemord_txta_Desc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        itemord_txta_Desc.setRows(5);
        itemord_txta_Desc.setName("itemord_txta_Desc"); // NOI18N
        jScrollPane1.setViewportView(itemord_txta_Desc);
        itemord_txta_Desc.getAccessibleContext().setAccessibleName("Item description");

        itemord_dropdown_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemord_dropdown_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Undefined", "Electronics", "Grocery", "Pharmacy", "Medical", "Instrument", "others" }));
        itemord_dropdown_category.setName("itemord_dropdown_category"); // NOI18N

        itemord_btn_add.setBackground(new java.awt.Color(255, 204, 102));
        itemord_btn_add.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_btn_add.setText("Add");
        itemord_btn_add.setName("itemord_btn_add"); // NOI18N
        itemord_btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemord_btn_addActionPerformed(evt);
            }
        });

        itemord_btn_edit.setBackground(new java.awt.Color(255, 204, 102));
        itemord_btn_edit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_btn_edit.setText("Edit");
        itemord_btn_edit.setName("itemord_btn_edit"); // NOI18N
        itemord_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemord_btn_editActionPerformed(evt);
            }
        });

        itemord_btn_delete.setBackground(new java.awt.Color(255, 204, 102));
        itemord_btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_btn_delete.setText("Delete");
        itemord_btn_delete.setName("itemord_btn_delete"); // NOI18N

        itemord_btn_reset.setBackground(new java.awt.Color(255, 204, 102));
        itemord_btn_reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemord_btn_reset.setText("Reset");
        itemord_btn_reset.setName("itemord_btn_reset"); // NOI18N

        javax.swing.GroupLayout itemord_p2Layout = new javax.swing.GroupLayout(itemord_p2);
        itemord_p2.setLayout(itemord_p2Layout);
        itemord_p2Layout.setHorizontalGroup(
            itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemord_p2Layout.createSequentialGroup()
                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemord_p2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(itemord_lbl_name)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemord_p2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemord_lbl_splyname)
                            .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(itemord_lbl_splyemail)
                                .addComponent(itemord_lbl_supplier)
                                .addComponent(itemord_btn_reset)))))
                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemord_p2Layout.createSequentialGroup()
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(itemord_p2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(itemord_lbl_Qnt)
                                    .addComponent(itemord_lbl_category)
                                    .addComponent(itemord_lbl_description)))
                            .addGroup(itemord_p2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(itemord_btn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(itemord_btn_edit)))
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(itemord_p2Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itemord_dropdown_category, 0, 214, Short.MAX_VALUE)
                                        .addComponent(itemord_spinner_qnt)))
                                .addGroup(itemord_p2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemord_p2Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(itemord_btn_delete)))
                        .addGap(81, 81, 81))
                    .addGroup(itemord_p2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemord_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemord_txt_splyname, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemord_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemord_txt_supplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        itemord_p2Layout.setVerticalGroup(
            itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemord_p2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemord_lbl_Qnt)
                    .addComponent(itemord_spinner_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemord_lbl_name)
                    .addComponent(itemord_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemord_lbl_category)
                    .addComponent(itemord_dropdown_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemord_lbl_splyname)
                    .addComponent(itemord_txt_splyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemord_p2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(itemord_p2Layout.createSequentialGroup()
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(itemord_p2Layout.createSequentialGroup()
                                .addComponent(itemord_lbl_description)
                                .addGap(49, 49, 49))
                            .addGroup(itemord_p2Layout.createSequentialGroup()
                                .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemord_txt_supplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemord_lbl_supplier))
                                .addGap(47, 47, 47)))
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemord_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemord_lbl_splyemail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(itemord_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemord_btn_reset)
                            .addComponent(itemord_btn_add)
                            .addComponent(itemord_btn_edit)
                            .addComponent(itemord_btn_delete))
                        .addGap(37, 37, 37))))
        );

        itemord_lbl_splyname.getAccessibleContext().setAccessibleDescription("");
        itemord_txt_splyname.getAccessibleContext().setAccessibleName("Item ID");
        itemord_txt_name.getAccessibleContext().setAccessibleName("Item Name");
        itemord_txt_price.getAccessibleContext().setAccessibleName("item price");
        itemord_spinner_qnt.getAccessibleContext().setAccessibleName("Item Quantity");
        itemord_txt_supplierID.getAccessibleContext().setAccessibleName("Item_SupplierID");
        itemord_dropdown_category.getAccessibleContext().setAccessibleName("Item category");
        itemord_btn_edit.getAccessibleContext().setAccessibleName("item edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemord_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemord_p1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(itemord_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemord_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        itemord_p1.getAccessibleContext().setAccessibleName("item_p1");
        itemord_p1.getAccessibleContext().setAccessibleDescription("This panel will be at the top of the page, and it will have Item Page name and few buttons");
        itemord_p2.getAccessibleContext().setAccessibleName("item_p2");
        itemord_p2.getAccessibleContext().setAccessibleDescription("this panel will becontaining various form elements");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemord_btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemord_btn_addActionPerformed
        // TODO add your handling code here:
        
        String[] itemord_arr = new String[8];

        String itemord_id = itemord_txt_splyname.getText();
        String itemord_name = itemord_txt_name.getText();
        String itemord_price = itemord_txt_price.getText();
        String itemord_email = itemord_txt_supplierID.getText();
        Object itemord_category = itemord_dropdown_category.getSelectedObjects();
        //String itemord_category = item_dropdown_category.getSelectedItem()
        String itemord_address = itemord_txta_Desc.getText();
        Object itemord_qnt;
        itemord_qnt = itemord_spinner_qnt.getValue();

        itemord_arr[0] = itemord_id;
        itemord_arr[1] = itemord_name;
        itemord_arr[2] = itemord_price;
        itemord_arr[3] = itemord_email;
        itemord_arr[4] = String.valueOf(itemord_qnt);
        itemord_arr[5] = String.valueOf(itemord_category);
        itemord_arr[6] = itemord_address;
        itemord_arr[7] = "\n Records inserted successfully";
        
        
        JOptionPane.showMessageDialog(this, itemord_arr);
        
        
        
        
    }//GEN-LAST:event_itemord_btn_addActionPerformed

    private void itemord_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemord_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemord_btn_editActionPerformed

    private void itemord_btn_dashbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemord_btn_dashbdActionPerformed

        dashboard obj = new dashboard();
        obj.setVisible(true);
        setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_itemord_btn_dashbdActionPerformed

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
            java.util.logging.Logger.getLogger(Item_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_order().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton itemord_btn_add;
    private javax.swing.JButton itemord_btn_dashbd;
    private javax.swing.JButton itemord_btn_delete;
    private javax.swing.JButton itemord_btn_edit;
    private javax.swing.JButton itemord_btn_reset;
    private javax.swing.JComboBox<String> itemord_dropdown_category;
    private javax.swing.JLabel itemord_lbl_Qnt;
    private javax.swing.JLabel itemord_lbl_category;
    private javax.swing.JLabel itemord_lbl_description;
    private javax.swing.JLabel itemord_lbl_name;
    private javax.swing.JLabel itemord_lbl_splyemail;
    private javax.swing.JLabel itemord_lbl_splyname;
    private javax.swing.JLabel itemord_lbl_supplier;
    private javax.swing.JLabel itemord_lbl_title;
    private javax.swing.JPanel itemord_p1;
    private javax.swing.JPanel itemord_p2;
    private javax.swing.JSpinner itemord_spinner_qnt;
    private javax.swing.JTextField itemord_txt_name;
    private javax.swing.JTextField itemord_txt_price;
    private javax.swing.JTextField itemord_txt_splyname;
    private javax.swing.JTextField itemord_txt_supplierID;
    private javax.swing.JTextArea itemord_txta_Desc;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
