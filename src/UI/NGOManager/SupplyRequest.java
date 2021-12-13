/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NGOManager;

import UI.EventMakerWorkArea.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.EventMaker.EventMaker;
import Business.Organization.EventMakerOrganization;
import Business.Organization.Organization;
import Business.Provider.Provider;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderWorkRequest;
import Business.WorkQueue.VictimWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ymayank97
 */
public class SupplyRequest extends javax.swing.JPanel {

    /**
     * Creates new form EventMakerWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private Provider p;
    
    public SupplyRequest(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=(Organization)organization;
        this.enterprise=enterprise;
        this.system=system;

        populateTableNGOWorkQueue();
    }

    public void populateTableNGOWorkQueue()
    {
      DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        
        model.setRowCount(0);
        
       
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof ProviderWorkRequest){ 
            Object[] row = new Object[10];
            row[0] = ((ProviderWorkRequest) work).getRtype();
            row[1] = ((ProviderWorkRequest) work).getReq();
            row[2] = ((ProviderWorkRequest) work).getQuantity();
            row[3] = work;
            row[4] = work.getSender();
            
            
            model.addRow(row);
           }
        }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtReq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQnt = new javax.swing.JTextField();
        comboType = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnBarChart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 235, 255));

        jPanel1.setBackground(new java.awt.Color(113, 88, 205));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supply Request");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        tblReq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirement", "Quantity", "Status", "Source"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReq);
        if (tblReq.getColumnModel().getColumnCount() > 0) {
            tblReq.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Request", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Type");

        txtReq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtReq.setForeground(new java.awt.Color(153, 0, 153));
        txtReq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReqKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Requirement");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Quantity");

        txtQnt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtQnt.setForeground(new java.awt.Color(153, 0, 153));
        txtQnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQntKeyTyped(evt);
            }
        });

        comboType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboType.setForeground(new java.awt.Color(153, 0, 153));
        comboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Food", "Clothes", "Medicine", "Education" }));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(153, 0, 153));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReq, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReq, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnBarChart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBarChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/NGOManager/research (1).png"))); // NOI18N
        btnBarChart.setBorderPainted(false);
        btnBarChart.setContentAreaFilled(false);
        btnBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/CommunityEnterprise/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBarChart)
                            .addComponent(btnBack))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try{ 
        String rType = comboType.getSelectedItem().toString();
        String req =   txtReq.getText();
        int quantity = Integer.parseInt(txtQnt.getText());
        if(rType.equals("") || rType.isEmpty() && req.equals("") || req.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter valid request");
            return;
        }
        
        ProviderWorkRequest rqst = new ProviderWorkRequest();
        
        rqst.setRtype(rType);
        rqst.setReq(req);
        rqst.setQuantity(quantity);
        rqst.setStatus("Requested");
        rqst.setSender(account);
        organization.getWorkQueue().getWorkRequestList().add(rqst);
        account.getWorkQueue().getWorkRequestList().add(rqst);
        system.getWorkQueue().getWorkRequestList().add(rqst);
     
        
        populateTableNGOWorkQueue();
        
        txtReq.setText("");
        txtQnt.setText("");
        }
       
        catch(NumberFormatException e){}
        

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        
        int b=0;
        int c=0;
        int m=0;
        int n=0;
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof ProviderWorkRequest)
           {
              
              if(((ProviderWorkRequest) work).getRtype().equals("Food")){
                  b=b+1;
              }
              if(((ProviderWorkRequest) work).getRtype().equals("Clothes")){
                  c=c+1;
              }
              if(((ProviderWorkRequest) work).getRtype().equals("Medicine")){
                  m=m+1;
              }
              if(((ProviderWorkRequest) work).getRtype().equals("Education")){
                  n=n+1;
              }
           }
        }
           d.setValue(b, "Request Type","Food");
           d.setValue(c, "Request Type","Clothes");
           d.setValue(m, "Request Type","Medicine");
           d.setValue(n, "Request Type","Education"); 
           
           
           JFreeChart chart = ChartFactory.createBarChart("Request Fulfilled", "Request Type", "type", d, PlotOrientation.VERTICAL, false, true, false);
           CategoryPlot p = chart.getCategoryPlot();
           p.setRangeGridlinePaint(Color.black);
           ChartFrame f = new ChartFrame("Request Analysis",chart);
           f.setVisible(true);
           f.setSize(500,400);
    }//GEN-LAST:event_btnBarChartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtReqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReqKeyTyped
        // TODO add your handling code here:
        char typedReq = evt.getKeyChar();
        if(!Character.isAlphabetic(typedReq) && !Character.isWhitespace(typedReq)){
            evt.consume();
        }
        //Restrict the length to 256 
        if(txtReq.getText().length() > 255){
                evt.consume();
        }
    }//GEN-LAST:event_txtReqKeyTyped

    private void txtQntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntKeyTyped
        // TODO add your handling code here:
        char typedQnt = evt.getKeyChar();
        if(!Character.isDigit(typedQnt)){
            evt.consume();
        }
        //Restrict the length to 5 
        if(txtQnt.getText().length() > 4){
                evt.consume();
        }
    }//GEN-LAST:event_txtQntKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBarChart;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReq;
    private javax.swing.JTextField txtQnt;
    private javax.swing.JTextField txtReq;
    // End of variables declaration//GEN-END:variables
}
