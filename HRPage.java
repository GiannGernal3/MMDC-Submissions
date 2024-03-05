package Forms;

import Classes.Leave;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ppagd
 */
public class HRPage extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
     private Leave leave;


    /**
     * Creates new form RequestHandling
     */
    public HRPage() {
        initComponents();
        leave = new Leave();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LeaveRequestsButton = new javax.swing.JButton();
        OvertimeRequestsButton = new javax.swing.JButton();
        EmployeeRecordButton = new javax.swing.JButton();
        AddRecordButton = new javax.swing.JButton();
        DeleteRecordButton = new javax.swing.JButton();
        UpdateRecordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ApproveLeaveButton = new javax.swing.JButton();
        DeclineLeaveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeeInformationTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setBackground(new java.awt.Color(0, 0, 102));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Return");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        LeaveRequestsButton.setBackground(new java.awt.Color(0, 0, 102));
        LeaveRequestsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LeaveRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        LeaveRequestsButton.setText("Leave Requests");
        LeaveRequestsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LeaveRequestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeaveRequestsButtonMouseClicked(evt);
            }
        });
        LeaveRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveRequestsButtonActionPerformed(evt);
            }
        });

        OvertimeRequestsButton.setBackground(new java.awt.Color(0, 0, 102));
        OvertimeRequestsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OvertimeRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        OvertimeRequestsButton.setText("Overtime Requests");
        OvertimeRequestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OvertimeRequestsButtonMouseClicked(evt);
            }
        });
        OvertimeRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertimeRequestsButtonActionPerformed(evt);
            }
        });

        EmployeeRecordButton.setBackground(new java.awt.Color(0, 0, 102));
        EmployeeRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmployeeRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeRecordButton.setText("Manage Record");
        EmployeeRecordButton.setToolTipText("");
        EmployeeRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeRecordButtonMouseClicked(evt);
            }
        });
        EmployeeRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRecordButtonActionPerformed(evt);
            }
        });

        AddRecordButton.setBackground(new java.awt.Color(0, 0, 102));
        AddRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        AddRecordButton.setText("Add Record");
        AddRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DeleteRecordButton.setBackground(new java.awt.Color(0, 0, 102));
        DeleteRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteRecordButton.setText("Delete Record");

        UpdateRecordButton.setBackground(new java.awt.Color(0, 0, 102));
        UpdateRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateRecordButton.setText("Update Record");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeRecordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OvertimeRequestsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeaveRequestsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LeaveRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OvertimeRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmployeeRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Request Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 25, -1, -1));

        ApproveLeaveButton.setBackground(new java.awt.Color(0, 0, 102));
        ApproveLeaveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ApproveLeaveButton.setForeground(new java.awt.Color(255, 255, 255));
        ApproveLeaveButton.setText("Approve");
        ApproveLeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveLeaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ApproveLeaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 408, -1, -1));

        DeclineLeaveButton.setBackground(new java.awt.Color(0, 0, 102));
        DeclineLeaveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeclineLeaveButton.setForeground(new java.awt.Color(255, 255, 255));
        DeclineLeaveButton.setText("Decline");
        DeclineLeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclineLeaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeclineLeaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 408, -1, -1));

        EmployeeInformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(EmployeeInformationTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 66, 462, 324));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void EmployeeRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeRecordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeRecordButtonActionPerformed

    private void ApproveLeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveLeaveButtonActionPerformed
        int selectedIndex = EmployeeInformationTable.getSelectedRow();
        String EmployeeID = String.valueOf(EmployeeInformationTable.getValueAt(selectedIndex, 0));
        String status = String.valueOf(EmployeeInformationTable.getValueAt(selectedIndex, 6));
        if (status.equalsIgnoreCase("Pending")){
            String LeaveType = "";
            long daysDiff = 0;
            DefaultTableModel dtm = (DefaultTableModel) EmployeeInformationTable.getModel();
            List<String[]> record = new ArrayList<>();
            try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Downloads\\Leave Records.csv"))) {
                String[] rowData;
                int rowCount = 0;
                while ((rowData = reader.readNext()) != null) {
                    if(rowCount == selectedIndex+1){
                        LeaveType = rowData[3];
                        DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                        Date LeaveStartDate = df.parse(rowData[4]);
                        Date LeaveEndDate = df.parse(rowData[5]);
                        long timeDiff = Math.abs(LeaveEndDate.getTime() - LeaveStartDate.getTime());
                        daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS) + 1;

                        rowData[6] = "Approved";    
                    }
                    rowCount++;
                    record.add(rowData);
                }
            dtm.setValueAt("Approved", selectedIndex, 6);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CsvValidationException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Update the CSV File
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("Leave Record.csv"));
                for(String[] row : record){
                    writer.writeNext(row);
                    writer.flush();
                }
            } catch (IOException ex) {
                    Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            }

            List<String[]> credits = new ArrayList<>();
            try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Downloads\\Leave Credits.csv"))) {
                String[] rowData;
                while ((rowData = reader.readNext()) != null) {
                    credits.add(rowData);
                    if(rowData[0].equals(EmployeeID)){
                        int SickLeaveCredits = Integer.parseInt(rowData[3]);
                        int EmergencyLeaveCredits = Integer.parseInt(rowData[4]);
                        int VacationLeaveCredits = Integer.parseInt(rowData[5]);

                        if (LeaveType.equalsIgnoreCase("Sick")){ 
                            if (SickLeaveCredits <= 0 || daysDiff > SickLeaveCredits){
                            } else{ 
                                SickLeaveCredits -= daysDiff; 
                                rowData[3] = String.valueOf(SickLeaveCredits);
                            }
                        } else if (LeaveType.equalsIgnoreCase("Emergency")){
                            if (EmergencyLeaveCredits <=0 || daysDiff > EmergencyLeaveCredits){
                            } else {
                                EmergencyLeaveCredits -= daysDiff;
                                rowData[4] = String.valueOf(EmergencyLeaveCredits);
                            }
                        } else if (LeaveType.equalsIgnoreCase("Vacation")){
                            if (VacationLeaveCredits <= 0 || daysDiff > VacationLeaveCredits){
                            } else {
                                VacationLeaveCredits -= daysDiff;
                                rowData[5] = String.valueOf(VacationLeaveCredits);
                            }
                        }
                    }
                }

                credits.add(rowData);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CsvValidationException ex) {
                Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Update the CSV File
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Family\\Downloads\\Leave Credits.csv"));
                for(String[] row : credits){
                    writer.writeNext(row);
                    writer.flush();
                }
            } catch (IOException ex) {
                    Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_ApproveLeaveButtonActionPerformed

    private void DeclineLeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclineLeaveButtonActionPerformed
        int selectedIndex = EmployeeInformationTable.getSelectedRow();
        String EmployeeID = String.valueOf(EmployeeInformationTable.getValueAt(selectedIndex, 0));
        String status = String.valueOf(EmployeeInformationTable.getValueAt(selectedIndex, 6));
        if (status.equalsIgnoreCase("Pending")){
            DefaultTableModel dtm = (DefaultTableModel) EmployeeInformationTable.getModel();
            List<String[]> record = new ArrayList<>();
            try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Downloads\\Leave Records.csv"))) {
                String[] rowData;
                int rowCount = 0;
                while ((rowData = reader.readNext()) != null) {
                    if(rowCount == selectedIndex+1) {
                        rowData[6] = "Declined";    
                    }
                    rowCount++;
                    record.add(rowData);
                }
            dtm.setValueAt("Declined", selectedIndex, 6);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CsvValidationException ex) {
                Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Family\\Downloads\\Leave Records.csv"));
                for(String[] row : record){
                    writer.writeNext(row);
                    writer.flush();
                }
            } catch (IOException ex) {
                    Logger.getLogger(LeavePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DeclineLeaveButtonActionPerformed
    private void LeaveRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveRequestsButtonActionPerformed
    
    }//GEN-LAST:event_LeaveRequestsButtonActionPerformed

    private void LeaveRequestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveRequestsButtonMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) EmployeeInformationTable.getModel();
        dtm.setRowCount(0);
        List<String[]> rows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Downloads\\Leave Records.csv"))) {
            String[] rowData;
            String[] header = reader.readNext();
                dtm.setColumnIdentifiers(header);
            while ((rowData = reader.readNext()) != null) {
                dtm.addRow(rowData);
                rows.add(rowData);
            }
            EmployeeInformationTable.repaint();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LeaveRequestsButtonMouseClicked

    private void OvertimeRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertimeRequestsButtonActionPerformed

    }//GEN-LAST:event_OvertimeRequestsButtonActionPerformed

    private void OvertimeRequestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OvertimeRequestsButtonMouseClicked
       DefaultTableModel dtm = (DefaultTableModel) EmployeeInformationTable.getModel();
        dtm.setRowCount(0);
        List<String[]> rows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Downloads\\Overtime Records.csv"))) {
            String[] rowData;
            String[] header = reader.readNext();
                dtm.setColumnIdentifiers(header);
            while ((rowData = reader.readNext()) != null) {
                dtm.addRow(rowData);
                rows.add(rowData);
            }
            EmployeeInformationTable.repaint();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_OvertimeRequestsButtonMouseClicked

    private void EmployeeRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeRecordButtonMouseClicked
       DefaultTableModel dtm = (DefaultTableModel) EmployeeInformationTable.getModel();
        dtm.setRowCount(0);
        List<String[]> rows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Family\\Documents\\NetBeansProjects\\MMDC_proj\\Object-Oriented Programming Milestone 2\\MotorPH Employee Data.csv"))) {
            String[] rowData;
            String[] header = reader.readNext();
                dtm.setColumnIdentifiers(header);
            while ((rowData = reader.readNext()) != null) {
                dtm.addRow(rowData);
                rows.add(rowData);
            }
            EmployeeInformationTable.repaint();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(HRPage.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeRecordButtonMouseClicked
    
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
            java.util.logging.Logger.getLogger(HRPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordButton;
    private javax.swing.JButton ApproveLeaveButton;
    private javax.swing.JButton DeclineLeaveButton;
    private javax.swing.JButton DeleteRecordButton;
    private javax.swing.JTable EmployeeInformationTable;
    private javax.swing.JButton EmployeeRecordButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LeaveRequestsButton;
    private javax.swing.JButton OvertimeRequestsButton;
    private javax.swing.JButton UpdateRecordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
