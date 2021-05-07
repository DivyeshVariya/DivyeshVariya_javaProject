/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Add_items extends javax.swing.JFrame {

    public Add_items() {
        initComponents();

        try{

            c = Conn.setConnect();
            statement = c.createStatement();

            String query = "SELECT name FROM `Category`";
            rs = statement.executeQuery(query);

            while(rs.next())
            {
                item_dropdown_category.addItem(rs.getString("name"));
            }

        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                c.close();
            }
            catch(SQLException ex)
            {
              ex.printStackTrace();
            }
        }


    }
    // global variables...
    int item_code;
    String name;
    double price;
    int category_id;
    int Quantity;

    Connection c;
    Statement statement;
    ResultSet rs;
    PreparedStatement pstm = null;
    // functions

    //Sets variable data to text fields....
    void set_fields(int id,String name,int quantity,int category,double price){
        item_txt_id.setText(String.valueOf(id));
        item_txt_name.setText(name);
        item_txt_price.setText(String.valueOf(price));
        item_spinner_qnt.setValue(quantity);
        item_dropdown_category.setSelectedIndex(category);
    }

    // clear every text fields....
    void reset_fields(){
        item_txt_id.setText("");
        item_txt_name.setText("");
        item_txt_price.setText("");
        item_dropdown_category.setSelectedIndex(0);
        item_spinner_qnt.setValue(0);
    }

    // function to get all textfeilds data to database....
    void set_data(String query,int operation){
        // variables for dialog box...
        String[] item_arr = new String[8];
        int countInserted = 0;
        String item_id = item_txt_id.getText();
        String item_name = item_txt_name.getText();
        String item_price = item_txt_price.getText();
        String item_category = item_dropdown_category.getItemAt(item_dropdown_category.getSelectedIndex());
        //String item_category = item_dropdown_category.getSelectedItem()
        Object item_qnt;
        item_qnt = item_spinner_qnt.getValue();

        String op = null;
        // main operation...
        try{

            c=Conn.setConnect();

            // assigning form values to variables..
            item_code = Integer.parseInt(item_txt_id.getText());
            name = item_txt_name.getText();
            Object item_qnt1;
            item_qnt1 = item_spinner_qnt.getValue();
            Quantity = Integer.parseInt(String.valueOf(item_qnt1));
            category_id = item_dropdown_category.getSelectedIndex();
            price = Double.parseDouble(item_txt_price.getText());

            pstm = c.prepareStatement(query);

            // checking the type of operation(insert,update,delete)...
            if (operation== 0){
                pstm.setInt(1, item_code);
                pstm.setString(2, name);
                pstm.setInt(3, Quantity);
                pstm.setInt(4, category_id);
                pstm.setDouble(5, price);
                op="Inserted";
            }
            else if (operation == 1){
                pstm.setString(1, name);
                pstm.setInt(2, Quantity);
                pstm.setInt(3, category_id);
                pstm.setDouble(4, price);
                pstm.setInt(5, item_code);
                op="Updated";
            }
            else if(operation == 2){
                pstm.setInt(1,item_code);
                op="Deleted";
            }


            countInserted = pstm.executeUpdate();
            System.out.println(countInserted+" row affected.");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                c.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        item_arr[0] = item_id;
        item_arr[1] = item_name;
        item_arr[2] = item_price;
        item_arr[4] = String.valueOf(item_qnt);
        item_arr[5] = String.valueOf(item_category);
        //item_arr[6] = item_address;
        item_arr[6] = countInserted + " records "+op+".\n";
        item_arr[7] = "\n "+op+" successful";

        JOptionPane.showMessageDialog(this, item_arr);

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
        item_p1 = new javax.swing.JPanel();
        item_lbl_title = new javax.swing.JLabel();
        item_btn_dashbd = new javax.swing.JButton();
        item_p2 = new javax.swing.JPanel();
        item_lbl_id = new javax.swing.JLabel();
        item_lbl_name = new javax.swing.JLabel();
        item_lbl_Qnt = new javax.swing.JLabel();
        item_lbl_category = new javax.swing.JLabel();
        item_txt_id = new javax.swing.JTextField();
        item_txt_name = new javax.swing.JTextField();
        item_txt_price = new javax.swing.JTextField();
        item_spinner_qnt = new javax.swing.JSpinner();
        item_dropdown_category = new javax.swing.JComboBox<>();
        item_btn_add = new javax.swing.JButton();
        item_btn_edit = new javax.swing.JButton();
        item_btn_delete = new javax.swing.JButton();
        item_btn_reset = new javax.swing.JButton();
        item_lbl_price = new javax.swing.JLabel();
        item_btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        setTitle("Item entry ");
        setBackground(new java.awt.Color(255, 255, 51));
        setName("item_frame"); // NOI18N
        setResizable(false);

        item_p1.setBackground(new java.awt.Color(255, 255, 153));
        item_p1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        item_p1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        item_p1.setName("item_p1"); // NOI18N

        item_lbl_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        item_lbl_title.setText("Item Entry");
        item_lbl_title.setName("item_lbl_title"); // NOI18N

        item_btn_dashbd.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_dashbd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_dashbd.setText("dashboard");
        item_btn_dashbd.setName("item_btn_dashbd"); // NOI18N
        item_btn_dashbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_dashbdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item_p1Layout = new javax.swing.GroupLayout(item_p1);
        item_p1.setLayout(item_p1Layout);
        item_p1Layout.setHorizontalGroup(
            item_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_p1Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(item_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(222, 222, 222)
                .addComponent(item_btn_dashbd)
                .addContainerGap())
        );
        item_p1Layout.setVerticalGroup(
            item_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item_btn_dashbd))
                .addContainerGap())
        );

        item_lbl_title.getAccessibleContext().setAccessibleName("item_lbl_title");

        item_p2.setBackground(new java.awt.Color(255, 255, 204));
        item_p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_p2.setName("item_p3"); // NOI18N

        item_lbl_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_lbl_id.setText("Item Id");
        item_lbl_id.setName("item_lbl_id"); // NOI18N

        item_lbl_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_lbl_name.setText("Item Name");
        item_lbl_name.setName("item_lbl_name"); // NOI18N

        item_lbl_Qnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_lbl_Qnt.setText("Quantity");
        item_lbl_Qnt.setName("item_lbl_Qnt"); // NOI18N

        item_lbl_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_lbl_category.setText("Category");
        item_lbl_category.setName("item_lbl_category"); // NOI18N

        item_txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_txt_id.setName("item_txt_id"); // NOI18N

        item_txt_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_txt_name.setName("item_txt_name"); // NOI18N

        item_txt_price.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_txt_price.setName("item_txt_price"); // NOI18N

        item_spinner_qnt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        item_spinner_qnt.setName("item_spinner_qnt"); // NOI18N

        item_dropdown_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_dropdown_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*create new" }));
        item_dropdown_category.setName("item_dropdown_category"); // NOI18N
        item_dropdown_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_dropdown_categoryActionPerformed(evt);
            }
        });

        item_btn_add.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_add.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_add.setText("Add item");
        item_btn_add.setName("item_btn_add"); // NOI18N
        item_btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_addActionPerformed(evt);
            }
        });

        item_btn_edit.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_edit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_edit.setText("Edit item");
        item_btn_edit.setName("item_btn_edit"); // NOI18N
        item_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_editActionPerformed(evt);
            }
        });

        item_btn_delete.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_delete.setText("Delete item");
        item_btn_delete.setName("item_btn_delete"); // NOI18N
        item_btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_deleteActionPerformed(evt);
            }
        });

        item_btn_reset.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_reset.setText("Reset");
        item_btn_reset.setName("item_btn_reset"); // NOI18N
        item_btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_resetActionPerformed(evt);
            }
        });

        item_lbl_price.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        item_lbl_price.setText("Price");

        item_btn_search.setBackground(new java.awt.Color(255, 204, 102));
        item_btn_search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        item_btn_search.setText("Search");
        item_btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setText("*use id of item to search records then Edit and Delete ");

        javax.swing.GroupLayout item_p2Layout = new javax.swing.GroupLayout(item_p2);
        item_p2.setLayout(item_p2Layout);
        item_p2Layout.setHorizontalGroup(
            item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_p2Layout.createSequentialGroup()
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item_p2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_lbl_id)
                            .addComponent(item_lbl_name)
                            .addComponent(item_lbl_price))
                        .addGap(2, 2, 2)
                        .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_lbl_Qnt)
                            .addComponent(item_lbl_category))
                        .addGap(31, 31, 31))
                    .addGroup(item_p2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(item_btn_reset)
                        .addGap(79, 79, 79)
                        .addComponent(item_btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(item_btn_search)
                        .addGap(69, 69, 69)))
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(item_dropdown_category, 0, 214, Short.MAX_VALUE)
                        .addComponent(item_spinner_qnt))
                    .addGroup(item_p2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(item_btn_edit)
                        .addGap(71, 71, 71)
                        .addComponent(item_btn_delete))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        item_p2Layout.setVerticalGroup(
            item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_p2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_lbl_id)
                    .addComponent(item_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_lbl_Qnt)
                    .addComponent(item_spinner_qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_lbl_name)
                    .addComponent(item_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_lbl_category)
                    .addComponent(item_dropdown_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(item_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_btn_reset)
                    .addComponent(item_btn_add)
                    .addComponent(item_btn_edit)
                    .addComponent(item_btn_delete)
                    .addComponent(item_btn_search))
                .addGap(37, 37, 37))
        );

        item_lbl_id.getAccessibleContext().setAccessibleDescription("");
        item_txt_id.getAccessibleContext().setAccessibleName("Item ID");
        item_txt_name.getAccessibleContext().setAccessibleName("Item Name");
        item_txt_price.getAccessibleContext().setAccessibleName("item price");
        item_spinner_qnt.getAccessibleContext().setAccessibleName("Item Quantity");
        item_dropdown_category.getAccessibleContext().setAccessibleName("Item category");
        item_btn_edit.getAccessibleContext().setAccessibleName("item edit");
        jLabel1.getAccessibleContext().setAccessibleName("*for Edit and Delete use id of item to search ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item_p1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(item_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        item_p1.getAccessibleContext().setAccessibleName("item_p1");
        item_p1.getAccessibleContext().setAccessibleDescription("This panel will be at the top of the page, and it will have Item Page name and few buttons");
        item_p2.getAccessibleContext().setAccessibleName("item_p2");
        item_p2.getAccessibleContext().setAccessibleDescription("this panel will becontaining various form elements");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void item_btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_addActionPerformed
        
            //String sqlInsert = "INSERT INTO item_master(item_code,name,Quantity,category_id,price) VALUES (4,'',90,4,40.0)";
            //String sqlInsert = "INSERT INTO item_master(item_code,name,Quantity,category_id,price) VALUES (item_id1,item_name1,item_qnt2,item_category1,item_price1)";
            String sqlInsert = "INSERT INTO `item_master` (item_code,name,Quantity,category_id,price) VALUES (?,?,?,?,?)";
            set_data(sqlInsert,0);


    }//GEN-LAST:event_item_btn_addActionPerformed

    private void item_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_editActionPerformed
        // TODO add your handling code here:
        String sqlquery = "update `item_master` set name= ?,Quantity = ?,category_id= ?,price= ? where item_code=?";
        set_data(sqlquery,1);
    }//GEN-LAST:event_item_btn_editActionPerformed

    private void item_btn_dashbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_dashbdActionPerformed

        InventoryManagement obj = new InventoryManagement();
        obj.setVisible(true);
        setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_item_btn_dashbdActionPerformed

    private void item_dropdown_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_dropdown_categoryActionPerformed
        // TODO add your handling code here:
        if( item_dropdown_category.getSelectedIndex() == 0 )
        {
            Add_Category obj = new Add_Category();
            obj.setVisible(true);
            //setVisible(false);
        }
    }//GEN-LAST:event_item_dropdown_categoryActionPerformed

    private void item_btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_resetActionPerformed
        // TODO add your handling code here:
        reset_fields();
    }//GEN-LAST:event_item_btn_resetActionPerformed

    private void item_btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_searchActionPerformed


        // main operation...
        try{
            c=Conn.setConnect();

            int id = Integer.parseInt(item_txt_id.getText());
            String query="select * from item_master where item_code=?";
            PreparedStatement psmt = c.prepareStatement(query);
            psmt.setInt(1,id);
            rs = psmt.executeQuery();

            while(rs.next()){
                //temp=temp+1;
                item_code = rs.getInt("item_code");
                category_id = rs.getInt("category_id");
                name = rs.getString("name");
                price=rs.getDouble("price");
                Quantity = rs.getInt("Quantity");


            }

            // Function that fill form from database record data...
            set_fields(item_code, name, Quantity, category_id, price);



        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{c.close();}
            catch(Exception e){e.printStackTrace();}

        }

    }//GEN-LAST:event_item_btn_searchActionPerformed

    private void item_btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btn_deleteActionPerformed
        // TODO add your handling code here:
        String query = "delete from item_master where item_code=?";
        set_data(query,2);
    }//GEN-LAST:event_item_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Add_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_items().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton item_btn_add;
    private javax.swing.JButton item_btn_dashbd;
    private javax.swing.JButton item_btn_delete;
    private javax.swing.JButton item_btn_edit;
    private javax.swing.JButton item_btn_reset;
    private javax.swing.JButton item_btn_search;
    private javax.swing.JComboBox<String> item_dropdown_category;
    private javax.swing.JLabel item_lbl_Qnt;
    private javax.swing.JLabel item_lbl_category;
    private javax.swing.JLabel item_lbl_id;
    private javax.swing.JLabel item_lbl_name;
    private javax.swing.JLabel item_lbl_price;
    private javax.swing.JLabel item_lbl_title;
    private javax.swing.JPanel item_p1;
    private javax.swing.JPanel item_p2;
    private javax.swing.JSpinner item_spinner_qnt;
    private javax.swing.JTextField item_txt_id;
    private javax.swing.JTextField item_txt_name;
    private javax.swing.JTextField item_txt_price;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
