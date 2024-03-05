/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class Leave{
    private String EmployeeFirstName, EmployeeLastName, EmployeeId;
    private Date LeaveStart;
    private Date LeaveEnd;
    private String LeaveType;
    private double SickLeaveCredits;
    private double VacationLeaveCredits;
    private double EmergencyLeaveCredits;
    private String LeaveCredits = "C:\\Users\\Family\\Downloads\\Leave Credits.csv";
    private String LeaveRecords = "C:\\Users\\Family\\Downloads\\Leave Records.csv";
    // Setter method for LeaveStart
    public void setLeaveStart(String leaveStart) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        this.LeaveStart = df.parse(leaveStart);
    }

    // Setter method for LeaveEnd
    public void setLeaveEnd(String leaveEnd) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        this.LeaveEnd = df.parse(leaveEnd);
    }

    // Setter method for LeaveType
    public void setLeaveType(String leaveType) {
        this.LeaveType = leaveType;
    }

    // Setter method for SickLeaveCredits
    
    public void setDetails (String FirstName, String LastName, String EmployeeID){
        EmployeeFirstName = FirstName;
        EmployeeLastName = LastName;
        EmployeeId = EmployeeID;
    }
    
    
    public boolean leaveValidity() throws FileNotFoundException, IOException, CsvValidationException {
        try (CSVReader csvReader = new CSVReader(new FileReader(LeaveCredits))) {
            String[] line;

            while ((line = csvReader.readNext()) != null) {
                if (line[0].equals(EmployeeId)) {
                    SickLeaveCredits = Integer.parseInt(line[3]); // Assuming sick leave credits are in column 3
                    EmergencyLeaveCredits = Integer.parseInt(line[4]); // Assuming emergency leave credits are in column 4
                    VacationLeaveCredits = Integer.parseInt(line[5]); // Assuming vacation leave credits are in column 5

                    // Check if any type of leave has remaining credits
                    if (SickLeaveCredits > 0 && LeaveType.equals("Sick")) {
                        SickLeaveCredits--;
                    } else if (EmergencyLeaveCredits > 0 && LeaveType.equals("Emergency")) {
                        EmergencyLeaveCredits--;
                    } else if (VacationLeaveCredits > 0 && LeaveType.equals("Vacation")) {
                        VacationLeaveCredits--;
                    } else {
                        // Display a message indicating the employee is out of leave credits for the selected type
                        JOptionPane.showMessageDialog(null, "You are out of " + LeaveType.toLowerCase() + " leave credits.", "Leave Credits Exhausted", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                    // Write back the updated leave credits to the CSV file
                    UpdateLeaveCredits();
                    JOptionPane.showMessageDialog(null, "Leave filed successfully!", "Leave Credits updated: ", JOptionPane.WARNING_MESSAGE);
                    return true;
                }
            }
        }
        // Employee ID not found in the CSV file
        return false;
    }
    public void RecordLeave() throws IOException {
        boolean fileExists = new File(LeaveRecords).exists();
        try (CSVWriter csvwriter = new CSVWriter(new FileWriter(LeaveRecords, true))) {
            if (!fileExists) {
                // If the file doesn't exist, write the header row
                String[] header = {"EmployeeId", "FirstName", "LastName", "LeaveType", "LeaveStart", "LeaveEnd", "Status"};
                csvwriter.writeNext(header);
            }
            String[] record = {EmployeeId, EmployeeFirstName, EmployeeLastName, LeaveType, LeaveStart.toString(), LeaveEnd.toString(), "Pending"};
            csvwriter.writeNext(record);
        }
    }
    
    public void UpdateLeaveCredits() throws IOException{
        // Read existing leave credits from the CSV file
        List<String[]> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(LeaveCredits))) {
            records = csvReader.readAll();
        } catch (CsvException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Update leave credits for the specific employee
        for (String[] record : records) {
            if (record[0].equals(EmployeeId)) {
                // Update the leave credits columns
                record[3] = String.valueOf(SickLeaveCredits);
                record[4] = String.valueOf(EmergencyLeaveCredits);
                record[5] = String.valueOf(VacationLeaveCredits);
                break;
            }
        }

        // Write the updated leave credits back to the CSV file
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(LeaveCredits))) {
            csvWriter.writeAll(records);
        }
    }
    
    public String getFirstName(){
        return EmployeeFirstName;
    }
    public String getLastName(){
        return EmployeeLastName;
    }
    public String getEmployeeId(){
        return EmployeeId;
    }
}
    

