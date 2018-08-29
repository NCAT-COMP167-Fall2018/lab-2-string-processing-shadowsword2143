/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author morri
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String Firstname;
     String Lastname;
     String Gender;
     int Age;
     String Pnumber;
     String Email;
     
    }
    public static void read(String filename){
        
       File input = new File("records.txt");
       String[] records = new String[100];
        try {
            Scanner read = new Scanner(input);
            int currentIndex = 0;
            while(read.hasNext()){
               String[] liner = read.nextLine().split(",");
               
               String Firstname = liner[0];
               String Lastname = liner[1];
               String Gender = liner[2];
               String Age = liner[3];
               String Pnumber = liner[4];
               String Email = liner[5];
               
               records[currentIndex] = String.format(" ");
               currentIndex++;
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File not found");
        }
    }
}
