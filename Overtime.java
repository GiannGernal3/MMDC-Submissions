/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Family
 */
public class Overtime {
    private String EmployeeFirstName, EmployeeLastName, EmployeeId;
    private Date OvertimeDay;
    private double Hours;
    String OvertimeRecords = ("C:\\Users\\Family\\Downloads\\Overtime Records.csv");
    
    public void setEmployeeDetails(String employeeid, String employeefirstname, String employeelastname){
        this.EmployeeId= employeeid;
        this.EmployeeFirstName = employeefirstname;
        this.EmployeeLastName = employeelastname;
    }
    public void setOvertimeDay(String overtimeday) throws IOException, ParseException{
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        this.OvertimeDay = df.parse(overtimeday);
    }
    
    public void setHours(Double Hours){
        this.Hours = Hours;
    }
    
    public void RecordOvertime() throws IOException {
        boolean fileExists = new File(OvertimeRecords).exists();
        try (CSVWriter csvwriter = new CSVWriter(new FileWriter(OvertimeRecords, true))) {
            if (!fileExists) {
                // If the file doesn't exist, write the header row
                String[] header = {"EmployeeID", "FirstName", "LastName", "LeaveType", "LeaveStart", "LeaveEnd", "Status"};
                csvwriter.writeNext(header);
                csvwriter.flush(); // Ensure header is written before appending data
            }
            String[] record = {EmployeeId, EmployeeFirstName, EmployeeLastName, OvertimeDay.toString(), String.valueOf(Hours), "Pending"};
            csvwriter.writeNext(record);
        }
    }
}
