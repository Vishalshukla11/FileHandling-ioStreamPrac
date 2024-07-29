package CSVFILEEXAMPLE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class CSVWriterExample{
    public static void main(String args[])
    {
        String fileName="data.csv";
        try (BufferedWriter bw= new BufferedWriter(new FileWriter(fileName)))
        {
            bw.write("Name,Age,Country");
            bw.newLine();
            bw.write("Vishal,24,India");
            bw.newLine();
            bw.write("Bob,30,USA");
            bw.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
}