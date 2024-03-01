/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Family
 */
public class Login {
    private String Username, Password, Role;
    
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public boolean isAuthenticated() throws FileNotFoundException, IOException, CsvValidationException {
        String filename = "C:\\Users\\Family\\Documents\\NetBeansProjects\\MMDC_proj\\src\\main\\java\\Classes\\Login Accounts.csv";
        try (CSVReader csvreader = new CSVReader(new FileReader(filename))){
            String[] line;

            while((line=csvreader.readNext())!=null){
                if(line[0].equals(Username) && line[1].equals(Password)){
                    Role = line[2];
                    return true;
                } 
            }
        }
        return false;
    }
    public String getRole() {
        return Role;
    }
    
}
