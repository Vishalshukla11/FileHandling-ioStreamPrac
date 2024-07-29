package CSVFILEEXAMPLE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CSVReaderExample{
   
    public static void main(String args[])
    {
        String fileName="data.Csv";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
         {
            String line;
            while ((line=br.readLine())!=null) {
                String[] values= line.split(",");
                for (String value : values) {
                    System.out.println(value + " ");
                    
                }
                System.out.println();
                
            }
            
        } catch (IOException e) {
           e.printStackTrace();
        }

    }

}