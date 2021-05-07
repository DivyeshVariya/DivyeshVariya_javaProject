

package inventorymanagement;


public class InventoryManagement extends javax.swing.JFrame {

    public InventoryManagement() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashbd_top_p1 = new javax.swing.JPanel();
        dashbd_lbl_title = new javax.swing.JLabel();
        dashbd_btn_reg = new javax.swing.JButton();
        dashbd_bottom_p5 = new javax.swing.JPanel();
        dashbd_center_p3 = new javax.swing.JPanel();
        dashbd_lbl_img = new javax.swing.JLabel();
        dashbd_lcenter_p2 = new javax.swing.JPanel();
        dashbd_btn_item = new javax.swing.JButton();
        dashbd_lbl_stock = new javax.swing.JLabel();
        dashbd_rcenter_p4 = new javax.swing.JPanel();
        dashbd_btn_bill = new javax.swing.JButton();
        dashbd_btn_view = new javax.swing.JButton();
        dashbd_lbl_sales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        setResizable(false);

        dashbd_top_p1.setBackground(new java.awt.Color(255, 255, 102));

        dashbd_lbl_title.setFont(new java.awt.Font("Blackadder ITC", 1, 48)); // NOI18N
        dashbd_lbl_title.setText("Inventory Management System");

        dashbd_btn_reg.setText("Registration");
        dashbd_btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashbd_btn_regActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashbd_top_p1Layout = new javax.swing.GroupLayout(dashbd_top_p1);
        dashbd_top_p1.setLayout(dashbd_top_p1Layout);
        dashbd_top_p1Layout.setHorizontalGroup(
            dashbd_top_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_top_p1Layout.createSequentialGroup()
                .addComponent(dashbd_btn_reg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashbd_lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        dashbd_top_p1Layout.setVerticalGroup(
            dashbd_top_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_top_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashbd_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_top_p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashbd_btn_reg))
        );

        dashbd_bottom_p5.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout dashbd_bottom_p5Layout = new javax.swing.GroupLayout(dashbd_bottom_p5);
        dashbd_bottom_p5.setLayout(dashbd_bottom_p5Layout);
        dashbd_bottom_p5Layout.setHorizontalGroup(
            dashbd_bottom_p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dashbd_bottom_p5Layout.setVerticalGroup(
            dashbd_bottom_p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        dashbd_center_p3.setBackground(new java.awt.Color(255, 255, 153));

        dashbd_lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagement/res/dashborad_center_img.png"))); // NOI18N

        javax.swing.GroupLayout dashbd_center_p3Layout = new javax.swing.GroupLayout(dashbd_center_p3);
        dashbd_center_p3.setLayout(dashbd_center_p3Layout);
        dashbd_center_p3Layout.setHorizontalGroup(
            dashbd_center_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_center_p3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(dashbd_lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dashbd_center_p3Layout.setVerticalGroup(
            dashbd_center_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashbd_lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dashbd_lcenter_p2.setBackground(new java.awt.Color(255, 255, 204));

        dashbd_btn_item.setText("Item Entry");
        dashbd_btn_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashbd_btn_itemActionPerformed(evt);
            }
        });

        dashbd_lbl_stock.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        dashbd_lbl_stock.setText("Stock Department");

        javax.swing.GroupLayout dashbd_lcenter_p2Layout = new javax.swing.GroupLayout(dashbd_lcenter_p2);
        dashbd_lcenter_p2.setLayout(dashbd_lcenter_p2Layout);
        dashbd_lcenter_p2Layout.setHorizontalGroup(
            dashbd_lcenter_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashbd_lcenter_p2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(dashbd_btn_item)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_lcenter_p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashbd_lbl_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashbd_lcenter_p2Layout.setVerticalGroup(
            dashbd_lcenter_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashbd_lcenter_p2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(dashbd_lbl_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(dashbd_btn_item)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashbd_rcenter_p4.setBackground(new java.awt.Color(255, 255, 204));

        dashbd_btn_bill.setText("Billing");
        dashbd_btn_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashbd_btn_billActionPerformed(evt);
            }
        });

        dashbd_btn_view.setText("Data view");
        dashbd_btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashbd_btn_viewActionPerformed(evt);
            }
        });

        dashbd_lbl_sales.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dashbd_lbl_sales.setText("Sales Department");

        javax.swing.GroupLayout dashbd_rcenter_p4Layout = new javax.swing.GroupLayout(dashbd_rcenter_p4);
        dashbd_rcenter_p4.setLayout(dashbd_rcenter_p4Layout);
        dashbd_rcenter_p4Layout.setHorizontalGroup(
            dashbd_rcenter_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashbd_rcenter_p4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashbd_rcenter_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dashbd_btn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashbd_btn_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(dashbd_rcenter_p4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dashbd_lbl_sales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashbd_rcenter_p4Layout.setVerticalGroup(
            dashbd_rcenter_p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashbd_rcenter_p4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(dashbd_lbl_sales)
                .addGap(74, 74, 74)
                .addComponent(dashbd_btn_bill)
                .addGap(46, 46, 46)
                .addComponent(dashbd_btn_view)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dashbd_lcenter_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dashbd_center_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashbd_rcenter_p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dashbd_top_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashbd_bottom_p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashbd_top_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashbd_rcenter_p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashbd_lcenter_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashbd_center_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashbd_bottom_p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashbd_btn_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashbd_btn_itemActionPerformed

        Add_items obj = new Add_items();        
        obj.setVisible(true);
        setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_dashbd_btn_itemActionPerformed

    private void dashbd_btn_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashbd_btn_billActionPerformed
        // TODO add your handling code here:
        
        Bill_item obj = new Bill_item();
        obj.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_dashbd_btn_billActionPerformed

    private void dashbd_btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashbd_btn_viewActionPerformed
        // TODO add your handling code here:
        
        viewdata obj = new viewdata();
        obj.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_dashbd_btn_viewActionPerformed

    private void dashbd_btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashbd_btn_regActionPerformed
        // TODO add your handling code here:
        
        Registration obj = new Registration();
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_dashbd_btn_regActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryManagement().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashbd_bottom_p5;
    private javax.swing.JButton dashbd_btn_bill;
    private javax.swing.JButton dashbd_btn_item;
    private javax.swing.JButton dashbd_btn_reg;
    private javax.swing.JButton dashbd_btn_view;
    private javax.swing.JPanel dashbd_center_p3;
    private javax.swing.JLabel dashbd_lbl_img;
    private javax.swing.JLabel dashbd_lbl_sales;
    private javax.swing.JLabel dashbd_lbl_stock;
    private javax.swing.JLabel dashbd_lbl_title;
    private javax.swing.JPanel dashbd_lcenter_p2;
    private javax.swing.JPanel dashbd_rcenter_p4;
    private javax.swing.JPanel dashbd_top_p1;
    // End of variables declaration//GEN-END:variables

}
