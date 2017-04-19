package lab7;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab7 {
    public static void main(String[] args) throws FileNotFoundException {    
         FileInputStream fstream = new FileInputStream("C:\\Users\\arashid.bese14seecs\\Downloads");
         DataInputStream in = new DataInputStream(fstream);
         BufferedReader br = new BufferedReader(new InputStreamReader(in));
         
         String strLine;
            
    }   
}
